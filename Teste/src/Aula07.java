import java.util.InputMismatchException;
import java.util.Scanner; 
public class Aula07 {

public class  Teste2{

    public static void main(String[] args) {
        try{
            int[] numero = new int[5];

            for(int i = 0; i <= 10; i++){
                numero[i] = i;
                System.out.println(i);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array fora do índice: " + e.getMessage());
        }
    }

} 
/*  public class Teste2 {
 public static int calculaQuociente(int numerador, int denominador) throws ArithmeticException{
 return numerador / denominador;
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 boolean continua = true;
 do{
 try{
System.out.print("Numerador: ");
 int numerador = sc.nextInt();
System.out.print("Denominador: ");
 int denominador = sc.nextInt();
 int resultado = calculaQuociente(numerador, denominador);
 System.out.println("Resultado: "+resultado);
 continua = false;
 }
 catch (InputMismatchException erro1) {
System.err.println("Não e permitido inserir letras, informe apenas números inteiros!");
    sc.nextLine(); //descarta a entrada errada do usuário
     }
     catch(ArithmeticException erro2){
     System.err.println("O número do divisor deve ser diferente de 0!");
    }
    finally{
    System.out.println("Execução do Finally!");
  }
}
while(continua);
}
}*/
}

