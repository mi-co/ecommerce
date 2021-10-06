package es.vass.ecommerce.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.vass.ecommerce.dto.request.PriceGetRequest;
import es.vass.ecommerce.dto.response.PriceGetResponse;
import es.vass.ecommerce.exception.PriceNotFoundException;
import es.vass.ecommerce.service.EcommerceService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/ecommerce")
@Validated
public class EcommerceController {

	private EcommerceService ecommerceService;

	public EcommerceController(EcommerceService ecommerceService) {
		this.ecommerceService = ecommerceService;
	}
	
	@ApiOperation(
			value = "Obtener precio final (pvp) y la tarifa que aplica a un producto de una cadena entre unas fechas determinadas.", 
			nickname = "Obtener pvp y tarifa.",
			response = PriceGetResponse.class)
	@ApiResponses(
		      value = {
		        @ApiResponse(code = 200, message = "Success"),
		        @ApiResponse(code = 400, message = "Bad Request"),
		        @ApiResponse(code = 404, message = "Not Found"),
		        @ApiResponse(code = 500, message = "Internal Server Error")
	      })
	  @GetMapping(
			  path = "/pricerange",
			  produces = {MediaType.APPLICATION_JSON_VALUE})
	  public ResponseEntity<PriceGetResponse> getPriceRange(@Valid @NotNull PriceGetRequest request) throws PriceNotFoundException {
		return new ResponseEntity<>(ecommerceService.getPriceRange(request), HttpStatus.OK);
	  }
}
