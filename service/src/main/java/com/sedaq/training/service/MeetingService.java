package com.sedaq.training.service;

import java.util.Optional;

import com.sedaq.training.exceptions.ServiceLayerException;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.Predicate;
import com.sedaq.training.persistence.model.Meeting;
import com.sedaq.training.persistence.repository.MeetingRepository;

/**
 * @author Pavel Šeda
 */
@Service
public class MeetingService {

    private MeetingRepository meetingRepository;

    @Autowired
    public MeetingService(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    public Optional<Meeting> findById(Long id) {
        try {
            return meetingRepository.findById(id);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    public Page<Meeting> findAll(Predicate predicate, Pageable pageable) {
        try {
            return meetingRepository.findAll(predicate, pageable);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    public void create(Meeting meeting) {
        try {
            meetingRepository.save(meeting);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    public void update(Meeting meeting) {
        try {
            meetingRepository.save(meeting);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    public void delete(Meeting meeting) {
        try {
            meetingRepository.delete(meeting);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    public void delete(Long id) {
        try {
            meetingRepository.deleteById(id);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

}
