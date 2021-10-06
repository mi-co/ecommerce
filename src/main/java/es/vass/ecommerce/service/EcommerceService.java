package es.vass.ecommerce.service;

import es.vass.ecommerce.dto.request.PriceGetRequest;
import es.vass.ecommerce.dto.response.PriceGetResponse;
import es.vass.ecommerce.exception.PriceNotFoundException;

public interface EcommerceService {

	PriceGetResponse getPriceRange(PriceGetRequest request) throws PriceNotFoundException;

}
