package alpha;

import java.util.Scanner;

public class Herramienta {
private static final Scanner sc = new Scanner(System.in);
	
	public static int solicitarInt(String cadena) {
		int num = 0;
		boolean flag= false;
		System.out.print(cadena);
		while(flag == false) {
			try {
				num=sc.nextInt();
				flag = true;
			}catch(Exception e) {
				sc.nextLine();
				System.out.print("Creo que te has confundido, debes introducir un nUmero ENTERO: ");
			}
		}
		return num;
	}
	public static double solicitarDouble(String cadena) {
		double num = 0;
		boolean flag= false;
		System.out.print(cadena);
		while(flag == false) {
			try {
				num=sc.nextDouble();
				flag = true;
			}catch(Exception e) {
				sc.nextLine();
				System.out.print("Creo que te has confundido, debes introducir un nUmero REAL: ");
			}
		}
		return num;
	}
	public static char solicitarChar(String cadena) {
		char caracter = 0;
		boolean flag= false;
		System.out.print(cadena);
		
		while(flag == false) {
			try {
				caracter=sc.next().charAt(0);
				flag = true;
			}catch(Exception e) {
				sc.nextLine();
				System.out.print("Creo que te has confundido, debes introducir un CARACTER: ");
			}
		}
		return caracter;
	}
	public static String solicitarString(String cadena) {
		String cadenac = "0";
		boolean flag= false;
		System.out.print(cadena);
		
		while(flag == false) {
			try {
				cadenac=sc.nextLine();
				flag = true;
			}catch(Exception e) {
				sc.nextLine();
				System.out.print("Creo que te has confundido, debes introducir una CADENA DE CARACTERES"
						+ ""
						+ ": ");
			}
		}
		return cadenac;
	}
	
	
	public static int valEntre(int max, int min,int val, String mensaError) {
		while(val>max || val<min) {
			val = solicitarInt(mensaError);
		}
		return val;
	}
	
	public static int valEntre(int min, int val, String mensaError) {
		while(val<min) {
			val = solicitarInt(mensaError);
		}
		return val;
	}
	
	public static double valEntre(double max, double min,double val, String mensaError) {
		while(val>max || val<min) {
			val = solicitarInt(mensaError);
		}
		return val;
	}
	
	public static double valEntre(double min, double val, String mensaError) {
		while(val<min) {
			val = solicitarDouble(mensaError);
		}
		return val;
	}
	
	public static int valAzar(int min, int max) {
		max++;
		int numAzar= (int) Math.floor(Math.random()*(max-min));;
		return numAzar+min;
	}
	
	public static double valAzar(double min, double max) {
		max++;
		double numAzar= Math.random()*(max-min);
		return numAzar+min;
	}
	
	public static double valAzar(double min, double max, int decimales) {
		double numAzar= Math.random()*(max-min);
		double scale = Math.pow(10, decimales);
        double salida = Math.round(numAzar*scale)/scale;
		return salida+min;
	}
}
