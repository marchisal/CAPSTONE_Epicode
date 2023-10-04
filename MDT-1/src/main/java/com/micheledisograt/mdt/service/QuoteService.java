package com.micheledisograt.mdt.service;

import org.springframework.stereotype.Service;
import com.micheledisograt.mdt.to.RichiesteTO;

@Service
public interface QuoteService {

	
	Long updateQuote(Long id, RichiesteTO quoteto);

	Long deleteQuoteById(Long id);


	

}
