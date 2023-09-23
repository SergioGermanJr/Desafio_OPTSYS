package Classes;

import java.math.BigDecimal;

public class Triangulos {
    BigDecimal lado1;
    BigDecimal lado2;
    BigDecimal lado3 ;
   
    public boolean criarTriangulo(BigDecimal lado1, BigDecimal lado2, BigDecimal lado3) { 
        return lado1.compareTo(BigDecimal.ZERO) > 0 &&
               lado2.compareTo(BigDecimal.ZERO) > 0 &&
               lado3.compareTo(BigDecimal.ZERO) > 0 && 
               lado1.add(lado2).compareTo(lado3) >= 0 &&
               lado1.add(lado3).compareTo(lado2) >= 0 &&
               lado2.add(lado3).compareTo(lado1) >= 0;
            }


}

