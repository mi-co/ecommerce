package es.vass.ecommerce.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import es.vass.ecommerce.dto.response.PriceGetResponse;
import es.vass.ecommerce.entity.Price;

@Mapper(componentModel = "spring")
public interface PriceMapperService {
	
	@Mapping(source = "price.idProduct.idProduct", target = "idProduct")
	@Mapping(source = "price.idBrand.idBrand", target = "idBrand")
	@Mapping(source = "price.priceList", target = "priceList")
	@Mapping(source = "price.startDate", target = "startDate", dateFormat ="yyyy-MM-dd-HH.mm.ss" )
	@Mapping(source = "price.endDate", target = "endDate", dateFormat ="yyyy-MM-dd-HH.mm.ss")
	@Mapping(source = "price.price", target = "price", numberFormat = "##.00")
	PriceGetResponse priceToPriceGetResponseDTO(Price price); 

}
