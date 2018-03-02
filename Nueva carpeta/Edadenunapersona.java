
package edadenunapersona;

import java.util.Calendar;



public class Edadenunapersona {

   
    public static void main(String[] args) {
        
        Scanner sca = new Scanner(System.in);
        
        int diaActual=Calendar.DAY_OF_MONTH,mesActual=Calendar.MONTH,añoActual=Calendar.YEAR;
        int mes,dia,año;
        int resultadodia,resultadomes,resultadoaño;
        System.out.println("ingrese dia ");
        dia=sca.nextint();
        System.out.println("ingrese mes ");
         mes=sca.nextint();
       System.out.println("ingrese año ");
         año=sca.nextint();
         resultadodia=Math.abs(dia-diaActual);
         resultadomes=Math.abs(mes-mesActual);
         resultadoaño=Math.abs(año-añoActual);
         
         System.out.println("su edad es "+resultadoaño+"años"+", "+resultadomes+"meses"
                 +"y"+resultadodia+"dias");
         
         
         
    }
    
}
