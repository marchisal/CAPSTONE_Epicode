package com.micheledisograt.mdt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.micheledisograt.mdt.dto.RequestAppDTO;
import com.micheledisograt.mdt.entity.Appointment;

public interface RequestAppRepository extends JpaRepository<Appointment, Long> {	
	
	@Query(value = "SELECT new com.micheledisograt.mdt.dto.RequestAppDTO(a.id, u.name, u.surname, u.fiscalCode, u.telephoneNumber, u.email, "
			+ "a.tattooDescription, a.tattooSize, a.bodyPart) "
			+ "FROM User u JOIN Appointment a "
			+ "ON u.id = a.user "
			+ "WHERE a.id = :id")
	RequestAppDTO findReqAppById(@Param("id") Long id);
	
	

	@Query(value = "SELECT new com.micheledisograt.mdt.dto.RequestAppDTO(a.id, u.name, u.surname, u.fiscalCode, u.telephoneNumber, u.email, "
			+ "a.tattooDescription, a.tattooSize, a.bodyPart) "
			+ "FROM User u JOIN Appointment a "
			+ "ON u.id = a.user ")
	List<RequestAppDTO> findAllReqApp();


	@Query(value = "SELECT new com.micheledisograt.mdt.dto.RequestAppDTO(a.id, u.name, u.surname, u.fiscalCode, u.telephoneNumber, u.email, "
			+ "a.tattooDescription, a.tattooSize, a.bodyPart) "
			+ "FROM User u JOIN Appointment a "
			+ "ON u.id = a.user "
			+ "WHERE u.name LIKE :name%")
	List<RequestAppDTO> findByName(@Param("name") String name);


}
