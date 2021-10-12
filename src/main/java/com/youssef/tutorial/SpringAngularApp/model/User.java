/**
 * 
 */
package com.youssef.tutorial.SpringAngularApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Youssef
 *
 */
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name = "";
	private String email = "";

	public User() {

	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * 
	 * @param name
	 * @param email
	 */
	public User(long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;

	}
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;

	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
}
