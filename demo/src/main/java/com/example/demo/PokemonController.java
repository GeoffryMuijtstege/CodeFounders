package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
	
	@Autowired
	private PokemonService service;
	
	@RequestMapping("pokemon/all")
	public Iterable<Pokemon> findAll()
	{
		return service.findAllPokemons();
	}
	
	@RequestMapping("pokemon/{id}")
	public Optional<Pokemon> findOnePokemon(@PathVariable long id)
	{
		return service.findOnePokemon(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "pokemon/aanmaken")
	public void aanmaken(@RequestBody Pokemon pokemon) {
		service.aanmaken(pokemon);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "pokemon/delete/{id}")
	public void deletePokemon(@PathVariable long id)
	{
		service.deletePokemon(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "pokemon/{id}/update")
	public void updatePokemon(@PathVariable long id, @RequestBody Pokemon pokemon)
	{
		Pokemon dbPokemon = this.service.findOnePokemon(id).get();
		dbPokemon.setType2(pokemon.getType2());
		dbPokemon.setType(pokemon.getType());
		service.updatePokemon(dbPokemon);
	}
}
