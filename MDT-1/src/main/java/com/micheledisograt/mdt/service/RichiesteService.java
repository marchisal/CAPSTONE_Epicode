package com.micheledisograt.mdt.service;

import org.springframework.stereotype.Service;

import com.micheledisograt.mdt.to.RichiesteTO;

@Service
public interface RichiesteService {

	Long createRichiestaApp(RichiesteTO r);

	Long createRichiestaPrev(RichiesteTO r);
}
