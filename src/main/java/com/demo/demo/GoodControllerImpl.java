package com.demo.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/good")
public class GoodControllerImpl implements GoodController{

    @Autowired
    private GoodService goodService;

    // @Autowired
    // public GoodControllerImpl(GoodService goodService){
    //     this.goodService=goodService;
    // }


    @Override
    @GetMapping("")
    public List<GoodJpa> findAll() {
        return goodService.findAll();
    }
}
