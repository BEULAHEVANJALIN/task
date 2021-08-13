package com.example.task;

import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface StateRepository extends CrudRepository<State,Integer> {
	List<State> findByCountry(String country);	
}
