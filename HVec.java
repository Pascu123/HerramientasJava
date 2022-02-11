package alpha;

public class HVec {
	public static void ordenaVec(int VecOrdenar[], int izq, int der) {
		  int pivote=VecOrdenar[izq];
		  int i=izq;
		  int j=der;
		  int aux;
		 
		  while(i < j){                               
		     while(VecOrdenar[i] <= pivote && i < j) i++;
		     while(VecOrdenar[j] > pivote) j--;
		     if (i < j) {
		         aux= VecOrdenar[i];
		         VecOrdenar[i]=VecOrdenar[j];
		         VecOrdenar[j]=aux;
		     }
		   }
		   
		  VecOrdenar[izq]=VecOrdenar[j];                                  
		  VecOrdenar[j]=pivote;
		   
		   if(izq < j-1)
		     ordenaVec(VecOrdenar,izq,j-1);
		   if(j+1 < der)
		      ordenaVec(VecOrdenar,j+1,der);
		   
		}
	
	public static void ordenaVec(int VecOrdenar[]) {
		  int izq=0;
		  int der=VecOrdenar.length-1;
		  int pivote=VecOrdenar[izq];
		  int i=izq;
		  int j=der;
		  int aux;
		 
		  while(i < j){                               
		     while(VecOrdenar[i] <= pivote && i < j) i++;
		     while(VecOrdenar[j] > pivote) j--;
		     if (i < j) {
		         aux= VecOrdenar[i];
		         VecOrdenar[i]=VecOrdenar[j];
		         VecOrdenar[j]=aux;
		     }
		   }
		   
		  VecOrdenar[izq]=VecOrdenar[j];                                  
		  VecOrdenar[j]=pivote;
		   
		   if(izq < j-1)
		     ordenaVec(VecOrdenar,izq,j-1);
		   if(j+1 < der)
		      ordenaVec(VecOrdenar,j+1,der);
		   
		}
	public static void imprimeVec(int vector[]) {
		boolean primeraVez=true;
		for(int i:vector) {
			if(primeraVez==true) {
				System.out.print(i);
				primeraVez=false;
			}else {
				System.out.print(", "+i);
			}
		}
	}
	
	public static void rellenaVecUsuario(int vec[]) {
		for(int i=0;i<vec.length;i++) {
			vec[i]=Herramienta.solicitarInt("Introduce el número "+(i+1)+" : ");
		}
	}
	
	public static void rellenaVecAleatorio(int vec[], int desde, int hasta) {
		for(int i=0;i<vec.length;i++) {
			vec[i]=Herramienta.valAzar(desde, hasta);
		}
	}
	
	public static void ordenaVec(double VecOrdenar[], int izq, int der) {
		  double pivote=VecOrdenar[izq];
		  int i=izq;
		  int j=der;
		  double aux;
		 
		  while(i < j){                               
		     while(VecOrdenar[i] <= pivote && i < j) i++;
		     while(VecOrdenar[j] > pivote) j--;
		     if (i < j) {
		         aux= VecOrdenar[i];
		         VecOrdenar[i]=VecOrdenar[j];
		         VecOrdenar[j]=aux;
		     }
		   }
		   
		  VecOrdenar[izq]=VecOrdenar[j];                                  
		  VecOrdenar[j]=pivote;
		   
		   if(izq < j-1)
		     ordenaVec(VecOrdenar,izq,j-1);
		   if(j+1 < der)
		      ordenaVec(VecOrdenar,j+1,der);
		   
		}
	
	public static void ordenaVec(double VecOrdenar[]) {
		  int izq=0;
		  int der=VecOrdenar.length-1;
		  double pivote=VecOrdenar[izq];
		  int i=izq;
		  int j=der;
		  double aux;
		 
		  while(i < j){                               
		     while(VecOrdenar[i] <= pivote && i < j) i++;
		     while(VecOrdenar[j] > pivote) j--;
		     if (i < j) {
		         aux= VecOrdenar[i];
		         VecOrdenar[i]=VecOrdenar[j];
		         VecOrdenar[j]=aux;
		     }
		   }
		   
		  VecOrdenar[izq]=VecOrdenar[j];                                  
		  VecOrdenar[j]=pivote;
		   
		   if(izq < j-1)
		     ordenaVec(VecOrdenar,izq,j-1);
		   if(j+1 < der)
		      ordenaVec(VecOrdenar,j+1,der);
		   
		}
	public static void imprimeVec(double vector[]) {
		boolean primeraVez=true;
		for(double i:vector) {
			if(primeraVez==true) {
				System.out.print(i);
				primeraVez=false;
			}else {
				System.out.print(", "+i);
			}
		}
	}
	
	public static void rellenaVecUsuario(double vec[]) {
		for(int i=0;i<vec.length;i++) {
			vec[i]=Herramienta.solicitarDouble("Introduce el número "+(i+1)+" : ");
		}
	}
	public static void rellenaVecAleatorio(double vec[], double desde, double hasta) {
		for(int i=0;i<vec.length;i++) {
			vec[i]=Herramienta.valAzar(desde, hasta);
		}
	}
	public static void rellenaVecAleatorio(double vec[], double desde, double hasta,int decimales) {
		for(int i=0;i<vec.length;i++) {
			vec[i]=Herramienta.valAzar(desde, hasta, decimales);
		}
	}
	
	public static void ordenaVec(String VecOrdenar[], int izq, int der) {
		  String pivote=VecOrdenar[izq];
		  int i=izq;
		  int j=der;
		  String aux;
		 
		  while(i < j){                               
		     while((VecOrdenar[i].compareTo(pivote)<= 0)&& i < j) i++;
		     while(VecOrdenar[j].compareTo(pivote)>0) j--;
		     if (i < j) {
		         aux= VecOrdenar[i];
		         VecOrdenar[i]=VecOrdenar[j];
		         VecOrdenar[j]=aux;
		     }
		   }
		   
		  VecOrdenar[izq]=VecOrdenar[j];                                  
		  VecOrdenar[j]=pivote;
		   
		   if(izq < j-1)
		     ordenaVec(VecOrdenar,izq,j-1);
		   if(j+1 < der)
		      ordenaVec(VecOrdenar,j+1,der);
		   
		}
	
	public static void ordenaVec(String VecOrdenar[]) {
		  int izq=0;
		  int der=VecOrdenar.length-1;
		  String pivote=VecOrdenar[izq];
		  int i=izq;
		  int j=der;
		  String aux;
		 
		  while(i < j){                               
			  while((VecOrdenar[i].compareTo(pivote)<= 0)&& i < j) i++;
			  while(VecOrdenar[j].compareTo(pivote)>0) j--;
		     if (i < j) {
		         aux= VecOrdenar[i];
		         VecOrdenar[i]=VecOrdenar[j];
		         VecOrdenar[j]=aux;
		     }
		   }
		   
		  VecOrdenar[izq]=VecOrdenar[j];                                  
		  VecOrdenar[j]=pivote;
		   
		   if(izq < j-1)
		     ordenaVec(VecOrdenar,izq,j-1);
		   if(j+1 < der)
		      ordenaVec(VecOrdenar,j+1,der);
		   
		}
	public static void imprimeVec(String vector[]) {
		boolean primeraVez=true;
		for(String i:vector) {
			if(primeraVez==true) {
				System.out.print(i);
				primeraVez=false;
			}else {
				System.out.print(", "+i);
			}
		}
	}
	
	public static void rellenaVecUsuario(String vec[]) {
		for(int i=0;i<vec.length;i++) {
			vec[i]=Herramienta.solicitarString("Introduce la cadena "+(i+1)+" : ");
		}
	}
	
}
