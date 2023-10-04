package com.micheledisograt.mdt.service;

import org.springframework.stereotype.Service;

import com.micheledisograt.mdt.dto.AdminDTO;

@Service
public interface AdminService {

	AdminDTO findAdminById(Long id);

}
