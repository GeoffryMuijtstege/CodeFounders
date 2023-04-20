package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
public class PersonController {

	
	@Autowired
	private PersonService service;
	
	@RequestMapping("person/all")
	public Iterable<Person> vindAllemaal(){
		
		return service.vindAllePersonen();
	}
	
	@RequestMapping("person/{id}")
	public Optional<Person> vindEenPersoon(@PathVariable long id)
	{
		return service.vindEenPersoon(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="person/aanmaken")
	public void aanmaken(@RequestBody Person person)
	{		
		service.aanmaken(person);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="person/{id}/aanpassen")
	public void aanpassen(@PathVariable long id, @RequestBody Person person) 
	{
		//Openen
		Person dbPerson = this.service.vindEenPersoon(id).get();
		//Aanpassen
		dbPerson.setFirstName(person.getFirstName());
		dbPerson.setLastName(person.getLastName());
		//Opslaan
		service.aanpassen(dbPerson);
	}
}
