package com.example.refactoring2.form.template.method;


public class CustomerRF {

	public String statement() {
		return new TextStatement().value(this);
	}
	
	public String htmlStatement() {
		return new HtmlStatement().value(this);
	}
}
