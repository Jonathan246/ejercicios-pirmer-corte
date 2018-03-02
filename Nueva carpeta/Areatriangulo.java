package areatriangulo;
import java.util.Scanner;
public class Areatriangulo {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        float base;
        float altura;
        float area;
        
        System.out.println("ingresar valor de la base");
        base=entrada.nextFloat ();
      System.out.println("ingresar valor de la altura");
       altura=entrada.nextFloat ();
       
       area=(base*altura)/2;
       System.out.println("el area del triangulo es:"+" "+area);
    }
    
}
