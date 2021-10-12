package br.com.alura.supplier.repository;

import br.com.alura.supplier.model.InfoSupplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends CrudRepository<InfoSupplier, Long> {

    InfoSupplier findByState(String estado);
}
