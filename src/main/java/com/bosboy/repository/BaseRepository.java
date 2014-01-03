package com.bosboy.repository;

import java.io.Serializable;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

public abstract class BaseRepository<M extends Serializable> {  
//    public void save(M m) {  
//        System.out.println("=====repository save:" + m);  
//    }  
    
    
    /**
     * @return Collection of M
     */
//    public Collection<M> getAll() {
//        final Objectify service = getService();
//
//        return(service.load().list());
//    }

    /**
     * @param M
     */
    public void create(final M m) {
        final Objectify service = getService();
        service.save().entities(m).now();
    }

    /**
     * @param id
     */
    public void deleteById(final M m) {
        final Objectify service = getService();
        service.delete().entities(m);
    }

    private Objectify getService() {
        return (ObjectifyService.factory().begin());
    }
}  
