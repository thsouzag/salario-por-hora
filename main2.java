import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
// Variavel
  double N1 ,N2, salario;
          
  // processamento
  System.out.println("qual e o valor do seu salario por hora ?:");
  N1 = console.nextDouble();
  System.out.println("quantas horas trabalhadas por mes ?:");
  N2 = console.nextDouble();
  salario = (N1 * N2);
  //saida 
 System.out.printf("\n o salario do funcionario e  !\n"  + salario);
    
  }
}