package br.com.alura.supplier.service;

import br.com.alura.supplier.model.InfoSupplier;
import br.com.alura.supplier.repository.InfoRepository;
import br.com.alura.supplier.rest.server.InfoController;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoService {

    private static final Logger log = LoggerFactory.getLogger(InfoService.class);
    private final InfoRepository infoRepository;

    public InfoSupplier getInfoByState(String state) {
        return infoRepository.findByState(state);
    }
}
