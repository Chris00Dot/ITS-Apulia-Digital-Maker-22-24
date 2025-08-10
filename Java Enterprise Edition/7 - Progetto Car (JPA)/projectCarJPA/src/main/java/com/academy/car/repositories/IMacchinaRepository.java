package com.academy.car.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.car.models.Macchina;

@Repository
public interface IMacchinaRepository extends JpaRepository<Macchina, Integer> 
{
    Optional<Macchina> findByTarga(String targa);
}
