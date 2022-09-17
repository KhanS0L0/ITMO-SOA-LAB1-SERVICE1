package ru.itmo.soa.firstservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class AddressDto {

    @Schema(description = "Адрес организации (улица)")
    private String street;

}
