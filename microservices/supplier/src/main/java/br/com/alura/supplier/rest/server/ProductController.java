package br.com.alura.supplier.rest.server;

import br.com.alura.supplier.model.Product;
import br.com.alura.supplier.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @RequestMapping("/{state}")
    public List<Product> getProductsByState(@PathVariable("state") String state) {
        return productService.getProdutosPorEstado(state);
    }
}
