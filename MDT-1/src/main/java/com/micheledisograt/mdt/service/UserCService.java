package com.micheledisograt.mdt.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.micheledisograt.mdt.dto.UserCDTO;
import com.micheledisograt.mdt.dto.UserNameSurnameDTO;
import com.micheledisograt.mdt.to.UserCTO;
@Service
public interface UserCService {
	
	//POST
	Long createUser(UserCTO u);
	
	//GETOALL
	List<UserNameSurnameDTO> getAllUsers();

	//GETONE
	UserCDTO findUserById(Long id);

	//PUT
	Long updateUser(Long id, UserCTO userto);

	
	//DELETE
	Long deleteUserById(Long id);
	
}
