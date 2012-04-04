/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Geometria;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author LABCCET
 * here is my first driver !!!
 */

public class TrianguloTest {

  @Test
  public void testEquilateroMinimo() {
    testeTrinaguloOk(1, 1, 1, Triangulo.EQUILATERO);
  }

  @Test
  public void testIsoscelesAAB(){
      testeTrinaguloOk(1, 1, 2, Triangulo.ISOSCELES);
  }

  @Test
   public void testIsoscelesABA(){
      testeTrinaguloOk(1, 2, 1, Triangulo.ISOSCELES);
  }

  @Test
    public void testIsoscelesBAA(){
     testeTrinaguloOk(2, 1, 1, Triangulo.ISOSCELES);
  }

  @Test
  public void testEscaleno(){
      testeTrinaguloOk(1, 2, 3, Triangulo.ESCALENO);
  }

  public void testeTrinaguloOk(int ladoA, int ladoB, int ladoC, String resultado) {
    try {
      String result = Triangulo.getTipo(ladoA, ladoB, ladoC);
      Assert.assertEquals(resultado, result);
    } catch (TrianguloException e) {
      
    }
  }

  @Test
  public void testNaoETrianguloCMaior(){
    testTrianguloIncorreto(1, 2, 100);
  }

  @Test
  public void testNaoETrianguloBMaior(){
    testTrianguloIncorreto(1, 3, 1);
  }

  @Test
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
