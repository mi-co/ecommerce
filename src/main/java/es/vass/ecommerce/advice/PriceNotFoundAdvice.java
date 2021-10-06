package es.vass.ecommerce.advice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import es.vass.ecommerce.exception.PriceNotFoundException;

@ControllerAdvice
public class PriceNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(PriceNotFoundException.class)
	ResponseEntity<Object> priceRangeNotFoundHandler(PriceNotFoundException ex) {
	    Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", ex.getMessage());
        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
	}
}
