package com.example.application.views.sevice1;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Sercive 1 ")
@Route(value = "service1", layout = MainLayout.class)
public class Service1View extends Div {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Service1View() {
		addClassName("about-view");
        add(new Text("Content about service 1 placeholder"));
       
    }
}
