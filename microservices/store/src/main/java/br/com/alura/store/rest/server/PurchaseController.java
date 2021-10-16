package br.com.alura.store.rest.server;

import br.com.alura.store.model.Purchase;
import br.com.alura.store.rest.dto.PurchaseDto;
import br.com.alura.store.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseService purchaseService;

    @PostMapping
    Purchase create(@RequestBody PurchaseDto purchaseDto) {
        return purchaseService.performPurchase(purchaseDto);
    }
}