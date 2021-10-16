package br.com.alura.store.service;

import br.com.alura.store.model.Purchase;
import br.com.alura.store.rest.client.SupplierApiClient;
import br.com.alura.store.rest.dto.InfoOrderDto;
import br.com.alura.store.rest.dto.InfoSupplierDto;
import br.com.alura.store.rest.dto.PurchaseDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    private static final Logger logger = LoggerFactory.getLogger(PurchaseService.class);
    private final SupplierApiClient client;

    public Purchase performPurchase(PurchaseDto purchaseDto) {

        InfoSupplierDto infoSupplierDto = client.getSupplierInfo(purchaseDto.getAddressDto().getState());

        logger.info("Starting call to SupplierApp...");
        InfoOrderDto infoOrderDto = client.performOrder(purchaseDto.getItems());
        logger.info("Finishing call to SupplierApp.");

        System.out.println(infoSupplierDto.getAddress());

        return Purchase.builder()
                .orderId(infoOrderDto.getId())
                .timeToPrepare(infoOrderDto.getTimeToPrepare())
                .destinationAddress(purchaseDto.getAddressDto().toString())
                .build();
    }
}
