package com.farmsystem.backend.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="farmers")
@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor
public class Farmer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fid")
	private int fid;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;

	@Column(name="address")
	private String address;
	
	@Column(name="user_name")
	private String user_name;

	
}
