package com.sedaq.training.facade;

import com.querydsl.core.types.Predicate;
import com.sedaq.training.api.PageResultResource;
import com.sedaq.training.api.dto.MeetingCreateDTO;
import com.sedaq.training.api.dto.MeetingDTO;
import com.sedaq.training.persistence.model.Meeting;
import com.sedaq.training.annotations.transactions.TransactionalRO;
import com.sedaq.training.annotations.transactions.TransactionalWO;
import com.sedaq.training.exceptions.FacadeLayerException;
import com.sedaq.training.exceptions.ServiceLayerException;
import com.sedaq.training.service.MeetingService;
import com.sedaq.training.mapping.modelmapper.BeanMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author Pavel Šeda
 */
@Service
@Transactional
public class MeetingFacade {

    private MeetingService meetingService;
    private BeanMapping beanMapping;

    @Autowired
    public MeetingFacade(MeetingService meetingService, BeanMapping beanMapping) {
        this.meetingService = meetingService;
        this.beanMapping = beanMapping;
    }

    @TransactionalRO
    public MeetingDTO findById(Long id) {
        try {
            Optional<Meeting> meetingOpt = meetingService.findById(id);
            Meeting meeting = meetingOpt
                    .orElseThrow(() -> new ServiceLayerException("Meeting with this id is not found"));
            return beanMapping.mapTo(meeting, MeetingDTO.class);
        } catch (NullPointerException ex) {
            throw new FacadeLayerException("Given User ID is null.");
        } catch (ServiceLayerException ex) {
            throw new FacadeLayerException(ex);
        }
    }

    @TransactionalRO
    public PageResultResource<MeetingDTO> findAll(Predicate predicate, Pageable pageable) {
        try {
            return beanMapping.mapToPageResource(meetingService.findAll(predicate, pageable), MeetingDTO.class);
        } catch (ServiceLayerException ex) {
            throw new FacadeLayerException(ex);
        }
    }

    @TransactionalWO
    public MeetingCreateDTO create(MeetingCreateDTO meetingDTO) {
        try {
            meetingService.create(beanMapping.mapTo(meetingDTO, Meeting.class));
            return meetingDTO;
        } catch (ServiceLayerException ex) {
            throw new FacadeLayerException(ex);
        }
    }

    @TransactionalWO
    public MeetingDTO update(MeetingDTO meetingDTO) {
        try {
            meetingService.update(beanMapping.mapTo(meetingDTO, Meeting.class));
            return meetingDTO;
        } catch (ServiceLayerException ex) {
            throw new FacadeLayerException(ex);
        }
    }

    @TransactionalWO
    public void delete(MeetingDTO meetingDTO) {
        try {
            meetingService.delete(beanMapping.mapTo(meetingDTO, Meeting.class));
        } catch (ServiceLayerException ex) {
            throw new FacadeLayerException(ex);
        }
    }

    @TransactionalWO
    public void delete(Long id) {
        try {
            meetingService.delete(id);
        } catch (ServiceLayerException ex) {
            throw new FacadeLayerException(ex);
        }
    }

}
