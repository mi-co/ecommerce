package es.vass.ecommerce.dto.response;

import lombok.Data;

@Data
public class PriceGetResponse {

	private Long idProduct;
	private Long idBrand;
	private Long priceList;
	private String startDate;
	private String endDate;
	private String price;

}
