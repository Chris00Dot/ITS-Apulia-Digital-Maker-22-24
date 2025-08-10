package com.academy.car.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.car.models.Moto;

@Repository
public interface IMotoRepository extends JpaRepository<Moto, Integer> 
{
	Optional<Moto> findByTarga(String targa);
}
