package com.sedaq.training.facade.iface;

import org.springframework.data.domain.Pageable;

import com.querydsl.core.types.Predicate;
import com.sedaq.training.facade.api.PageResultResource;
import com.sedaq.training.facade.api.dto.meeting.MeetingCreateDTO;
import com.sedaq.training.facade.api.dto.meeting.MeetingDTO;

/**
 * @author Pavel Šeda
 */
public interface MeetingFacade {

    MeetingDTO findById(Long id);

    PageResultResource<MeetingDTO> findAll(Predicate predicate, Pageable pageable);

    MeetingCreateDTO create(MeetingCreateDTO meetingDTO);

    MeetingDTO update(MeetingDTO meetingDTO);

    void delete(MeetingDTO meetingDTO);

    void delete(Long id);

}
