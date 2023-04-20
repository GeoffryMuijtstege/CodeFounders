package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	private IPersonRepository repo;
	
	public Iterable <Person> vindAllePersonen(){
		return repo.findAll();		
	}
	
	public Optional<Person> vindEenPersoon(long id)
	{
		return repo.findById(id);
	}

	public void aanmaken(Person person) {
		//Permissies
		//Validatie 
		
		repo.save(person);
	}

	public void aanpassen(Person dbPerson) {
		repo.save(dbPerson);
	}
}
