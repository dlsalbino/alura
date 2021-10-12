package br.com.alura.supplier.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDto {

    @JsonProperty("idReserva")
    public Integer idReservation;

    @JsonProperty("tempoDePreparo")
    public Integer timeToPrepare;
}
