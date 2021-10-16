package br.com.alura.supplier.rest.server;

import br.com.alura.supplier.model.Product;
import br.com.alura.supplier.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);
    private final ProductService productService;

    @RequestMapping("/{state}")
    public List<Product> getProductsByState(@PathVariable("state") String state) {
        return productService.getProdutosPorEstado(state);
    }
}
