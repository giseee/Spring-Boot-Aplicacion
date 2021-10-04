package com.example.geograficos.repository;

import com.example.geograficos.model.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<PaisEntity,Long>{
}
