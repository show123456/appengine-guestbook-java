package com.bosboy.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.bosboy.repository.BaseRepository;

public abstract class BaseService<M extends Serializable> {  
    @Autowired  
    protected BaseRepository<M> repository;  
  
    public void save(M m) {  
        repository.create(m);  
    }  
}  