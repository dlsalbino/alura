package br.com.alura.supplier.rest.server;

import br.com.alura.supplier.rest.dto.InfoSupplierDto;
import br.com.alura.supplier.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InfoController {

    private static final Logger log = LoggerFactory.getLogger(InfoController.class);
    private final SupplierService supplierService;

    @GetMapping("/info/{state}")
    public InfoSupplierDto getInfoSupplierByState(@PathVariable("state") String state) {
        return supplierService.getInfoByState(state);
    }
}
