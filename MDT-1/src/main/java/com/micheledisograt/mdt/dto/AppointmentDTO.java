package com.micheledisograt.mdt.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDTO {

	private Long id;
	private Long user;
	private Date dateAndTimeApp;
	private String tattooDescription;
	private String tattooSize;
	private String bodyPart;
	private byte[] imgTattooExample;
	private Boolean deposit;
	private Long TPAppointmentStatus;
	private Long quote;
	
	public AppointmentDTO(Long id, Long user, String tattooDescription, String tattooSize, String bodyPart) {
		super();
		this.id = id;
		this.user = user;
		this.tattooDescription = tattooDescription;
		this.tattooSize = tattooSize;
		this.bodyPart = bodyPart;
	}

	public AppointmentDTO(Long user, String tattooDescription, String tattooSize, String bodyPart) {
		super();
		this.user = user;
		this.tattooDescription = tattooDescription;
		this.tattooSize = tattooSize;
		this.bodyPart = bodyPart;
	}
	
	
	
	
	
	
}
