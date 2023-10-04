package com.micheledisograt.mdt.to;

import java.sql.Blob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RichiesteTO {

	private String name;
	private String surname;
	private String fiscalCode;
	private String telephoneNumber;
	private String email;
	private String tattooDescription;
	private String tattooSize;
	private String bodyPart;
	private Blob tattooImage;

}
