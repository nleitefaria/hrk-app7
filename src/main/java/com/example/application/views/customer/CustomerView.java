package com.example.application.views.customer;

import com.example.application.entity.Customer;
import com.example.application.service.CustomerService;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Customers")
@Route(value = "service2", layout = MainLayout.class)
public class CustomerView extends Div {

	private static final long serialVersionUID = 1L;
	
	private CustomerService customerService;
	
    private Grid<Customer> grid = new Grid<>(Customer.class);
    private TextField filterText = new TextField();
    
    private CustomerForm form;
	
	
	public CustomerView(CustomerService customerService) {
		this.customerService = customerService; 
		addClassName("customer-view");
        
		form = new CustomerForm(this, customerService);
		
		filterText.setPlaceholder("Filter by First name...");
	    filterText.setClearButtonVisible(true);
	    filterText.setValueChangeMode(ValueChangeMode.EAGER);
	    filterText.addValueChangeListener(e -> updateList());
		
        grid.setColumns("firstName", "lastName", "status");
        grid.addClassName("contact-grid");
        grid.setSizeFull();
        add(filterText);
        setSizeFull();        
        findAll();  
        
        HorizontalLayout mainContent = new HorizontalLayout(grid, form);
        mainContent.setSizeFull();
        grid.setSizeFull();

        add(filterText, mainContent);   
    }
	
	public void findAll() {
        grid.setItems(customerService.findAll());
    }
	
	public void updateList() {
        grid.setItems(customerService.findAll(filterText.getValue()));
    }
	
	public void updateListAfterSaving() {
		grid.setItems(customerService.findAll());
	}
	
	
	
}
