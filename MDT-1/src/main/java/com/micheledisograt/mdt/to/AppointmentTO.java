package com.micheledisograt.mdt.to;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentTO {

	private Long user;
	private Date dateAndTimeApp;
	private String tattooDescription;
	private String tattooSize;
	private String bodyPart;
	private byte[] imgTattooExample;
	private Boolean deposit;
	private Long TPAppointmentStatus;
	private Long quote;
}
