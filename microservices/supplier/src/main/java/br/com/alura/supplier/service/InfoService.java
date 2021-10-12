package br.com.alura.supplier.service;

import br.com.alura.supplier.model.InfoSupplier;
import br.com.alura.supplier.repository.InfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoService {

    private final InfoRepository infoRepository;

    public InfoSupplier getInfoByState(String state) {
        return infoRepository.findByState(state);
    }
}
