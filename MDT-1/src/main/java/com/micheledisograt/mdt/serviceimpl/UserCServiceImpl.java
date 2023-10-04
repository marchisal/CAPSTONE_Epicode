package com.micheledisograt.mdt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micheledisograt.mdt.dto.UserCDTO;
import com.micheledisograt.mdt.dto.UserNameSurnameDTO;
import com.micheledisograt.mdt.entity.User;
import com.micheledisograt.mdt.repository.UserRepository;
import com.micheledisograt.mdt.service.UserCService;
import com.micheledisograt.mdt.to.UserCTO;


@Service
public class UserCServiceImpl implements UserCService {

	@Autowired
	private UserRepository userRepository;
	
	
	
	@Override
	public Long createUser(UserCTO u) {
		User user = new User();
		user.setAddress(u.getAddress());
		user.setBirthDate(u.getBirthDate());
		user.setCap(u.getCap());
		user.setCity(u.getCity());
		user.setEmail(u.getEmail());
		user.setFiscalCode(u.getFiscalCode());
		user.setName(u.getName());
		user.setPassword(u.getPassword());
		user.setState(u.getState());
		user.setSurname(u.getSurname());
		user.setTelephoneNumber(u.getTelephoneNumber());
		user.setUsername(u.getUsername());
		
		return userRepository.save(user).getId();
		
	}
	
	
	@Override
	public UserCDTO findUserById(Long id) {
		
		//ritorna ciò che definisco nel repository, che attraverso la query è lo userDTO
		return userRepository.findUserById(id);
		
	}

	@Override
	public List<UserNameSurnameDTO> getAllUsers() {
		
		return userRepository.getAllUsers();
	}

	@Override
	public Long updateUser(Long id, UserCTO u) {
		
		User oldu = userRepository.findById(id).get();
		
		User user = new User();
		user.setAddress(u.getAddress());
		user.setBirthDate(u.getBirthDate());
		user.setCap(u.getCap());
		user.setCity(u.getCity());
		user.setEmail(u.getEmail());
		user.setFiscalCode(u.getFiscalCode());
		user.setName(u.getName());
		user.setPassword(u.getPassword());
		user.setState(u.getState());
		user.setSurname(u.getSurname());
		user.setTelephoneNumber(u.getTelephoneNumber());
		user.setUsername(u.getUsername());
		
		user.setId(oldu.getId());
		
		userRepository.save(user);
		
		return id;
	}



	@Override
	public Long deleteUserById(Long id) {
		
		User u = userRepository.findById(id).get();
		
		userRepository.delete(u);
		
		return u.getId();
	}


	
	

	
}
