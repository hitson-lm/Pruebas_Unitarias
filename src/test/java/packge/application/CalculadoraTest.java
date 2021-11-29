package packge.application;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSuma(){
        // resultado esperado
        double resultEsperado=15;

        //Resultado obtenido en ejecucion
        Calculadora calculadora = new Calculadora();
        double obtenido=calculadora.sumar(5,10);

        //comparar Esperado vs Obtenido
        Assertions.assertEquals(resultEsperado,obtenido);


    }

}
