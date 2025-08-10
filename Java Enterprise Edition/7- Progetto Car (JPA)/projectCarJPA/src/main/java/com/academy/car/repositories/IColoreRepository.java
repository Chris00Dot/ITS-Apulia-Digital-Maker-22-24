package com.academy.car.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.car.models.Colore;

@Repository
public interface IColoreRepository extends JpaRepository<Colore, Integer> 
{}
