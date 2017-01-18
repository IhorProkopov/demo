package com.upwork.controller;

import com.upwork.dao.DemoRepository;
import com.upwork.model.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CRUDController {

    @Autowired
    private DemoRepository repository;

    @RequestMapping("/get")
    public TestEntity get(@RequestParam("id") int id){
        return repository.findOne(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(@RequestBody TestEntity value){
        repository.save(value);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody TestEntity value){
        repository.delete(value.getId());
        repository.save(value);
    }

    @RequestMapping("/delete")
    public void delete(@RequestParam("id") int id){
        repository.delete(id);
    }


}
