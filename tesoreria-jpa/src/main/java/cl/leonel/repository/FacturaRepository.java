package cl.leonel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.leonel.modelo.Factura;

public interface FacturaRepository extends JpaRepository<Factura,Long> {

}
