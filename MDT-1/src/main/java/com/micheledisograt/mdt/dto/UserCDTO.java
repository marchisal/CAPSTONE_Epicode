package com.micheledisograt.mdt.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCDTO {

	private Long id;
	private String name;
	private String surname;
	private String username;
	private Date birthDate;
	private String fiscalCode;
	private String address;
	private String cap;
	private String city;
	private String state;
	private String telephoneNumber;
	private String email;
	private String password;
	
	public UserCDTO(String name, String surname, String fiscalCode, String telephoneNumber, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.fiscalCode = fiscalCode;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
	}

	public UserCDTO(Long id, String name, String surname, String fiscalCode, String telephoneNumber, String email) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.fiscalCode = fiscalCode;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
	}
	
	
	
}
