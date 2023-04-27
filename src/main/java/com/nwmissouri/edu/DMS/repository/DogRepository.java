package com.nwmissouri.edu.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nwmissouri.edu.DMS.models.Dog;
@Repository
public interface DogRepository extends CrudRepository<Dog, Integer>{
	
	List<Dog> findByName(String name);

}
