package com.margosha.kse.calories.business.dto.subdto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductRecordInRequestDto {

    @NotNull(message = "Product id is obligatory!")
    @JsonProperty("product_id")
    private java.util.UUID productId;

    @NotNull(message = "Quantity is obligatory!")
    @DecimalMin(value = "0.1", message = "Quantity cannot go below 0.1 :((")
    private Double quantity;
}
