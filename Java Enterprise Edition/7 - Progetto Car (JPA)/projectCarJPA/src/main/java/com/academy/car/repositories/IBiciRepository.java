package com.academy.car.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.car.models.Bici;


@Repository
public interface IBiciRepository extends JpaRepository<Bici, Integer> 
{
	Optional<Bici> findByNumeroMarche(Integer numeroMarche);
}
