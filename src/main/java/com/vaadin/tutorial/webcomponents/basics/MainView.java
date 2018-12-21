package com.vaadin.tutorial.webcomponents.basics;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@PWA(name = "Project Base for Vaadin Flow", shortName = "Project Base")
public class MainView extends VerticalLayout {

    public MainView() {
        add(new HarrypotterProgress());

        CodeSample cs = new CodeSample();
        TextArea ta = new TextArea();
        Button b = new Button("Display!", e -> cs.setCode(ta.getValue()));

        add(new HorizontalLayout(ta, b), cs);
    }
}
