package com.biz.calculator;

public class Calculator {
	private float numerator;
	private float denominator;
	private float quotient;

	public Calculator(float numerator, float denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public float getNumerator() {
		return numerator;
	}

	public void setNumerator(float numerator) {
		this.numerator = numerator;
	}

	public float getDenominator() {
		return denominator;
	}

	public void setDenominator(float denominator) {
		this.denominator = denominator;
	}

	public float getQuotient() {
		return numerator / denominator;
	}
}