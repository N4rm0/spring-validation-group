package com.mvong.example;

import org.hibernate.validator.constraints.NotEmpty;

public class Form {

	public interface Group1 {

	};

	public interface Group2 {

	};

	@NotEmpty(groups = { Group1.class })
	private String field1;

	@NotEmpty(groups = { Group2.class })
	private String field2;

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

}
