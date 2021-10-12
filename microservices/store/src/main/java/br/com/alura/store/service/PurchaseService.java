package br.com.alura.store.service;

import br.com.alura.store.controller.dto.InfoSupplierDto;
import br.com.alura.store.controller.dto.PurchaseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final RestTemplate client;

    public void performPurchase(PurchaseDto purchaseDto) {

        ResponseEntity<InfoSupplierDto> exchange = client.exchange("http://supplier/supplier/info/" + purchaseDto.getAddressDto().getState(),
                HttpMethod.GET, null, InfoSupplierDto.class);

        System.out.println(exchange.getBody());
    }
}
