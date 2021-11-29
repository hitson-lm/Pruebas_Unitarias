package packge.application;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    //variable global
    Calculadora calculadora;

    //creamos un metodo que inicialiace la instancia.
    @BeforeEach     // Anotacion para que se ejecute antes de cada TEST
    public void init(){
        calculadora=new Calculadora();
    }

    @Test
    public void testSuma(){
        Assertions.assertEquals(15,calculadora.sumar(10,5));
    }

    @Test
    public void testResta(){
        Assertions.assertEquals(5,calculadora.restar(10,5));
    }

    @Test
    public void testMultiplicaion(){
        Assertions.assertEquals(25,calculadora.multiplicar(5,5));
    }

}
