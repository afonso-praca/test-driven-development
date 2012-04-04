/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Geometria;

import java.util.Collection;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

/**
 *
 * @author LABCCET
 * here is my first driver !!!
 */

@RunWith(value = Parameterized.class)
public class TrianguloTestOk {

  private int ladoA;
  private int ladoB;
  private int ladoC;
  private String tipoTriangulo;

  public TrianguloTestOk(int ladoA, int ladoB, int ladoC, String tipoTriangulo){
    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
    this.tipoTriangulo = tipoTriangulo;
  }

  @Parameterized.Parameters
  public static Collection<Object []> data() {
          Object[][] testData = new Object[][] {
            {1,1,1, Triangulo.EQUILATERO },
            {2,2,3, Triangulo.ISOSCELES },
            {2,3,2, Triangulo.ISOSCELES },
            {3,2,2, Triangulo.ISOSCELES },
            {2,3,4, Triangulo.ESCALENO }

          };
          return Arrays.asList(testData);
  }

  @Test
  public void testeTrinaguloOk() {
    try {
      String result = Triangulo.getTipo(ladoA, ladoB, ladoC);
      Assert.assertEquals(tipoTriangulo, result);
    } catch (TrianguloException e) {

    }
  }

  @Ignore
  public void testNaoETrianguloCMaior(){
    testTrianguloIncorreto(1, 2, 100);
  }

  @Ignore
  public void testNaoETrianguloBMaior(){
    testTrianguloIncorreto(1, 3, 1);
  }

  @Ignore
  public void testNaoETrianguloAMaior(){
    testTrianguloIncorreto(13, 2, 10);
  }


  public void testTrianguloIncorreto(int ladoA, int ladoB, int ladoC){
    try {
      String resultadoObtido = Triangulo.getTipo(ladoA, ladoB, ladoC);
      Assert.fail();
    } catch (TrianguloException e){

    }
  }

}
