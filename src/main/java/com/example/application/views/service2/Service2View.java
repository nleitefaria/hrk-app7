package com.example.application.views.service2;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Sercive 2 ")
@Route(value = "service2", layout = MainLayout.class)
public class Service2View extends HorizontalLayout {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Service2View() {
        addClassName("service-2-view");
        
        setVerticalComponentAlignment(Alignment.END);
       
    }

}
