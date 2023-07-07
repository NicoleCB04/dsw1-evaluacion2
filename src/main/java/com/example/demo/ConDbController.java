package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
// imports for use List, Map, String and Object
import java.lang.String;

@Controller	// This means that this class is a Controller
@RequestMapping(path="/api/curso") 
public class ConDbController {
    
    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping(path="/listar")
	public @ResponseBody Iterable<Curso> getAllUsers() {
		return cursoRepository.findAll();
	}


    @PostMapping(path="/nuevo") // Map ONLY POST Requests
	public @ResponseBody String nuevo (@RequestParam String name
			, @RequestParam Integer credits) {
		Curso n = new Curso();
		n.setName(name);
		n.setCredits(credits);
		cursoRepository.save(n);
		return "Curso guardado";
	}

    @DeleteMapping(path="/eliminar")
	public @ResponseBody String eliminar (@RequestParam Integer id) {
		Curso n = new Curso();
		n.setId(id);
		cursoRepository.delete(n);
		return "Curso eliminado";
	}

}
