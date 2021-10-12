package br.com.alura.store.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {

    @JsonProperty("rua")
    private String street;

    @JsonProperty("numero")
    private String number;

    @JsonProperty("estado")
    private String state;
}
