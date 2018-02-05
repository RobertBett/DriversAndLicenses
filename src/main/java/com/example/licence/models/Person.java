package com.example.licence.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Person {
	
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	@OneToOne(mappedBy="person", fetch=FetchType.LAZY)
	//"mappedBy"<= this maps the license attribute in the Person class to the person attribute in the License class
	private License license;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName) {
		this.firstName =firstName;
		this.lastName = lastName;
		this.createdAt = new Date();
		this.updatedAt = new Date();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}
	
	@PrePersist
	public void onCreate(){
		this.createdAt = new Date();
	}
	
	@PreUpdate
	public void onUpdate(){
		this.updatedAt = new Date();
	}
	

}
