package br.com.alura.supplier.service;

import br.com.alura.supplier.model.InfoSupplier;
import br.com.alura.supplier.repository.InfoRepository;
import br.com.alura.supplier.rest.dto.InfoSupplierDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplierService {

    private static final Logger log = LoggerFactory.getLogger(SupplierService.class);
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
