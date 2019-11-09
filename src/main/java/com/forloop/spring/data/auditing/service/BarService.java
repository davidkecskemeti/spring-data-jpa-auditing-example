package com.forloop.spring.data.auditing.service;

import com.forloop.spring.data.auditing.entity.Bar;
import com.forloop.spring.data.auditing.repository.BarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BarService {

    @Autowired
    private BarRepository repository;

    public Bar save(Bar bar) {
        return repository.save(bar);
    }


}
