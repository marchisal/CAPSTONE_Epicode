package com.micheledisograt.mdt.service;

import org.springframework.stereotype.Service;
import com.micheledisograt.mdt.to.RichiesteTO;

@Service
public interface AppointmentService {



	Long updateApp(Long id, RichiesteTO appuntamentoto);

	Long deleteAppById(Long id);

}
