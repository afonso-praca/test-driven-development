/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Geometria;

import org.junit.Before;
import org.junit.Assume;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LABCCET
 */
public class ContaTest {
  
  private Conta c;

  @Before
  public void setup() {
    c = new Conta("1234", 500);
     Assume.assumeNotNull(c);
  }

  @Test
  public void testSacarOk(){
    c.sacar(400);
    assertEquals(100, c.getSaldo());
  }

   @Test
  public void testSacarAbaixoMinimo(){
     try {
      c.sacar(9);
      fail();
     } catch (Exception e) {
       assertEquals(500, c.getSaldo());
     }
  }
}
