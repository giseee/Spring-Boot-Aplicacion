package com.example.geograficos.service.impl;

import java.util.List;

public interface ContinenteService<E>{
    public List<E> findAll() throws Exception;
    public E findById(Long id) throws Exception;

}
