package principal;
   import java.util.Scanner;
public class Sumatorio {

   public static void main(String[] args) {
       System.out.println("Introduce un número A: ");
       Scanner entradaA = new Scanner(System.in);
       int a = entradaA.nextInt();
       System.out.println("Introduce un número B: ");
       Scanner entradaB = new Scanner(System.in);
       int b = entradaB.nextInt();
       int suma=0;
       int mayor, menor; //las vbles hay que declararlas fuera; de lo contrario el for debería ser incluido dentro del if
       if (a>b){
           mayor=a;
           menor=b;
       }else{
           mayor=b;
           menor=a;
       }
       //hacer un programa que muestre la suma de todos los números pares comprendidos entre a y b
       for (int i=menor;i<=mayor;i++){
           if(i%2==0){
               suma+=i;
           }
       }
       System.out.println("La suma de los pares es "+suma);
   } 
}
