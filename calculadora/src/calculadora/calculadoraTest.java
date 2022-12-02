package calculadora;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * TODO fgarciah This type ...
 *
 */
public class calculadoraTest {

  Calculadora calc;

  @Before
  public void before() {

    this.calc = new Calculadora();
  }

  @After
  public void after() {

    double resultado = this.calc.acc();
    System.out.println(resultado);
  }

  @Test
  public void testSuma() {

    double resultado = this.calc.add(5, 2);
    double esperado = 7;
    System.out.println(resultado + " esta es la suma");
  }

  @Test
  public void testResta() {

    double resultado = this.calc.res(3, 1);

    System.out.println(resultado + " esta es la resta");
  }

  @Test
  public void testSumacu() {

    double resultado = this.calc.addac(3);
    double esperado = this.calc.addac(resultado) + resultado;
    System.out.println(esperado + resultado + " suma acumulada");
  }

  /**
   *
   *  */
  @Test(expected = ArithmeticException.class) // coger excepciones, da fallo si no hay excepcion
  public void testDiv() {

    double resultado = this.calc.div(5, 2);
    System.out.println(resultado + " esta es la division");

  }

  @Test(timeout = 100) // el tiempo milisegundos; interrumpir bucles infinitos
  public void testAlgoritmoOptimo() {

    this.calc.operacionOptima();
  }
}
