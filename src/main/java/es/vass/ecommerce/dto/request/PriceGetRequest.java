package es.vass.ecommerce.dto.request;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class PriceGetRequest {

    @NotNull(message = "Date cannot be null")
    @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
    private Date date;
    @NotNull(message = "Product id cannot be null")
    private Long idProduct;
    @NotNull(message = "Brand id cannot be null")
    private Long idBrand;

}
