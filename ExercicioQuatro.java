package listaUm;

public class ExercicioQuatro {

	public static void main(String[] args) {
		int A=1;
		int B=1;
		
		if (A>10 || A+B==20) {
			System.out.println("numero valido");	
		} 
		else if (A==B) {
			System.out.println("A e igual B; A e B sao diferentes de 10; A e menor que 10");
		} else {
				System.out.println("numero nao valido");
			}
	}
}