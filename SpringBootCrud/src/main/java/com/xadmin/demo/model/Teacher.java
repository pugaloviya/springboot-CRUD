package com.xadmin.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
public class Teacher {

	@Id
	@GeneratedValue
	private long id;
	public String name;

	public Teacher() {

	}

	public Teacher(long id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
