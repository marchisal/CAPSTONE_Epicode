package com.micheledisograt.mdt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.micheledisograt.mdt.dto.QuoteDTO;
import com.micheledisograt.mdt.entity.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long> {

	@Query(value = "SELECT new com.micheledisograt.mdt.dto.QuoteDTO(q.id, q.user, q.tattooDescription, "
			+ "q.tattooSize, q.bodyPart ) "
			+ "FROM Quote q "
			+ "WHERE q.id = :id")
	QuoteDTO findQuoteById(@Param("id") Long id);

	@Query(value = "SELECT new com.micheledisograt.mdt.dto.QuoteDTO(q.id, q.user, q.tattooDescription, q.tattooSize, q.bodyPart ) "
			+ "FROM Quote q ")
	List<QuoteDTO> getAllQuote();

	
}
