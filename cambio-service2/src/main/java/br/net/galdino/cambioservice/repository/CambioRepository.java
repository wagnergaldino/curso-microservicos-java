package br.net.galdino.cambioservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.galdino.cambioservice.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {
	Cambio findByFromAndTo(String from, String to);
}
