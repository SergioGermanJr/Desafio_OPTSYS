package Classes;



import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado 1: ");
        String inputLado1 = scanner.nextLine();
        BigDecimal lado1 = new BigDecimal(inputLado1);

        System.out.print("Digite o valor do lado 2: ");
        String inputlado2 = scanner.nextLine();
        BigDecimal lado2 = new BigDecimal(inputlado2);

        System.out.print("Digite o valor do lado 3: ");
        String inputlado3 = scanner.nextLine();
        BigDecimal lado3 = new BigDecimal(inputlado3);

        scanner.close();
  
        verificavel[] verificaveis = {new Degenerado(), new Equilatero(), new Isósceles(), new Escaleno()};
        boolean nenhumaVerificou = true;

        for (verificavel verificavel : verificaveis) {
            if (verificavel.verificar(lado1, lado2, lado3)) {
                System.out.println("Esse tipo de triangulo é " + verificavel.getClass().getSimpleName());
                nenhumaVerificou = false;
                break;}
            }
        if (nenhumaVerificou){
                System.out.println("Triangulo não é valido");
            }
            
        }
        
        

        

        


    }





   

