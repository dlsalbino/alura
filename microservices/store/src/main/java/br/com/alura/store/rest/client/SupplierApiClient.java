package br.com.alura.store.rest.client;

import br.com.alura.store.rest.dto.InfoOrderDto;
import br.com.alura.store.rest.dto.InfoSupplierDto;
import br.com.alura.store.rest.dto.PurchaseItemDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("supplier")
public interface SupplierApiClient {

    @GetMapping("/info/{state}")
    InfoSupplierDto getSupplierInfo(@PathVariable String state);

    @PostMapping("/order")
    InfoOrderDto performOrder(List<PurchaseItemDto> items);
}
