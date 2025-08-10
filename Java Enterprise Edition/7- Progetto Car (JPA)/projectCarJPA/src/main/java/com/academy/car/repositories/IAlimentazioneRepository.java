package com.academy.car.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.car.models.Alimentazione;

@Repository
public interface IAlimentazioneRepository extends JpaRepository<Alimentazione, Integer> 
{}
