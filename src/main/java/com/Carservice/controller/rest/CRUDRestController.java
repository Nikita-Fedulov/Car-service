package com.Carservice.controller.rest;

import com.Carservice.service.interf.CRUDService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class CRUDRestController <E,K>{
    abstract CRUDService<E,K> getService();


    @PostMapping
    public ResponseEntity<E> create (@RequestBody E object){
        getService().create(object);
        return ResponseEntity.ok(object);
    }
    @GetMapping("/{id}")
    public ResponseEntity<E> finById (@PathVariable K id){
        E object = getService().findById(id);
        if(object == null){
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(object);
    }

    @GetMapping
    public ResponseEntity<List<E>> findAll(){
        List<E> objects = getService().findAll();
        return ResponseEntity.ok(objects);
    }
    @PutMapping
    public ResponseEntity<E> update(@RequestBody E object){
        E updateObject = getService().update(object);
        return ResponseEntity.ok(updateObject);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable K id){
        E objectDelete = getService().findById(id);
        getService().delete(objectDelete);
        return ResponseEntity.noContent().build();
    }
}
