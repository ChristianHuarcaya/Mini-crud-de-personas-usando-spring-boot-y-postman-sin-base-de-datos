package com.idat.semana1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idat.semana1.Entidad.Persona;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@GetMapping
	public List<Persona> listar() {
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona(1, "cristian", "huarcaya"));
		lista.add(new Persona(2, "dior", "dias"));
		lista.add(new Persona(3, "mary", "camo"));
		lista.add(new Persona(4, "luz", "quin"));
		return lista;

	}

	@GetMapping(value = "/todos")
	public List<Persona> listartodos() {
		return listar();
	}

	@GetMapping(value = "/masculino")
	public List<Persona> listarMasculino() {
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona(1, "cristian", "huarcaya"));
		lista.add(new Persona(2, "dior", "dias"));

		return lista;
	}

	@GetMapping(value = "/femenino")
	public List<Persona> listarFemenino() {
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona(3, "mary", "camo"));
		lista.add(new Persona(4, "luz", "quin"));

		return lista;
	}

	@GetMapping(value = "/buscarRP")
	public Persona buscarRP(@RequestParam int id) {

		List<Persona> lista = listar();
		Persona pEncontrada = new Persona();
		for (Persona per : lista) {
			if (per.getIdpersona() == id) {
				pEncontrada = per;
				break;

			}

		}
		return pEncontrada;

	}

	@GetMapping(value = "/buscarPV/{id}")
	public Persona buscarPV(@PathVariable("id") int id) {

		List<Persona> lista = listar();
		Persona pEncontrada = new Persona();
		for (Persona per : lista) {
			if (per.getIdpersona() == id) {
				pEncontrada = per;
				break;

			}

		}
		return pEncontrada;
	}

	@PostMapping(value = "/registrar")
	public Persona registrarPersona(@RequestBody Persona pNueva) {
		pNueva.setNombre(pNueva.getNombre() + "- Registrado");
		pNueva.setApellidos(pNueva.getApellidos() + "- Registrar");
		return pNueva;
	}

	@PutMapping(value = "/modificar")
	public Persona modificarPersona(@RequestBody Persona pMod) {
		pMod.setNombre(pMod.getNombre() + "-Modificada");
		pMod.setApellidos(pMod.getApellidos() + "- Modificada");
		return pMod;
	}

	@DeleteMapping(value = "eliminar/{id}")
	public boolean eliminar(@PathVariable("id") int id) {
		System.out.print("ID:" + id);
		return true;
	}
}