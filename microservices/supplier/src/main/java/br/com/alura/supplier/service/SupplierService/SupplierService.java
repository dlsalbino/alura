package br.com.alura.supplier.service.SupplierService;

import br.com.alura.supplier.controller.dto.InfoSupplierDto;
import br.com.alura.supplier.repository.Supplier;
import br.com.alura.supplier.repository.SupplierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplierService {

    private final SupplierRepository supplierRepository;

    public InfoSupplierDto getInfoByState(String state) {
        Supplier supplierByState = supplierRepository.findByState(state);
        return InfoSupplierDto.builder()
                .id(supplierByState.getId())
                .name(supplierByState.getName())
                .state(supplierByState.getState())
                .address(supplierByState.getAddress())
                .build();
    }
}
