package br.com.alura.store.controller;

import br.com.alura.store.controller.dto.PurchaseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @PostMapping
    PurchaseDto create(@RequestBody PurchaseDto purchaseDto){
        System.out.println(purchaseDto);
        return purchaseDto;
    }
}
