package com.fitnesse;


public class FitnesseTest {

	private String string1;
	private String string2;
	private boolean equals;

	public void setString1(String string1) {
		this.string1 = string1;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}

	public boolean equals() {
		if (string1.equals(string2)) {
			this.equals = true;
		} else {
			this.equals = false;
		}
		return this.equals;
	}
}