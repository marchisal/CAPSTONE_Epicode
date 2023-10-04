package com.micheledisograt.mdt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.micheledisograt.mdt.dto.UserCDTO;
import com.micheledisograt.mdt.dto.UserNameSurnameDTO;
import com.micheledisograt.mdt.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	//Query per prendere uno user tramite id
	@Query(value = "SELECT new com.micheledisograt.mdt.dto.UserCDTO(u.id, u.name, u.surname, u.username, u.birthDate, "
			+ "u.fiscalCode, u.address, u.cap, u.city, u.state, u.telephoneNumber, u.email, u.password ) "
			+ "FROM User u "
			+ "WHERE u.id = :id")
	UserCDTO findUserById(@Param("id") Long id);
	
	//Query per prendere tutti i nomi e cognomi di tutti gli users
	@Query(value = "SELECT new com.micheledisograt.mdt.dto.UserNameSurnameDTO (u.name, u.surname) FROM User u ")
	List<UserNameSurnameDTO> getAllUsers();

	
    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

	Optional <User> findUserByFiscalCode(String fiscalCode);
}
