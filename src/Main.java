package ui;

import java.util.Scanner;

public class Main {

	// Variables globales
	static Scanner reader;
	public static boolean flag;
	
	public static void main(String[] args) {

		reader = new Scanner(System.in);
		menu(flag);

		
	}

	public static void menu(boolean flag)
	{

		flag = false;

		while (!flag) {

			System.out.println("\n \n Bienvenido al menu:\n");
			System.out.println("Opciones:\n" + "1. Primera opcion \n" + "2. Segunda opcion\n"
					+ "3. Tercera opcion \n" + "4. Salir del programa");

			int option = reader.nextInt();

			reader.nextLine();

			switch (option) {
					case 1:
						primeraOpcion();
						break;
					case 2:
						segundaOpcion();
						break;
					case 3:
						terceraOpcion();
						break;
					case 4:
						flag = true;
						System.exit(0);
						break;
					default:
						System.out.print("Por favor ingrese una opcion valida");
						continue;
			}

		}

	}

	public static void primeraOpcion() {
		System.out.println("Eligio la primera opcion");
	}

	public static void segundaOpcion() {
		System.out.println("Eligio la segunda opcion");
	}

	public static void terceraOpcion() {
		System.out.println("Eligio la tercera opcion");
	}
	

	
}