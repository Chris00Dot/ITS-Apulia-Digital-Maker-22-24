package com.academy.car.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.car.models.Veicolo;

@Repository
public interface IVeicoloRepository extends JpaRepository<Veicolo, Integer>
{
	Optional<Veicolo> findByModello(String modello);
}
