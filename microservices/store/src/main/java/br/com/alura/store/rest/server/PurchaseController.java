package br.com.alura.store.rest.server;

import br.com.alura.store.model.Purchase;
import br.com.alura.store.rest.dto.PurchaseDto;
import br.com.alura.store.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
@RequiredArgsConstructor
public class PurchaseController {

    private static final Logger logger = LoggerFactory.getLogger(PurchaseController.class);
    private final PurchaseService purchaseService;

    @PostMapping
    Purchase create(@RequestBody PurchaseDto purchaseDto) {
        logger.info("STARTED - Receiving a purchase request for state: {}", purchaseDto.getAddressDto().getState());
        Purchase purchase = purchaseService.performPurchase(purchaseDto);
        logger.info("FINISHED - Process purchase request with order number: {}", purchase.getOrderId());
        return purchase;
    }
}
