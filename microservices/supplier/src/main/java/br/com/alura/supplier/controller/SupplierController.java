package br.com.alura.supplier.controller;

import br.com.alura.supplier.controller.dto.InfoSupplierDto;
import br.com.alura.supplier.service.SupplierService.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
@RequiredArgsConstructor
public class SupplierController {

    private final SupplierService supplierService;

    @GetMapping("/info/{state}")
    public InfoSupplierDto getInfoSupplierByState(@PathVariable("state") String state) {
        return supplierService.getInfoByState(state);
    }
}
