package br.com.alura.store.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InfoOrderDto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("timeToPrepare")
    private Integer timeToPrepare;
}
