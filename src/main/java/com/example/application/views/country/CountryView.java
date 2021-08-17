package com.example.application.views.country;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Countries")
@Route(value = "country", layout = MainLayout.class)
public class CountryView extends VerticalLayout {
	
	public CountryView()
	{
		addClassName("about-view");
        add(new Text("This view will display the results from a Restful Webservice call ..."));
		
	}
			

}
