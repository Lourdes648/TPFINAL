package ar.edu.unju.edm.service;

import java.util.List;
import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Producto;

@Service
public interface IProductoService {
	
	public void guardarProducto(Producto producto);
	public List<Producto> listarProductos();

}
