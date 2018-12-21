package com.vaadin.tutorial.webcomponents.basics;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.dom.ShadowRoot;

@Tag("code-sample")
@HtmlImport("bower_components/code-sample/code-sample.html")
@HtmlImport("bower_components/code-sample/themes/solarized-dark.html")
public class CodeSample extends Component {

  Element template = new Element("template");

  public void setCode(String code) {
    template.setProperty("innerHTML", code);

    getElement().setAttribute("type", "java");
    getElement().appendChild(template);

    getElement().callFunction("_updateContent");
  }
  
}