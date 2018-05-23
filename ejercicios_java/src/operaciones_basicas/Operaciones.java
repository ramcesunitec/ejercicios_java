/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_basicas;

/**
 *
 * @author ramce
 */
public class Operaciones {
   Valores valores;

   public float Suma(){
        float rs=valores.getValor1()+valores.getValor2();
        return rs;
    }
   
   public float Resta(){
       float rr=valores.getValor1()-valores.getValor2();
       return rr;
   }
   
   public float Multiplicacion(){
       float rm=valores.getValor1()*valores.getValor2();
       return rm;
   }
   
   public float Division(){
       float rd=valores.getValor1()/valores.getValor2();
       return rd;
   }
   
    public Valores getValores() {
        return valores;
    }

    public void setValores(Valores valores) {
        this.valores = valores;
    }
    
    
    
   
   
   
    
}
