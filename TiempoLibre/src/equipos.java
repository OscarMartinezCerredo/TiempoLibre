package ajedrezv1;
import java.util.Random;
public class equipos {
	public static void main(String[] args) {
		String jugadores [] = {"JUAN","IVAN","MAYA","FRAM","LUCAS","PEDRO","JEAN","KEVIN","ADRIAN","SAMU","EDU"};
		 Random random = new Random();
		
		 for (int i =0;i<=5;i++) {
			 int numero = random.nextInt(10);   
			 System.out.println(numero);
			 System.out.println(jugadores[numero]);
		 }
	}
}
