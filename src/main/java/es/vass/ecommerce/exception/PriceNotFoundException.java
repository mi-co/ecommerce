package es.vass.ecommerce.exception;

import java.util.Date;

import static java.lang.String.format;

public class PriceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public PriceNotFoundException(Date date, Long idProduct, Long idBrand) {
        super(format("Could not find range price for date: %tD and idProduct: %d and idBrand:%d", date, idProduct, idBrand));
    }

}
