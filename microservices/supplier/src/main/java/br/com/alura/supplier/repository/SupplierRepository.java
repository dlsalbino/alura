package br.com.alura.supplier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    Supplier getSupplierByState(String state);

    Supplier findByState(String state);
}
