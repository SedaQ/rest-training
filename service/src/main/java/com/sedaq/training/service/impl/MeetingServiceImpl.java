package com.sedaq.training.service.impl;

import java.util.Optional;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.Predicate;
import com.sedaq.training.persistence.model.Meeting;
import com.sedaq.training.persistence.repository.MeetingRepository;
import com.sedaq.training.service.exceptions.ServiceLayerException;
import com.sedaq.training.service.iface.MeetingService;

/**
 * @author Pavel Šeda
 */
@Service
public class MeetingServiceImpl implements MeetingService {

    private MeetingRepository meetingRepository;

    @Autowired
    public MeetingServiceImpl(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    @Override
    public Optional<Meeting> findById(Long id) {
        try {
            return meetingRepository.findById(id);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    @Override
    public Page<Meeting> findAll(Predicate predicate, Pageable pageable) {
        try {
            return meetingRepository.findAll(predicate, pageable);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    @Override
    public void create(Meeting meeting) {
        try {
            meetingRepository.save(meeting);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    @Override
    public void update(Meeting meeting) {
        try {
            meetingRepository.save(meeting);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    @Override
    public void delete(Meeting meeting) {
        try {
            meetingRepository.delete(meeting);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    @Override
    public void delete(Long id) {
        try {
            meetingRepository.deleteById(id);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

}
