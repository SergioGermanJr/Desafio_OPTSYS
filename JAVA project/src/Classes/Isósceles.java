package Classes;

import java.math.BigDecimal;

public class Isósceles extends Triangulos implements verificavel{

    public boolean verificar(BigDecimal lado1, BigDecimal lado2, BigDecimal lado3){

        if(criarTriangulo(lado1, lado2, lado3)){
        return lado1.equals(lado2) || lado1.equals(lado3) || lado2.equals(lado3);
        }
        else{
            return false;
        }
    }
    
}



