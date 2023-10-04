package com.micheledisograt.mdt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDTO {

	private Long id;
	private String username;
	private String password;
	public AdminDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
}
