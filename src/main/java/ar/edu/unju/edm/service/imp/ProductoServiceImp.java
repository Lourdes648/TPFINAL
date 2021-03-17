package ar.edu.unju.edm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.repository.IProductoDAO;
import ar.edu.unju.edm.repository.ICompraDAO;
import ar.edu.unju.edm.service.IProductoService;

@Service
public class ProductoServiceImp implements IProductoService {

	@Autowired
	IProductoDAO iProductoDAO;
	@Autowired
	Producto producto;
	@Autowired
	ICompraDAO iCompraDAO;
	
	@Override
	public void guardarProducto(Producto producto) {
		iProductoDAO.save(producto);
	}

	@Override
	public List<Producto> listarProductos() {
		return (List<Producto>) iProductoDAO.findAll();
	}

}


