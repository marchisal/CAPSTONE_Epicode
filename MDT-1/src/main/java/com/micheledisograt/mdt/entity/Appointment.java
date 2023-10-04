package com.micheledisograt.mdt.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// TODO: Auto-generated Javadoc
/**
 * The Class Appointment.
 */
@Entity
@Table (name = "appointment")

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new appointment.
 *
 * @param id the id
 * @param user the user
 * @param dateAndTimeApp the date and time app
 * @param tattooDescription the tattoo description
 * @param imgTattooExample the img tattoo example
 * @param deposit the deposit
 * @param TPAppointmentStatus the TP appointment status
 * @param quote the quote
 */
@AllArgsConstructor

/**
 * Instantiates a new appointment.
 */
@NoArgsConstructor
public class Appointment {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column (name = "user")
	private Long user;
	@Column (name = "date_n_time_app")
	private Date dateAndTimeApp;
	@Column (name = "tattoo_description")
	private String tattooDescription;
	@Column (name = "tattoo_size")
	private String tattooSize;
	@Column (name = "body_part")
	private String bodyPart;
	@Lob
	@Column (name = "img_tattoo_ex")
	private byte[] imgTattooExample;
	@Column (name = "deposit")
	private Boolean deposit;
	@Column (name = "appointment_status")
	private Long TPAppointmentStatus;
	@Column (name = "quote")
	private Long quote;
	

}
