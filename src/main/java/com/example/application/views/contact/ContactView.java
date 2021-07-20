package com.example.application.views.contact;

import com.example.application.entity.Contact;
import com.example.application.service.ContactService;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Service 1 ")
@Route(value = "service1", layout = MainLayout.class)
public class ContactView extends VerticalLayout {

    private ContactService contactService;
    private Grid<Contact> grid = new Grid<>(Contact.class);

    public ContactView(ContactService contactService) {
        this.contactService = contactService; 
        addClassName("list-view");
        setSizeFull();
        configureGrid();

        add(grid);
        updateList(); 
    }

    private void configureGrid() {
        grid.addClassName("contact-grid");
        grid.setSizeFull();
        grid.setColumns("firstName", "lastName", "email", "status");
    }

    private void updateList() {
        grid.setItems(contactService.findAll());
    }
}
