package com.micheledisograt.mdt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micheledisograt.mdt.dto.RequestPrevDTO;
import com.micheledisograt.mdt.repository.QuoteRepository;
import com.micheledisograt.mdt.repository.RequestPrevRepository;
import com.micheledisograt.mdt.repository.UserRepository;
import com.micheledisograt.mdt.service.RequestPrevService;

@Service
public class RequestPrevServiceImpl implements RequestPrevService {

	@Autowired
	RequestPrevRepository reqprevRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	QuoteRepository quoteRepository;
	
	
	//GETONE
	@Override
	public RequestPrevDTO findReqPrevById(Long id) {
		RequestPrevDTO q = reqprevRepository.findReqPrevById(id);
		return q;
	}

	//GETALL
	@Override
	public List<RequestPrevDTO> findAllReqPrev() {
		return reqprevRepository.findAllReqPrev();
	}

	@Override
	public List<RequestPrevDTO> findByName(String name) {
		List<RequestPrevDTO> p = reqprevRepository.findByName(name);
		return p;
	}

}
