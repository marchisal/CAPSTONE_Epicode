
package com.micheledisograt.mdt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "appointment_status")
public class TPAppointmentStatus {

	@Id
	@Column (name = "id")
	private Long id;
	@Column (name = "description")
	private String description;
}
