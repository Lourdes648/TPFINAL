package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.service.IProductoService;
import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class Main {
	
	@Autowired
	IUsuarioService iUsuarioService;
	@Autowired
	IProductoService iProductoService;
	@Autowired
	Usuario usuario;
	@Autowired
	Producto producto;

	
	@GetMapping({"/","/login","/home","/login?error=true"})
	public String login(Model model) {
		
		iProductoService.guardarProducto(new Producto((long)1, "AURICULARES GAMING ZIVA TRUST", 10, "Ideal para juegos en línea, música y aplicaciones de chat",3400.0, "si"));
		iProductoService.guardarProducto(new Producto((long)2, "MONITOR LG LED 19 19M38A-B", 2, "Protege tus ojos y mira con comodidad",8400.0, "si"));
		iProductoService.guardarProducto(new Producto((long)3, "MOUSE TRUST ZIVA", 34, "Para usuarios diestros y zurdos",3600.0, "si"));
		iProductoService.guardarProducto(new Producto((long)4, "TECLADO TRUST ZIVA MEDIA ES", 5, "Escritura cómoda y silenciosa.",2600.0, "si"));
		iUsuarioService.guardarUsuario(new Usuario ((long)1,43526613,"luz","luz1","Luz","Alvarez","Admin"));
		iUsuarioService.guardarUsuario(new Usuario((long)2,43526614,"pablo","1234","Pablo","Alvarez","Cliente"));
		
		
		return "login";
	}
	
	
}