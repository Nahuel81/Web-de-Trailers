/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pelicula.trailers.service;

import java.nio.file.Path;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;


public interface AlmacenService {
    
    public void iniciarAlmacenDeArchivo();
     
    public String almacenarArchivo(MultipartFile archivo);
    
    public Path cargarArchivo(String nombreArchivo);
    
    public Resource cargarComoRecurso(String nombreArchivo);
    
    public void eliminarArchivo(String nombreArchivo);
}
