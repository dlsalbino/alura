package br.com.alura.store.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Collection;

@Getter
@Setter
@ToString
public class PurchaseDto {

    @JsonProperty(value = "itens")
    private Collection<PurchaseItemDto> items;

    @JsonProperty(value = "endereco")
    private AddressDto addressDto;
}
