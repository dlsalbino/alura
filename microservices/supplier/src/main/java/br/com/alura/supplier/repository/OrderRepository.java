package br.com.alura.supplier.repository;

import br.com.alura.supplier.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
