package com.micheledisograt.mdt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micheledisograt.mdt.dto.RequestPrevDTO;

@Service
public interface RequestPrevService {

	RequestPrevDTO findReqPrevById(Long id);

	List<RequestPrevDTO> findAllReqPrev();

	List<RequestPrevDTO> findByName(String name);

}
