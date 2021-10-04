package com.example.geograficos.repository;

import com.example.geograficos.model.ContinenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinenteRepository extends JpaRepository<ContinenteEntity,Long> {
}
