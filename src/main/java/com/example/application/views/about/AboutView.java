package com.example.application.views.about;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.MainLayout;

@PageTitle("About")
@Route(value = "", layout = MainLayout.class)
public class AboutView extends Div {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AboutView() {
        addClassName("about-view");
        add(new Text("Content about placeholder"));
    }

}
