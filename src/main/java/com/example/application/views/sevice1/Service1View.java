package com.example.application.views.sevice1;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Service 1 ")
@Route(value = "service1", layout = MainLayout.class)
public class Service1View extends Div {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Service1View() {
	    VerticalLayout todosList = new VerticalLayout(); 
	    TextField taskField = new TextField(); 
	    Button addButton = new Button("Add"); 
	    addButton.addClickShortcut(Key.ENTER);
	    addButton.addClickListener(click -> {
	      
	      Checkbox checkbox = new Checkbox(taskField.getValue());
	      todosList.add(checkbox);
	    });
	    add( 
	      new H1("Vaadin Todo"),
	      todosList,
	      new HorizontalLayout(
	        taskField,
	        addButton
	      )
	    );
	  }
}
