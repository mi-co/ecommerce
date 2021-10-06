package es.vass.ecommerce.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "PRODUCTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable{
	private static final long serialVersionUID = -6368489842714779702L;
	
	@Id
	@Column(name = "PRODUCT_ID", nullable = false)
	private Long idProduct;

	@Column(name = "PRODUCT_NAME", nullable = false)
	private String name;
}
