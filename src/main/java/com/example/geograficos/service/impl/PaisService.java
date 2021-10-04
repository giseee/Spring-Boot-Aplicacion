package com.example.geograficos.service.impl;

import com.example.geograficos.model.PaisEntity;
import com.example.geograficos.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PaisService implements BaseService{
    @Autowired
    private PaisRepository paisRepository;

    @Override
    @Transactional
    //lista todos los paises o ciudades de la base de datos
    public List findAll() throws Exception {
        try {
            List<PaisEntity> paises= paisRepository.findAll();
            return paises;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    // creamos un opcional por si no encuentra la entidad, si la encuentra la retorna
    public Object findById(Long id) throws Exception {
        try {
            Optional<PaisEntity> paisOptional= paisRepository.findById(id);
            return  paisOptional.get();

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    //guarda la entidad pais
    public Object save(Object entity) throws Exception {

        try {
             entity = paisRepository.save(entity);
             return entity;

        } catch (Exception e){
            throw new Exception(e.getMessage()); }
    }

    @Override
    @Transactional
    // actualiza el pais
    public Object update(Long id, Object entity) throws Exception {
        try {
            Optional<PaisEntity> paisOptional= paisRepository.findById(id);
            PaisEntity pais = paisOptional.get();
            pais = paisRepository.save(pais);
            return pais;

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    //consulta si existe un pais o ciudad con ese id y si es asi lo borra
    public boolean delete(Long id) throws Exception {
        try {
            if (paisRepository.existsById(id)){
                paisRepository.deleteById(id);
                return true;
            }

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return false;
    }
}
