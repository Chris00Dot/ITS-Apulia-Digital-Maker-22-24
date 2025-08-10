package com.academy.car.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.car.models.Marca;

@Repository
public interface IMarcaRepository extends JpaRepository<Marca, Integer> 
{}
