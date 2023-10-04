package com.micheledisograt.mdt.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuoteTO {
	
	private Long user;	
	private String tattooDescription;	
	private String tattooSize;	
	private String bodyPart;	
	private Integer price;	
	private Boolean accepted;

}
