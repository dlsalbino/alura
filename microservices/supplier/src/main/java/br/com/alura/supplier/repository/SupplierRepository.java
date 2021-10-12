package br.com.alura.supplier.repository;

import br.com.alura.supplier.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

@Deprecated
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    Supplier findByState(String state);
}
