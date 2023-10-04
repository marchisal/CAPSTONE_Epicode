package com.micheledisograt.mdt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micheledisograt.mdt.dto.RequestAppDTO;

@Service
public interface RequestAppService {

	RequestAppDTO findReqAppById(Long id);
	
	List<RequestAppDTO> findAllReqApp();

	List<RequestAppDTO> findByName(String name);
	
}
