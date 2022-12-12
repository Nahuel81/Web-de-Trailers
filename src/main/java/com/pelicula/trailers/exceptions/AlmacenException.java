/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pelicula.trailers.exceptions;


public class AlmacenException extends RuntimeException{
    private static final long serialVersionUID = 1L;

	public AlmacenException(String mensaje) {
		super(mensaje);
	}

	public AlmacenException(String mensaje, Throwable exception) {
		super(mensaje, exception);
	}
}
