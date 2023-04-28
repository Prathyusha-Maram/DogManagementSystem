package com.sample.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sample.DMS.Models.Dog;

/**
 * 
 * @author S548821 Prathyusha Maram
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer>{

	List<Dog> findByName(String name);
	
}
