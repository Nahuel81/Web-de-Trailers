
package com.pelicula.trailers.controllers;

import com.pelicula.trailers.service.AlmacenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/assets")
public class AssetsController {
    @Autowired
	private AlmacenServiceImpl servicio;
	
	@GetMapping("/{filename:.+}")
	public Resource obtenerRecurso(@PathVariable("filename") String filename) {
		return servicio.cargarComoRecurso(filename);
	}
}
