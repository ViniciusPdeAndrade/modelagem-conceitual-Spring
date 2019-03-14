package br.vpd.andrade.cursmodconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.vpd.andrade.cursmodconceitual.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
		

}
