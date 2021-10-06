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
@Table(name = "BRANDS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand implements Serializable{
	private static final long serialVersionUID = -6368489842714779702L;
	
	@Id
	@Column(name = "BRAND_ID", nullable = false)
	private Long idBrand;
	
	@Column(name = "BRAND_NAME", nullable = false)
	private String name;

}
