package br.com.alura.store.service;

import br.com.alura.store.rest.client.SupplierApiClient;
import br.com.alura.store.rest.dto.InfoSupplierDto;
import br.com.alura.store.rest.dto.PurchaseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final SupplierApiClient client;

    public void performPurchase(PurchaseDto purchaseDto) {

        InfoSupplierDto infoSupplierDto = client.getSupplierInfo(purchaseDto.getAddressDto().getState());

        System.out.println(infoSupplierDto.getAddress());
    }
}
