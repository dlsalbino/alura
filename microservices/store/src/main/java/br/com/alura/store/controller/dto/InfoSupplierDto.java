package br.com.alura.store.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InfoSupplierDto {

    @JsonProperty("endereco")
    private String address;
}
