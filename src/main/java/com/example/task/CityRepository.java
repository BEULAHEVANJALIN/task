package com.example.task;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CityRepository extends CrudRepository<City,Integer> {
	List<City> findByState(String state);
}
