package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/") // This means URL's start with /demo (after Application path)
public class MainController {
  @Autowired
  private CountryRepository countryRepository;
  @Autowired
  private StateRepository stateRepository;
  @Autowired
  private CityRepository cityRepository;


  @GetMapping(path="/country")
  public @ResponseBody Iterable<Country> getAllCountrys() {
    // This returns a JSON or XML with the countrys
    return countryRepository.findAll();
  }

  @GetMapping(path="/state")
  public @ResponseBody Iterable<State> getAllStates(@RequestParam String country) {
    // This returns a JSON or XML with the countrys
    return stateRepository.findByCountry(country);
  }

  @GetMapping(path="/city")
  public @ResponseBody Iterable<City> getAllCities(@RequestParam String state) {
    // This returns a JSON or XML with the countrys
    return cityRepository.findByState(state);
  }
}
