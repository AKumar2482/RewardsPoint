package com.reward.points.model;

import java.time.LocalDate;

public class Customer {
	private int cutomerId;
	private String name;
	private double amout;
	private LocalDate date;

	public Customer(int cutomerId, String name, double amout, LocalDate date) {
		this.cutomerId = cutomerId;
		this.name = name;
		this.amout = amout;
		this.date = date;
	}

	public int getCutomerId() {
		return cutomerId;
	}

	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmout() {
		return amout;
	}

	public void setAmout(double amout) {
		this.amout = amout;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Customer [cutomerId=" + cutomerId + ", name=" + name + ", amout=" + amout + ", date=" + date + "]";
	}

}
