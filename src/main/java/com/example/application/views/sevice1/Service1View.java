package com.example.application.views.sevice1;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Sercive 1 ")
@Route(value = "service1", layout = MainLayout.class)
public class Service1View extends HorizontalLayout {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TextField service1Name;
	
	public Service1View() {
        addClassName("service-1-view");
        service1Name = new TextField("Service 1 placeholder");       
        add(service1Name);
        setVerticalComponentAlignment(Alignment.END, service1Name);
       
    }
}
