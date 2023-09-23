package Classes;

import java.math.BigDecimal;

public class Equilatero extends Triangulos implements verificavel {
    
    public boolean verificar(BigDecimal lado1, BigDecimal lado2, BigDecimal lado3){
        if(criarTriangulo(lado1, lado2, lado3)){
            return lado1.compareTo(lado3) == 0 &&
            lado1.compareTo(lado2) == 0 &&
            lado2.compareTo(lado1) == 0;
        }
        else{
            return false;
        }
    }

    
}
