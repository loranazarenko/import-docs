package com.nayax.intern.microservices.receiver.repository;

import com.nayax.intern.microservices.receiver.dto.DocumentStatusDto;
import com.nayax.intern.microservices.receiver.dto.EventDto;
import com.nayax.intern.microservices.receiver.entity.Document;
import com.nayax.intern.microservices.receiver.entity.EventEntity;
import com.nayax.intern.microservices.receiver.enums.StateTypeEnum;
import com.nayax.intern.microservices.receiver.utils.EventFilter;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface EventDao {

    public Long saveEvent(EventEntity eventEntity);
    public List<EventEntity> getEventsWithParams(EventFilter params);
    //public EventEntity getById(long id);
    public int updateStatusEvent(List<Long> id, StateTypeEnum status);
    public void deleteEvent( long id);
    public void save(List<DocumentStatusDto> documentStatusDto);




}
