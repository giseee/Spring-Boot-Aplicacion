package com.example.geograficos.repository;

import com.example.geograficos.model.IconEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IconRepository extends JpaRepository<IconEntity,Long>{
}
