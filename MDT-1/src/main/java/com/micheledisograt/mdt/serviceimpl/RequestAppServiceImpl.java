package com.micheledisograt.mdt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.micheledisograt.mdt.dto.RequestAppDTO;
import com.micheledisograt.mdt.repository.AppointmentRepository;
import com.micheledisograt.mdt.repository.RequestAppRepository;
import com.micheledisograt.mdt.repository.UserRepository;
import com.micheledisograt.mdt.service.RequestAppService;

@Service
public class RequestAppServiceImpl implements RequestAppService {

	@Autowired 
	RequestAppRepository reqappRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AppointmentRepository appRepository;
	
	//GETONE
	@Override
	public RequestAppDTO findReqAppById(Long id) {
		RequestAppDTO p = reqappRepository.findReqAppById(id);
		return p;
	}

	//GETALL
	@Override
	public List<RequestAppDTO> findAllReqApp() {
		return reqappRepository.findAllReqApp();
	}

	@Override
	public List<RequestAppDTO> findByName(String name) {
		List<RequestAppDTO> a = reqappRepository.findByName(name);
		return a;
	}

	
	
	

}
