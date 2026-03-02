package com.sesi.tarefas.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sesi.tarefas.model.Tarefa;
import com.sesi.tarefas.repository.TarefaCategoriaRepository;
import com.sesi.tarefas.repository.TarefaRepository;
import com.sesi.tarefas.repository.UsuarioRepository;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {
	@Autowired
	TarefaRepository tarefaRepository;
	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	TarefaCategoriaRepository tarefaCategoriaRepository;
	
	@GetMapping("/formularioTarefa")
	public String mostrarFormulario(Model modelo) {
		modelo.addAttribute("tarefa", new Tarefa());
        modelo.addAttribute("categorias", tarefaCategoriaRepository.findAll());
        modelo.addAttribute("usuarios", usuarioRepository.findAll());
		return "formularioTarefa";
		
	}
	@PostMapping("/salvarTarefa")
	public String salvarUsuario(Tarefa tarefa) {
		tarefaRepository.save(tarefa);
		return "redirect:/tarefas/listarTarefas";
	}
	
	@GetMapping("/listarTarefas")
	public String listarTarefas(Model modelo) {
		modelo.addAttribute("tarefas", tarefaRepository.findAll());
		return "listarTarefas";
	}
	@GetMapping("editarTarefa/{id}")
	public String editarTarefa(@PathVariable("id") int id, Model modelo) {
		Optional<Tarefa> tarefaOpt = tarefaRepository.findById(id);
		
		if(tarefaOpt.isPresent()) {
			modelo.addAttribute("tarefa", tarefaOpt.get());
			modelo.addAttribute("categorias", tarefaCategoriaRepository.findAll());
		    modelo.addAttribute("usuarios", usuarioRepository.findAll());
			return "formularioTarefa";
		}else {
			return "redirect:/tarefas/listarTarefas";
		}
	}
	@GetMapping("/excluirTarefa/{id}")
	public String excluirTarefa(@PathVariable("id") int id) {
		tarefaRepository.deleteById(id);
		return "redirect:/tarefas/listarTarefas";
	}
	
}
