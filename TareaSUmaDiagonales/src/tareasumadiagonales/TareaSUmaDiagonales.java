/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasumadiagonales;

/**
 *
 * @author Sebas
 */
import java.util.Scanner;

public class TareaSUmaDiagonales {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
      int n,sumaDiagonalUno=0, sumaDiagonalDos=0, Diferencia=0;
      int matriz[][];
      Scanner leer = new Scanner(System.in); 
      System.out.print("Digite el numero de filas y columnas de la matriz: ");
      n = leer.nextInt();        
      
      matriz = new int[n][n];
      
      System.out.println("Ingrese los valores de la matriz");
      
      for (int i=0; i<n;i++){
          for(int j=0; j<n;j++){
              System.out.print("Digite el valor de la posicion, Fila " +i +", Columna " +j + ": ");
              matriz[i][j]= leer.nextInt();
          }       
      }
      //Se muestra la matriz  
        System.out.println("La matriz es:\n");
        for (int i=0; i<n;i++){
          for(int j=0; j<n;j++){
              System.out.print(matriz[i][j]+"  ");              
    }
            System.out.println("");
        }
        
        
      //Suma de la diagonal Uno
      
      for (int i=0; i<n;i++){         
              sumaDiagonalUno+= matriz[i][i];                        
         }
      if(sumaDiagonalUno<0)
          sumaDiagonalUno=sumaDiagonalUno*-1;
    
       //Suma de la diagonal Dos
      
      for (int i=0; i<n;i++){
          for(int j=0; j<n;j++){
              if(i+j== n-1)
              sumaDiagonalDos+= matriz[i][j];               
          }         
         }
      if(sumaDiagonalDos<0)
          sumaDiagonalDos=sumaDiagonalDos*-1;
      
        //Se muestra la suma de cada una de las diagonales
        System.out.println("Valor absoluto suma diagonal 1= "+ sumaDiagonalUno +"\nValor absoluto suma diagonal 2= " + sumaDiagonalDos);
        
        
        //Calculo de la diferencia entre diagonales
        Diferencia = sumaDiagonalUno-sumaDiagonalDos;
        if (Diferencia<0)
            Diferencia= Diferencia*-1;
        
        //Se muestra la diferencia absoluta entre las dos diagonales
        
        System.out.println("El valor absoluto de la diferencia entre las diagonales es: " + Diferencia);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
