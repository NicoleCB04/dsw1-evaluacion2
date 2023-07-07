package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.lang.String;


@Controller	
@RequestMapping(path="/") 

public class SinDbController {
    @GetMapping(path="/")
	public @ResponseBody String home() {
		return "Hola - Nicole";
	}
    @GetMapping(path="/idat/codigo")
	public @ResponseBody String codigo() {
		return "Calcina Baquerizo ";
	}
    @GetMapping(path="/idat/nombre-completo")
	public @ResponseBody String nc() {
		return "Nicole Calcina Baquerizo";
	}
}