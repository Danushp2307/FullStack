package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="startup")
public class Users{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int id, String name, String startup_name, String startup_idea, int estimation, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.startup_name = startup_name;
		this.startup_idea = startup_idea;
		this.estimation = estimation;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", startup_name=" + startup_name + ", startup_idea="
				+ startup_idea + ", estimation=" + estimation + ", phone=" + phone + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartup_name() {
		return startup_name;
	}
	public void setStartup_name(String startup_name) {
		this.startup_name = startup_name;
	}
	public String getStartup_idea() {
		return startup_idea;
	}
	public void setStartup_idea(String startup_idea) {
		this.startup_idea = startup_idea;
	}
	public int getEstimation() {
		return estimation;
	}
	public void setEstimation(int estimation) {
		this.estimation = estimation;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	private String name;
	private String startup_name;
	private String startup_idea;
	private int estimation;
	private int phone;
	
	
}