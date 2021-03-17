package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Compra;
import ar.edu.unju.edm.model.Usuario;

@Service
public interface ICompraService {
	
	public Compra guardarCompra (Compra compra);
	public List<Compra>listarCompras();
	public void eliminarCompra (Long compra);
	public Iterable<Compra> buscarCompraPorUsuario(Usuario usuario);

}
