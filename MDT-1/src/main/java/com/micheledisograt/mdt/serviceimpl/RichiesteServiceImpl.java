package com.micheledisograt.mdt.serviceimpl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micheledisograt.mdt.entity.Appointment;
import com.micheledisograt.mdt.entity.Quote;
import com.micheledisograt.mdt.entity.User;
import com.micheledisograt.mdt.repository.AppointmentRepository;
import com.micheledisograt.mdt.repository.QuoteRepository;
import com.micheledisograt.mdt.repository.UserRepository;
import com.micheledisograt.mdt.service.RichiesteService;
import com.micheledisograt.mdt.to.RichiesteTO;

@Service
public class RichiesteServiceImpl implements RichiesteService{


	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Autowired
	private QuoteRepository quoteRepository;
	
	@Override
	public Long createRichiestaApp(RichiesteTO r) {
		
		Optional<User> us = userRepository.findUserByFiscalCode(r.getFiscalCode());
		Appointment appointment = new Appointment();
		
		if(!us.isPresent()) {
			User user = new User();
			user.setEmail(r.getEmail());
			user.setFiscalCode(r.getFiscalCode());
			user.setName(r.getName());
			user.setSurname(r.getSurname());
			user.setTelephoneNumber(r.getTelephoneNumber());
			
			User ur = userRepository.save(user);
			
			appointment.setUser(ur.getId());	
		}else{
			appointment.setUser(us.get().getId());
		}
		
		appointment.setTattooDescription(r.getTattooDescription());
		appointment.setTattooSize(r.getTattooSize());
		appointment.setBodyPart(r.getBodyPart());
		try {
			if(r.getTattooImage()!= null) {
				appointment.setImgTattooExample(IOUtils.toByteArray(r.getTattooImage().getBinaryStream()));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return appointmentRepository.save(appointment).getId();
	}
	
	@Override
	public Long createRichiestaPrev(RichiesteTO r) {
		Optional<User> us = userRepository.findUserByFiscalCode(r.getFiscalCode());
		Quote quote = new Quote();
		
		if(!us.isPresent()) {
			User user = new User();
			user.setEmail(r.getEmail());
			user.setFiscalCode(r.getFiscalCode());
			user.setName(r.getName());
			user.setSurname(r.getSurname());
			user.setTelephoneNumber(r.getTelephoneNumber());
			
			User ur = userRepository.save(user);
			
			quote.setUser(ur.getId());	
		}else{
			quote.setUser(us.get().getId());
		}
		
		quote.setTattooDescription(r.getTattooDescription());
		quote.setTattooSize(r.getTattooSize());
		quote.setBodyPart(r.getBodyPart());
		try {
			if(r.getTattooImage()!= null) {
				quote.setImgTattooExample(IOUtils.toByteArray(r.getTattooImage().getBinaryStream()));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return quoteRepository.save(quote).getId();
	}

}
