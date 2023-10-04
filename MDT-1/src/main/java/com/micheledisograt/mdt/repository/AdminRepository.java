package com.micheledisograt.mdt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.micheledisograt.mdt.dto.AdminDTO;
import com.micheledisograt.mdt.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

	
	@Query(value = "SELECT new com.micheledisograt.mdt.dto.AdminDTO(ad.username, ad.password) "
			+ "FROM Admin ad "
			+ "WHERE ad.id = :id")
	AdminDTO findAdminById(@Param("id") Long id);

}
