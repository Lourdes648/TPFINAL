package ar.edu.unju.edm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ar.edu.unju.edm.model.Compra;
import ar.edu.unju.edm.model.Usuario;

@Repository
public interface ICompraDAO extends CrudRepository<Compra, Long>{
	public Iterable<Compra> findByUsuario(Usuario usuario);
	
}
