package com.micheledisograt.mdt.to;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCTO {

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
}
