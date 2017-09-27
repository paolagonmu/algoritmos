/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author sena
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  String m[][] = new String[20][20];
        int columnas = m[0].length;
        int filas = m.length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int x = Math.toIntExact(Math.round(Math.random() * 100));
                
                m[i][j] = "" + x;

                System.out.print(" " +" " +m[i][j]+"" );

            }
            System.out.println();
        }

    }*/
    
        int m[][] = new int[20][20];
        int columnas = m[0].length;
        int filas = m.length;
        int a;
        int b;
        int c;
        int d;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int x = Math.toIntExact(Math.round(Math.random() * 100));

                m[i][j] = x;
                if (m[i][j] > 80) {
                    a = m[i][j + 1];
                    b = m[i - 1][j];
                    c = m[i + 1][j];
                    d = m[i][j - 1];

                }

                System.out.print(" " + " " + m[i][j] + "");

            }
            System.out.println();
        }
    }
}
      
    


    
    
