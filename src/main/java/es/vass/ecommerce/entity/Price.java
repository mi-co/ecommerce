package es.vass.ecommerce.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "PRICES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Price implements Serializable{

	private static final long serialVersionUID = -6368489842714779702L;
		
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="BRAND_ID", nullable = false,
	referencedColumnName = "BRAND_ID")
	private Brand idBrand;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="PRODUCT_ID", nullable = false,
	referencedColumnName = "PRODUCT_ID")
	private Product idProduct;
	
	@Column(name = "START_DATE", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	
	@Column(name = "END_DATE", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	
	@Id
	@Column(name = "PRICE_LIST", nullable = false)
	private Long priceList;
	
	@Column(name = "PRIORITY", nullable = false)
	private Long priority;
	
	@Column(name = "PRICE", nullable = false)
	private Float price;
	
	@Column(name = "CURR", nullable = false)
	private String currency;
	
	
	
	
}
