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
 * The Class Quote.
 */
@Entity
@Table (name = "quote")

/**
 * To string.
 * 
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new quote.
 *
 * @param id the id
 * @param user the user
 * @param price the price
 * @param accepted the accepted
 */
@AllArgsConstructor

/**
 * Instantiates a new quote.
 */
@NoArgsConstructor
public class Quote {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column (name = "user")
	private Long user;
	@Column (name = "tattoo_description")
	private String tattooDescription;
	@Column (name = "tattoo_size")
	private String tattooSize;
	@Column (name = "body_part")
	private String bodyPart;
	@Column (name = "price")
	private Integer price;
	@Column (name = "accepted")
	private Boolean accepted;
	@Lob
	@Column (name = "img_tattoo_ex")
	private byte[] imgTattooExample;
}
