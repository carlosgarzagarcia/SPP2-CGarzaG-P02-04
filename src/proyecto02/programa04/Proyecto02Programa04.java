/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto02.programa04;
import java.util.Scanner;
/**
 *
 * @author carlos
 */
public class Proyecto02Programa04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int tamaño=solicitarentero("Tamaño del arreglo:");
        int [][]arreglo= arreglo("A",tamaño);
         suma(arreglo);
         suma2(arreglo);
         suma3(arreglo);
    }
    
   public static int[][] arreglo(String a,int tamaño){
        int [][]arreglo= new int [tamaño][tamaño];
         System.out.println("Arreglo "+a);
      
         for (int i=0; i<arreglo.length;i++){
         for (int j=0;j<arreglo[i].length;j++){
         arreglo[i][j]= solicitarentero("Introduce un número entero: ");
        }
        }
         return arreglo;
        }
    
    public static int solicitarentero(String b){
        Scanner entrada=new Scanner (System.in);
         int a=0;
         boolean flag=true;
           do{
            try{
                System.out.println("Escribe "+b);
                a=entrada.nextInt();
                flag=false;
            }
            catch(Exception e){
                System.out.println("Error");
                entrada.next();
                flag=true;
                
            }
        }
        while(flag);
        return a;
    }
        
    public static void suma(int[][]a){//promedio, min, max y diagonal
        double b=0;
        double prom;
         int max, min,c=0;
         min=max=a[0][0];
          System.out.println("Matriz:");
          for (int i=0;i<a.length;i++){
             c=c+a[i][i];//diagonal
             
            for(int j=0;j<a.length;j++){
                b=b+a[i][j];//promedio
                
                System.out.print("["+a[i][j]+"]");
                if(min>a[i][j])
			{
				min=a[i][j];
			}
			if(max<a[i][j])
			{
				max=a[i][j];
			}         
            }
            
             System.out.println();
            
        }
         prom=(b/16);
         System.out.println();
         System.out.println("Promedio: "+prom);
         System.out.println("Mínimo: "+min);
         System.out.println("Máximo: "+max);
         System.out.println("Suma de la diagonal:"+c);
         System.out.println();
         
    }
    
    
    public static void suma2(int[][]a){//suma de diagonal superior
        double b=0;
        int x=0;
         for (int i=0;i<a.length;i++){        
            for(int j=x;j<a.length;j++){
                b=b+a[i][j];//promedio
                
                System.out.print("["+a[i][j]+"]");                                       
            }
            x=x+1;
            
             System.out.println();
            
        }
         System.out.println("Suma diagonal superior: "+b);
        }
    
    public static void suma3(int[][]a){//suma de diagonal inferior
        double b=0;
        int x=a.length-1;

         for (int i=a.length-1;i>=0;i--){        
            for(int j=x;j>=0;j--){
                b=b+a[i][j];
                System.out.print("["+a[i][j]+"]");                                       
            }
            x=x-1;
             System.out.println();
            
        }
         System.out.println("Suma diagonal inferior: "+b);
         
        }
        
        
    
}