package com.example.application.views.customer;

import com.example.application.entity.Customer;
import com.example.application.enu.CustomerStatus;
import com.example.application.service.CustomerService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;

public class CustomerForm extends FormLayout {
	
	private static final long serialVersionUID = 1L;
	
	private TextField firstName = new TextField("First name");
	private TextField lastName = new TextField("Last name");
	private ComboBox<CustomerStatus> status = new ComboBox<>("Status");
	private DatePicker birthDate = new DatePicker("Birthdate");
	
	private Button save = new Button("Save");
	
	private Binder<Customer> binder = new Binder<>(Customer.class);
	private CustomerView customerView;
	
	private CustomerService service;
	
	public CustomerForm(CustomerView customerView, CustomerService service) 
	{
		this.customerView = customerView;
		this.service = service;
	    status.setItems(CustomerStatus.values());

	    HorizontalLayout buttons = new HorizontalLayout(save);
	    save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
	    add(firstName, lastName, status, birthDate, buttons);
	    
	    binder.bindInstanceFields(this);
	  
	    save.addClickListener(event -> save()); 
	}
	
	
	private void save() 
	{		
	    Customer customer = new Customer();
	    try {
			binder.writeBean(customer);			
		    service.save(customer);
		    customerView.updateListAfterSaving();
		    binder.getFields().forEach(f -> f.clear());
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	}
}