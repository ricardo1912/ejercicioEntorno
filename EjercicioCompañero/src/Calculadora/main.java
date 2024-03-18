package Calculadora;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// creamos la clase Scaner
		Scanner escanero = new Scanner(System.in);
		calcular calculadora = new calcular();
		
			// variables
		int menu;
		int num1,num2;
	
		
		// decimos los núermos por interfaz
		System.out.println("Dime el primer número");
		num1 = escanero.nextInt();
		System.out.println("Dime el segundo núemero");
		num2 = escanero.nextInt();
		
		// creamos el menu
		do {
			System.out.println("1. SUMA");
			System.out.println("2. RESTA");
			System.out.println("3. MULTIPLICACION");
			System.out.println("4. DIVICION");
			System.out.println("DIME UNA DE LAS SIGUENTE OPCIONES");
			 menu = escanero.nextInt();
			 
			switch (menu) {
			case 1: {
				calculadora.suma(num1, num2);
				break;
			}
			case 2:{
				calculadora.resta(num1, num2);
				break;
			}
			case 3:{
				calculadora.multiplicacion(num1, num2);
				break;
			}
			case 4:{
				calculadora.divicion(num1, num2);
				break;
			}
			default:
				throw new IllegalArgumentException("esta opcion no esiste: ");
			}
		} while (menu !=4);
	

	}

}
