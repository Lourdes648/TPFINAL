package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.service.IProductoService;

@Controller
public class ProductoController {

	@Autowired
	Producto producto;
	@Autowired
	IProductoService iProductoService;
	
	@GetMapping("/nuevoProducto")
	public String nuevoProducto(Model model) {
		model.addAttribute("nuevoProd",new Producto());
		return "nuevoProducto";
	}
	@PostMapping("/nuevoProducto")
	public String nuevoProductoPost(@ModelAttribute("nuevoProd") Producto producto, Model model) {
		iProductoService.guardarProducto(producto);
		return "admin";
	}
	
}

