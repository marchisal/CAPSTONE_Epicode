package com.micheledisograt.mdt.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micheledisograt.mdt.dto.AdminDTO;
import com.micheledisograt.mdt.repository.AdminRepository;
import com.micheledisograt.mdt.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public AdminDTO findAdminById(Long id) {
		return adminRepository.findAdminById(id);
	}

	
}
