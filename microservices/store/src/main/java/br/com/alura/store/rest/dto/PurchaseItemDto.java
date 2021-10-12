package br.com.alura.store.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseItemDto {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("quantidade")
    private Integer amount;
}
