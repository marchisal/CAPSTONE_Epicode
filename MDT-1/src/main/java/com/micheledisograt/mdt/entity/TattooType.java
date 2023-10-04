package com.micheledisograt.mdt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// TODO: Auto-generated Javadoc
/**
 * The Class TattooType.
 */
@Entity
@Table (name = "tattoo_type")

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new tattoo type.
 *
 * @param id the id
 * @param tattooDescription the tattoo description
 * @param price the price
 */
@AllArgsConstructor

/**
 * Instantiates a new tattoo type.
 */
@NoArgsConstructor
public class TattooType {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/** The tattoo description. */
	@Column (name = "tattoo_description")
	private String tattooDescription;
	
	/** The price. */
	@Column (name = "price")
	private Integer price;
}
