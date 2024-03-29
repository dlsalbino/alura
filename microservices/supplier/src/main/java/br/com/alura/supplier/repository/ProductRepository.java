package br.com.alura.supplier.repository;

import br.com.alura.supplier.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByState(String state);

    List<Product> findByIdIn(List<Long> ids);
}
