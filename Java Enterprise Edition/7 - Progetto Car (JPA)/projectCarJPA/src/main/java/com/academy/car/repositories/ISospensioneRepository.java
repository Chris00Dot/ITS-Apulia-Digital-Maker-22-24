package com.academy.car.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.car.models.Sospensione;

@Repository
public interface ISospensioneRepository extends JpaRepository<Sospensione, Integer> 
{}
