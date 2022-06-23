package apinfl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apinfl.entity.Player;
import apinfl.repository.PlayerRepository;
@RestController
@RequestMapping(value = "/api")
public class PlayerController {
	@Autowired
	PlayerRepository repository;

	@PostMapping
	public String saveplayer(@RequestBody Player pl) {
		repository.save(pl);
		System.out.println("guardando a "+pl.getName());
		return "guardado el pl";
		
	}
	
	@GetMapping("/all")
	public String mostrar() {
		repository.findAll();
		return "mostrar";
	}
}
