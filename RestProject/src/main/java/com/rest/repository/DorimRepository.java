package com.rest.repository;

import com.rest.model.Dorim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DorimRepository extends JpaRepository<Dorim, Integer> {
	
}