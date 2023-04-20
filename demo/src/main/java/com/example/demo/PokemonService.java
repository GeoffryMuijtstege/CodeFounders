package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

	@Autowired
	private IPokemonRepository pokemonRepo;
	
	public Iterable<Pokemon> findAllPokemons() 
	{
		return pokemonRepo.findAll();
	}
	
	public Optional<Pokemon> findOnePokemon(long id)
	{
		return pokemonRepo.findById(id);
	}

	public void aanmaken(Pokemon pokemon) 
	{
		pokemonRepo.save(pokemon);
	}
	
	public void deletePokemon(long id) 
	{
		pokemonRepo.deleteById(id);
	}

	public void updatePokemon(Pokemon dbPokemon) 
	{
		pokemonRepo.save(dbPokemon);
	}
}
