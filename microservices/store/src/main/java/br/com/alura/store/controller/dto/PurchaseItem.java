package br.com.alura.store.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseItem {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("quantidade")
    private Integer amount;
}
