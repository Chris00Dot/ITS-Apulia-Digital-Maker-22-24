package com.academy.car.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.car.models.Categoria;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> 
{}
