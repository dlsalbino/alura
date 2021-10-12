package br.com.alura.store.service;

import br.com.alura.store.controller.dto.InfoSupplierDto;
import br.com.alura.store.controller.dto.PurchaseDto;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PurchaseService {

    public void performPurchase(PurchaseDto purchaseDto) {

        RestTemplate client = new RestTemplate();
        ResponseEntity<InfoSupplierDto> exchange = client.exchange("http://localhost:8081/supplier/info/" + purchaseDto.getAddressDto().getState(),
                HttpMethod.GET, null, InfoSupplierDto.class);

        System.out.println(exchange.getBody());
    }
}
