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
@Table(name="admins")
@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor
public class Admin 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="aid")
	private int aid;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
   private String lastame;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_name")
	private String user_name;
	
	
	
}
