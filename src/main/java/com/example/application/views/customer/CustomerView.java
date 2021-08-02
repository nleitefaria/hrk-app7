package com.example.application.views.customer;

import com.example.application.entity.Customer;
import com.example.application.service.CustomerService;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Customers")
@Route(value = "service2", layout = MainLayout.class)
public class CustomerView extends Div {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CustomerService customerService;
    private Grid<Customer> grid = new Grid<>(Customer.class);
	
	
	public CustomerView(CustomerService customerService) {
		this.customerService = customerService; 
		addClassName("customer-view");
        
        grid.setColumns("firstName", "lastName", "status");
        grid.addClassName("contact-grid");
        grid.setSizeFull();
        add(grid);
        setSizeFull();        
        updateList();    
    }
	
	public void updateList() {
        grid.setItems(customerService.findAll());
    }
}
