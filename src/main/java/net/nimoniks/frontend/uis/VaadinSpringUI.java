package net.nimoniks.frontend.uis;

import org.vaadin.viritin.layouts.MVerticalLayout;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

import net.nimoniks.constants.Constants;

@Title(Constants.app_name)
@Theme("valo")
@SpringUI
public class VaadinSpringUI extends UI {
	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest request) {
		MVerticalLayout mainLayout = new MVerticalLayout();
		mainLayout.setMargin(false);
		mainLayout.expand(new Label("Hello World"));

		setContent(mainLayout);
	}

}
