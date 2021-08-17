package com.example.application.views.country;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.application.service.RestClientService;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import com.example.application.dto.CountryDTO;

@PageTitle("Countries")
@Route(value = "country", layout = MainLayout.class)
public class CountryView extends VerticalLayout {
	
	private static final long serialVersionUID = 1L;

	public CountryView(@Autowired RestClientService service)
	{
		final Grid<CountryDTO> commentsGrid = new Grid<CountryDTO>(CountryDTO.class);
		// Fetch all entities and show		
		commentsGrid.setItems(service.getAllCountries());
		add(commentsGrid);		
	}
}
