package com.upwork.dao;

import com.upwork.model.TestEntity;
import org.springframework.data.repository.CrudRepository;

public interface DemoRepository extends CrudRepository<TestEntity, Integer>{
}

