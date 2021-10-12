package br.com.alura.supplier.service;

import br.com.alura.supplier.model.InfoSupplier;
import br.com.alura.supplier.repository.InfoRepository;
import br.com.alura.supplier.rest.dto.InfoSupplierDto;
import br.com.alura.supplier.model.Supplier;
import br.com.alura.supplier.repository.SupplierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplierService {

    private final InfoRepository supplierRepository;

    public InfoSupplierDto getInfoByState(String state) {
        InfoSupplier supplierByState = supplierRepository.findByState(state);
        return InfoSupplierDto.builder()
                .id(supplierByState.getId())
                .name(supplierByState.getName())
                .state(supplierByState.getState())
                .address(supplierByState.getAddress())
                .build();
    }
}
