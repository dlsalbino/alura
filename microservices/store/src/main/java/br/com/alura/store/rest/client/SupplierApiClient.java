package br.com.alura.store.rest.client;

import br.com.alura.store.rest.dto.InfoSupplierDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("supplier")
public interface SupplierApiClient {

    @GetMapping("/info/{state}")
    InfoSupplierDto getSupplierInfo(@PathVariable String state);
}
