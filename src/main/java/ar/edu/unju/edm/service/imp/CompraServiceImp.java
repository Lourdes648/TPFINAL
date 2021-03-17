package ar.edu.unju.edm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Compra;
import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.repository.ICompraDAO;
import ar.edu.unju.edm.service.ICompraService;

@Service
public class CompraServiceImp implements ICompraService {

	@Autowired
	ICompraDAO iCompraDAO;
	@Autowired
	Compra compra;
	@Autowired
	Usuario usuario;
	
	@Override
	public Compra guardarCompra(Compra compra) {
		return iCompraDAO.save(compra);
	}
	
	@Override
	public List<Compra> listarCompras() {
		return (List<Compra>) iCompraDAO.findAll();
	}

	@Override
	public void eliminarCompra(Long compra) {
		iCompraDAO.deleteById(compra);
	}

	@Override
	public Iterable<Compra> buscarCompraPorUsuario(Usuario usuario) {
		return iCompraDAO.findByUsuario(usuario);
	}

}
