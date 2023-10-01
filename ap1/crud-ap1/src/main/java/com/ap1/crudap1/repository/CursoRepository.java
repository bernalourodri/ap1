package com.ap1.crudap1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap1.crudap1.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}