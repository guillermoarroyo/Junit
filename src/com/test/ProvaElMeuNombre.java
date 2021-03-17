package com.test;

public class ProvaElMeuNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElMeuNombre nombre1 = new ElMeuNombre(5);
		ElMeuNombre nombre2 = new ElMeuNombre(8);
		
		System.out.println("El nombre 1 = " + nombre1.getNombre());
		System.out.println("El nombre 2 = " + nombre2.getNombre());
		System.out.println("El nombre 1 + nombre 2 = " + nombre1.suma(nombre2).getNombre());
		System.out.println("El nombre 1 - nombre 2 = " + nombre1.resta(nombre2).getNombre());
		System.out.println("El nombre 1 * nombre 2 = " + nombre1.prod(nombre2).getNombre());
		System.out.println("El nombre 1 / nombre 2 = " + nombre1.div(nombre2).getNombre());
	}

}
