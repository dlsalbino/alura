package br.com.alura.store.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class PurchaseDto {

    @JsonProperty(value = "itens")
    private List<PurchaseItemDto> items;

    @JsonProperty(value = "endereco")
    private AddressDto addressDto;
}
