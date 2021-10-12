package br.com.alura.supplier.service;

import br.com.alura.supplier.model.Product;
import br.com.alura.supplier.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getProdutosPorEstado(String state) {
        return productRepository.findByState(state);
    }
}
