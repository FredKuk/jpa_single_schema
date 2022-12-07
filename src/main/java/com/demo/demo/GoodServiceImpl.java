package com.demo.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
// @Transactional(value = "jadenTransactionManager", readOnly = true)
public class GoodServiceImpl implements GoodService{

    @Autowired
    private GoodJpaRepository goodJpaRepository;

    @Override
    public List<GoodJpa> findAll() {
        return goodJpaRepository.findAll();
    }
    
}
