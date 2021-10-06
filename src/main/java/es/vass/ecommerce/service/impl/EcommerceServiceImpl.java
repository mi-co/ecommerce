package es.vass.ecommerce.service.impl;

import static java.lang.String.format;

import java.util.List;

import org.springframework.stereotype.Service;

import es.vass.ecommerce.dto.request.PriceGetRequest;
import es.vass.ecommerce.dto.response.PriceGetResponse;
import es.vass.ecommerce.entity.Price;
import es.vass.ecommerce.exception.PriceNotFoundException;
import es.vass.ecommerce.mapper.PriceMapperService;
import es.vass.ecommerce.repository.PriceRepository;
import es.vass.ecommerce.service.EcommerceService;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class EcommerceServiceImpl implements EcommerceService {

	private PriceRepository priceRepository;
	private PriceMapperService priceMapperService;
	
	public EcommerceServiceImpl(PriceRepository priceRepository, PriceMapperService priceMapperService) {
		this.priceRepository = priceRepository;
		this.priceMapperService = priceMapperService;
	}
	
	@Override
	public PriceGetResponse getPriceRange(PriceGetRequest request) throws PriceNotFoundException{
		log.info(format("---> getPriceRange for date: %tD and idProduct: %d and idBrand:%d", request.getDate(), request.getIdProduct(), request.getIdBrand()));
				
		//Cambiar por findFirstby...
		List<Price> findListPrice = priceRepository.findByIdProductIdBrand(request.getIdProduct(), request.getIdBrand(), request.getDate());
		
		if(findListPrice.isEmpty()) {
			throw new PriceNotFoundException(request.getDate(), request.getIdProduct(), request.getIdBrand());
		}
	
		PriceGetResponse responseDTO = priceMapperService.priceToPriceGetResponseDTO(findListPrice.get(0));
		
		return responseDTO;
	}

}
