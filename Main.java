import java.util.Scanner;

 class Main {

	public static double soma(double num1, double num2) {
		double soma = num1+num2;
		return soma;
	}
	
	public static double subtracao(double num1, double num2) {
		double subtracao = num1-num2;
		return subtracao;
	}
	
	public static double multiplicacao(double num1, double num2) {
		double multiplicacao = num1*num2;
		return multiplicacao;
	}
	
	public static double divisao(double num1, double num2) {
		double divisao = num1/num2;
		return divisao;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero:");
		double num1= sc.nextDouble();
		System.out.println("Informe o segundo numero:");
		double num2 = sc.nextDouble();
		sc.close();
		double soma = (num1+num2);
		double subtracao = (num1-num2);
		double multiplicacao = (num1 * num2);
		double divisao = (num1/num2);
		
		
		System.out.println("Soma: "+soma);
		System.out.println("Subtracao: "+subtracao);
		System.out.println("Multiplicacao: "+multiplicacao);
		System.out.println("Divisao: "+divisao);
		
		
		}

	}
