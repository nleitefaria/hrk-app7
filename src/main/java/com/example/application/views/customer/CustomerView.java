package com.example.application.views.customer;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Service 2 ")
@Route(value = "service2", layout = MainLayout.class)
public class CustomerView extends Div {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public CustomerView() {
		addClassName("customer-view");
        add(new Text("Content about Customers"));
       
    }

}
