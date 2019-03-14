package br.vpd.andrade.cursmodconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.vpd.andrade.cursmodconceitual.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
		

	@Transactional(readOnly=true)
	Cliente findByEmail(String email);
	
}
