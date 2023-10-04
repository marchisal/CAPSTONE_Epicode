package com.micheledisograt.mdt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestPrevDTO {
	
	private Long id;
	private String name;
	private String surname;
	private String fiscalCode;
	private String telephoneNumber;
	private String email;
	private String tattooDescription;
	private String tattooSize;
	private String bodyPart;
	
	
}
