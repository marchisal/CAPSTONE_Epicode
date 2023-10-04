/*
 * 
 */
package com.micheledisograt.mdt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// TODO: Auto-generated Javadoc
/**
 * The Class Works.
 */
@Entity
@Table (name = "works")

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new works.
 */
@NoArgsConstructor

/**
 * Instantiates a new works.
 *
 * @param id the id
 * @param title the title
 * @param weight the weight
 * @param image the image
 */
@AllArgsConstructor
public class Works {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/** The title. */
	@Column (name = "title")
	private String title;
	
	/** The weight. */
	@Column (name = "weight")
	private Double weight;
	
	/** The image. */
	@Lob
	@Column (name = "image")
	private byte[] image;
}
