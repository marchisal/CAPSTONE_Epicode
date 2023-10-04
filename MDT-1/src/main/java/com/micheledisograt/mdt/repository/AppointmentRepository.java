package com.micheledisograt.mdt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.micheledisograt.mdt.dto.AppointmentDTO;
import com.micheledisograt.mdt.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	
	@Query(value = "SELECT new com.micheledisograt.mdt.dto.AppointmentDTO(a.id, a.user, a.tattooDescription, "
			+ "a.tattooSize, a.bodyPart ) "
			+ "FROM Appointment a "
			+ "WHERE a.id = :id")
	AppointmentDTO findAppById(@Param("id") Long id);

	
	@Query(value = "SELECT new com.micheledisograt.mdt.dto.AppointmentDTO(a.id, a.user, a.tattooDescription, a.tattooSize, a.bodyPart ) "
			+ "FROM Appointment a ")
	List<AppointmentDTO> getAllApp();

	
	
	
}
