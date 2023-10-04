package com.micheledisograt.mdt.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.micheledisograt.mdt.entity.Quote;
import com.micheledisograt.mdt.entity.User;
import com.micheledisograt.mdt.repository.QuoteRepository;
import com.micheledisograt.mdt.repository.UserRepository;
import com.micheledisograt.mdt.service.QuoteService;
import com.micheledisograt.mdt.to.RichiesteTO;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository quoteRepository;
	
	@Autowired
	private UserRepository userRepository;

	


	@Override
	public Long updateQuote(Long id, RichiesteTO quoteto) {

		Quote oldQuote = quoteRepository.findById(id).get();
		
		Quote quote = new Quote();
		User newUser = new User();
		
		newUser.setId(oldQuote.getUser());
		newUser.setName(quoteto.getName());
		newUser.setSurname(quoteto.getSurname());
		newUser.setFiscalCode(quoteto.getFiscalCode());
		newUser.setTelephoneNumber(quoteto.getTelephoneNumber());
		newUser.setEmail(quoteto.getEmail());
		
		userRepository.save(newUser);
		
		quote.setTattooDescription(quoteto.getTattooDescription());
		quote.setTattooSize(quoteto.getTattooSize());
		quote.setBodyPart(quoteto.getBodyPart());
		
		quote.setId(oldQuote.getId());
		quote.setUser(oldQuote.getUser());
		
		quoteRepository.save(quote);
		
		return id;
	}

	@Override
	public Long deleteQuoteById(Long id) {
		
		Quote quote = quoteRepository.findById(id).get();
		quoteRepository.delete(quote);
		return quote.getId();
	}

	
	
	
}
