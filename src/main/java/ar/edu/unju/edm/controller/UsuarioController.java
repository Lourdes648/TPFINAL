package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Compra;
import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.service.ICompraService;
import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	Usuario usuario;
	Compra compra;
	@Autowired
	IUsuarioService iUsuarioService;
	ICompraService iCompraService;
	
	@GetMapping("/Cliente")
	public String Cliente(Model model) {
		return "cliente";
	}
	
	@PostMapping("/Cliente")
	public String ClienteP(Model model) {
		return "cliente";
	}
	
	@GetMapping("/Admin")
	public String Admin(Model model) {
		return "admin";
	}
	
	
	@GetMapping("/consultaUsuario")
	public String consultaUsuario(Model model) {
		Compra res = new Compra();
		model.addAttribute("user", res);
		return "consultaUsuario";
	}
	
	@PostMapping("/consultaUsuario")
	public String buscarUsuario(@ModelAttribute("user") Compra compr, Model model) {
		return mostrarUsuario(compr, model);
	}
	
	@GetMapping("/usuarioEncontrado")
	public String mostrarUsuario(Compra compr, Model model) {
		model.addAttribute("compras",iCompraService.buscarCompraPorUsuario(compr.getUsuario()));
		return "usuarioEncontrado";
	}
	
	
	@GetMapping("/nuevoUsuario")
	public String nuevoUsuario(Model model) {
		model.addAttribute("nuevoUsu", new Usuario());
		return "nuevoUsuario";
	}
	
	@PostMapping("/nuevoUsuario")
	public String nuevoUsuarioPost(@ModelAttribute("nuevoUsu") Usuario usuario, Model model) {
		iUsuarioService.guardarUsuario(usuario);
		return "admin";
	}
	
}