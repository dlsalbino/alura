package br.com.alura.supplier.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class InfoSupplierDto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    private String name;

    @JsonProperty("estado")
    private String state;

    @JsonProperty("endereco")
    private String address;
}
