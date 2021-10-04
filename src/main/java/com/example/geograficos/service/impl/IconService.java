package com.example.geograficos.service.impl;

import com.example.geograficos.model.IconEntity;
import com.example.geograficos.model.PaisEntity;
import com.example.geograficos.repository.IconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class IconService implements BaseService {
   @Autowired
    private IconRepository iconRepository;
    @Override
    @Transactional
    public List findAll() throws Exception {
        try {
            List<IconEntity> iconos= iconRepository.findAll();
            return iconos;

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Object findById(Long id) throws Exception {
        try {
            Optional<IconEntity>iconOptional = iconRepository.findById(id);
            return iconOptional.get();

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Object save(Object entity) throws Exception {
        try {
           entity = iconRepository.save(entity);
           return entity;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Object update(Long id, Object entity) throws Exception {
        try {
         Optional<IconEntity> iconoOptional = iconRepository.findById(id);
         IconEntity icono= iconoOptional.get();
         icono=iconRepository.save(icono);
         return icono;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if (iconRepository.existsById(id)) {
                iconRepository.deleteById(id);
                return true; }
            } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        return false;
    }
}
