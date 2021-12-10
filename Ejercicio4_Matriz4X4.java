/*
Pregunta 4
Se tiene una X en la esquina superior izquierda de un área de 4x4. Se tiene una matriz con 10 elementos. 
Cada 2 elementos de la matriz corresponden a un movimiento, el primero en el eje horizontal y el segundo en el eje vertical. 
El numero indica las unidades a moverse y el signo la dirección (positivo para derecha o abajo, negativo para izquierda o arriba)
Por ejemplo, para la matriz myArray:=(1,2,-1,1,0,1,2,-1,-1,-2)
La X se moverá una unidad a la derecha y dos hacia abajo, luego una unidad a la izquierda y una abajo y así sucesivamente. 
El programa a escribir debe imprimir la posición final de la X. Para representar los lugares donde 
la X no se encuentra utilizar la letra O. Si la instrucción obliga a la X a salir del área de 4x4 la X permanecerá en el borde, 
sin salir. Para el arreglo presentado el resultado se vería así:
OXOO
OOOO
OOOO
OOOO
 */
package prueba;

/**
 *
 * @author Tatty Fuentes
 */
public class Ejercicio4_Matriz4X4 {
    
   static int[] myArray = {1,2,-1,1,0,1,2,-1,-1,-2};
    
    public static void main(String args[]){
        
        int x=0, y=0;
        int movimientos = 1;
        String[][] data = new String[4][4];
        
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(myArray.length != (movimientos*2)){
                    x= x+myArray[movimientos*2];
                    y= y+myArray[movimientos+1];
                    movimientos++;
                }
            }
        }
        
        for (int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.println(i == x && j == y ? "X" : "O");
            }
            System.out.println("");
        }
        
    }
    
}
