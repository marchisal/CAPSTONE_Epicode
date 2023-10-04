
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
 * The Class Invoice.
 */
@Entity
@Table (name = "invoice")

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new invoice.
 */
@NoArgsConstructor

/**
 * Instantiates a new invoice.
 *
 * @param id the id
 * @param User the user
 * @param invoiceNumber the invoice number
 * @param quantity the quantity
 * @param description the description
 * @param price the price
 */
@AllArgsConstructor
public class Invoice {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/** The User. */
	@Column (name = "user")
	private Long User;
	
	/** The invoice number. */
	@Column (name = "invoice_number")
	private String invoiceNumber;
	
	/** The quantity. */
	@Column (name = "quantity")
	private Integer quantity;
	
	/** The description. */
	@Column (name = "description")
	private String description;
	
	/** The price. */
	@Column (name = "price")
	private Integer price;
}
