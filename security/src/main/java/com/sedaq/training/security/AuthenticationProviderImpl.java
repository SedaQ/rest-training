package com.sedaq.training.security;

import com.sedaq.training.api.dto.PersonAuthDto;
import com.sedaq.training.service.UserAuthenticateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Pavel Seda
 */
@Component
public class AuthenticationProviderImpl implements AuthenticationProvider {

    @Autowired
    @Qualifier("proprietaryUserDetailsService")
    private UserDetailsService userDetailsService;
    @Autowired
    private UserAuthenticateService userAuthenticateService;

    @Override
    public Authentication authenticate(Authentication auth) throws AuthenticationException {
        String email = auth.getName();
        String pwd = auth.getCredentials().toString();

        PersonAuthDto personAuthDto = new PersonAuthDto();
        personAuthDto.setEmail(email);
        personAuthDto.setPassword(pwd);

        UserDetails userDetails = userDetailsService.loadUserByUsername(email);
        if (userDetails == null) throw new UsernameNotFoundException("Provide valid email: " + email);

        if (!userAuthenticateService.authenticate(personAuthDto, userDetails)) {
            throw new BadCredentialsException("Provide valid email or password");
        }

        List<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList("USER");
        return new UsernamePasswordAuthenticationToken(email, pwd, authorities);
    }

    @Override
    public boolean supports(Class<?> auth) {
        return true;
    }

}
