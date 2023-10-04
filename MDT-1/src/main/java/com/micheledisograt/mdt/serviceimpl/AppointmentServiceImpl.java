package com.micheledisograt.mdt.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micheledisograt.mdt.entity.Appointment;
import com.micheledisograt.mdt.entity.User;
import com.micheledisograt.mdt.repository.AppointmentRepository;
import com.micheledisograt.mdt.repository.UserRepository;
import com.micheledisograt.mdt.service.AppointmentService;
import com.micheledisograt.mdt.to.RichiesteTO;

@Service
public class AppointmentServiceImpl implements AppointmentService{

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Autowired
	private UserRepository userRepository;

	
	
	@Override
	public Long updateApp(Long id, RichiesteTO appuntamentoto) {
		
		Appointment oldApp = appointmentRepository.findById(id).get();
		
		
		Appointment appointment = new Appointment();
		User newUser = new User();
		
		newUser.setId(oldApp.getUser());
		newUser.setName(appuntamentoto.getName());
		newUser.setSurname(appuntamentoto.getSurname());
		newUser.setFiscalCode(appuntamentoto.getFiscalCode());
		newUser.setTelephoneNumber(appuntamentoto.getTelephoneNumber());
		newUser.setEmail(appuntamentoto.getEmail());
		
		userRepository.save(newUser);
		
		
		appointment.setTattooDescription(appuntamentoto.getTattooDescription());
		appointment.setTattooSize(appuntamentoto.getTattooSize());
		appointment.setBodyPart(appuntamentoto.getBodyPart());
		
		appointment.setId(oldApp.getId());
		appointment.setUser(oldApp.getUser());
		
		appointmentRepository.save(appointment);
		
		return id;
		
	}

	@Override
	public Long deleteAppById(Long id) {
		
		Appointment app = appointmentRepository.findById(id).get();
		appointmentRepository.delete(app);
		return app.getId();
	}

	
}
