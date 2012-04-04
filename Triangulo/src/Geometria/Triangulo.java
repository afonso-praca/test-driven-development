/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Geometria;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author LABCCET
 */
public class Triangulo {
  public static final String EQUILATERO = "Equilatero";
  public static final String ESCALENO = "Escaleno";
  public static final String ISOSCELES = "Isosceles";

  public static String getTipo(int ladoA, int ladoB, int ladoC) throws TrianguloException {
    verificarPreCondicoes(ladoA, ladoB, ladoC);

     if (isEquilatero(ladoA, ladoB, ladoC))
       return EQUILATERO;
     else if (isEscaleno(ladoA, ladoB, ladoC))
       return ESCALENO;
     else if (isIsosceles(ladoA, ladoB, ladoC))
       return ISOSCELES;
     else
      throw new NotImplementedException();
   }

  private static void verificarPreCondicoes(int ladoA, int ladoB, int ladoC) throws TrianguloException {
    isTriangulo(ladoA, ladoB, ladoC);
    isTriangulo(ladoB, ladoA, ladoC);
    isTriangulo(ladoC, ladoA, ladoC);
  }

  private static void isTriangulo(int x, int y, int z)  throws TrianguloException {
    if (!(x <= y + z)) {
      throw new TrianguloException("não forma um triangulo");
    }
  }

  private static boolean isIsosceles(int ladoA, int ladoB, int ladoC) {
    return apenasDoisPrimeirosLadosIguais(ladoA, ladoB, ladoC) || 
            apenasDoisPrimeirosLadosIguais(ladoA, ladoC, ladoB) ||
            apenasDoisPrimeirosLadosIguais(ladoB, ladoC, ladoA);
  }

  private static boolean isEquilatero(int ladoA, int ladoB, int ladoC) {
    return (ladoA == ladoB) && (ladoA == ladoC);
  }

  private static boolean isEscaleno(int ladoA, int ladoB, int ladoC) {
    return ladoA != ladoB && ladoA != ladoC && ladoB != ladoC;
  }

   private static boolean apenasDoisPrimeirosLadosIguais(int x, int y, int z) {
     return (x == y && x != z);
   }
}
