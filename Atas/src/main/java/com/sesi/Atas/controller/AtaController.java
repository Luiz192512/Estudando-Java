package com.sesi.Atas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.sesi.Atas.model.Ata;
import com.sesi.Atas.repository.AtaRepository;
import com.sesi.Atas.service.AtaService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping("/ata")
public class AtaController {
	
	private final AtaService ataService;

    public AtaController(AtaService ataService) {
        this.ataService = ataService;
    }

    @Autowired
    private AtaRepository ataRepository;

    @GetMapping
    public String listarAtas(Model model) {
        List<Ata> atas = ataRepository.findAll();
        model.addAttribute("ata", atas);
        return "Ata/Consultar-Ata";
    }

    @GetMapping("/nova")
    public String novaAta(Model model) {
        model.addAttribute("ata", new Ata());
        return "Ata/Emitir-Ata";
    }

    @PostMapping("/salvar-ata")
    public String salvarAta(@ModelAttribute Ata ata) {
        ataRepository.save(ata);
        return "Ata/Consultar-Ata";
    }

    @GetMapping("/{id}")
    public String detalharAta(@PathVariable Long id, Model model) {
        Ata ata = ataRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Ata inválida"));
        model.addAttribute("ata", ata);
        return "Ata/detalhar";
    }
    @GetMapping("/buscar")
    public String buscarAtas(
        @RequestParam(value = "titulo", required = false) String titulo,
        @RequestParam(value = "dataEmissao", required = false) String dataEmissaoStr,
        @RequestParam(value = "palavraChave", required = false) String palavraChave,
        Model model) {

        LocalDate dataEmissao = null;

        if (dataEmissaoStr != null && !dataEmissaoStr.isEmpty()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            dataEmissao = LocalDate.parse(dataEmissaoStr, formatter);
        }

        List<Ata> atas = ataService.buscarAtas(titulo, dataEmissao, palavraChave);
        System.out.println(atas.toString());
        model.addAttribute("ata", atas);
        return "Ata/Consultar-Ata";
    }
    
}

