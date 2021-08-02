package com.example.application.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import com.example.application.enu.CustomerStatus;

@Entity
public class Customer extends AbstractEntity {

	
	private String firstName = "";

	private String lastName = "";

	private LocalDate birthDate;

	private CustomerStatus status;

	private String email = "";

	

	/**
	 * Get the value of email
	 *
	 * @return the value of email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set the value of email
	 *
	 * @param email new value of email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Get the value of status
	 *
	 * @return the value of status
	 */
	public CustomerStatus getStatus() {
		return status;
	}

	/**
	 * Set the value of status
	 *
	 * @param status new value of status
	 */
	public void setStatus(CustomerStatus status) {
		this.status = status;
	}

	/**
	 * Get the value of birthDate
	 *
	 * @return the value of birthDate
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}

	/**
	 * Set the value of birthDate
	 *
	 * @param birthDate new value of birthDate
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Get the value of lastName
	 *
	 * @return the value of lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the value of lastName
	 *
	 * @param lastName new value of lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Get the value of firstName
	 *
	 * @return the value of firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the value of firstName
	 *
	 * @param firstName new value of firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
