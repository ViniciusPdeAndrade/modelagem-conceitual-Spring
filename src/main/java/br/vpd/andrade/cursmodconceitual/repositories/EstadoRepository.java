package br.vpd.andrade.cursmodconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.vpd.andrade.cursmodconceitual.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
		

}
