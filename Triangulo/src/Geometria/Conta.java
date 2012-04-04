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
public class Conta {

  private String numero;
  private int saldo;

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public int getSaldo() {
    return saldo;
  }

  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }

   public Conta(String numero, int saldo) {
    this.numero = numero;
    this.saldo = saldo;
  }

   public void sacar(int valor) {
     if (valor <= getSaldo())
       setSaldo(getSaldo() - valor);
   }
}
