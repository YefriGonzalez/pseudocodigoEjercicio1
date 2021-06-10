import java.util.*;
public class Ejercicio1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int pares=0;
		int impares=0;
		int n;
		System.out.print("Ingrese la cantidad de numeros que desea generar: ");
		n=scanner.nextInt();
		for(int i=0;i<n;i++){
			int aleatorio=(int)(Math.random()*(2000-1)+1);
			if((aleatorio%2)==0){
				pares=pares+1;
			} else {
				impares+=1;
			}
		}
		System.out.println("Cantidad de numeros Pares: "+pares);
		System.out.println("Cantidad de numeros impares: "+impares);
	}
}
