package com.example.application.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;

import com.example.application.dto.CountryDTO;

public class RestClientService implements Serializable 
{
	private static final long serialVersionUID = 1L;
			
	public List<CountryDTO> getAllCountries() {

		//System.out.println("Fetching all Comment objects through REST..");

		// Fetch from 3rd party API; configure fetch
		final RequestHeadersSpec<?> spec = WebClient.create().get().uri("https://restcountries.eu/rest/v2/all");

		// do fetch and map result
		final List<CountryDTO> comments = spec.retrieve().toEntityList(CountryDTO.class).block().getBody();

		//System.out.println(String.format("...received %d items.", comments.size()));

		return comments;
	}

}
