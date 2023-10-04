package com.micheledisograt.mdt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.micheledisograt.mdt.dto.RequestPrevDTO;
import com.micheledisograt.mdt.entity.Quote;

public interface RequestPrevRepository extends JpaRepository<Quote, Long> {

	@Query(value = "SELECT new com.micheledisograt.mdt.dto.RequestPrevDTO(q.id ,u.name, u.surname, u.fiscalCode, u.telephoneNumber, u.email, "
			+ "q.tattooDescription, q.tattooSize, q.bodyPart) "
			+ "FROM User u JOIN Quote q "
			+ "ON u.id = q.user "
			+ "WHERE q.id = :id")
	RequestPrevDTO findReqPrevById(@Param("id") Long id);
	
	@Query(value = "SELECT new com.micheledisograt.mdt.dto.RequestPrevDTO(q.id, u.name, u.surname, u.fiscalCode, u.telephoneNumber, u.email, "
			+ "q.tattooDescription, q.tattooSize, q.bodyPart) "
			+ "FROM User u JOIN Quote q "
			+ "ON u.id = q.user ")
	List<RequestPrevDTO> findAllReqPrev();
	
	@Query(value = "SELECT new com.micheledisograt.mdt.dto.RequestPrevDTO(q.id, u.name, u.surname, u.fiscalCode, u.telephoneNumber, u.email, "
			+ "q.tattooDescription, q.tattooSize, q.bodyPart) "
			+ "FROM User u JOIN Quote q "
			+ "ON u.id = q.user "
			+ "WHERE u.name LIKE :name%")
	List<RequestPrevDTO> findByName(@Param("name") String name);
}
