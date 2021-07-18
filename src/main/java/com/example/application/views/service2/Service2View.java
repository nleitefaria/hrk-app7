package com.example.application.views.service2;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Sercive 2 ")
@Route(value = "service2", layout = MainLayout.class)
public class Service2View extends Div {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Service2View() {
		addClassName("about-view");
        add(new Text("Content about service 2 placeholder"));
       
    }

}
