package com.demo.demo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodJpaRepository extends JpaRepository<GoodJpa,Long>{
    List<GoodJpa> findAll();    
}
