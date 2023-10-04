package com.micheledisograt.mdt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuoteDTO {
	
	private Long id;
	private Long user;	
	private String tattooDescription;	
	private String tattooSize;	
	private String bodyPart;	
	private Integer price;	
	private Boolean accepted;
	
	public QuoteDTO(Long id, Long user, String tattooDescription, String tattooSize, String bodyPart) {
		super();
		this.id = id;
		this.user = user;
		this.tattooDescription = tattooDescription;
		this.tattooSize = tattooSize;
		this.bodyPart = bodyPart;
	}
	
	
	
}
