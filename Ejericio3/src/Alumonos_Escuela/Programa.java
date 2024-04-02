package Alumonos_Escuela;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		/*
		//Codigo largo
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre? \n");
		String nom = sc.next();
		
		Alumno alumno = new Alumno();
		alumno.setNombre(nom);
		
		nom = alumno.getNombre();
		System.out.println(nom);
		
		sc.close();
		
		*/
		
		/*
		
		//Metodo corto y codigo buenas practicas
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre1?");
		Alumno alumno = new Alumno();
		alumno.setNombre(sc.next());
		
		System.out.println("Nombre2?");
		Alumno alumno2 = new Alumno();
		alumno2.setNombre(sc.next());
		
		if(alumno == alumno2){
			System.out.println("Iguales");
		}else {
			System.out.println("Diferentes");
		}
		
		System.out.println(alumno.getNombre());
		
		sc.close();
		*/
		
		
		
		/*
		
		Alumno alumno1 = new Alumno(" Frann ", 2020202020);
		Scanner sc = new Scanner(System.in);

		System.out.println("Nombre del alumno: ");
		System.out.println(alumno1.getNombre());
		
		sc.close();
		
		*/
		
		
		
		
		System.out.println(Alumno.getTotal());
		
		Alumno alumn = new Alumno("Ian", 93939393);
		
		Alumno alumno = new Alumno();
		

		System.out.println(Alumno.getTotal());
	}
}
