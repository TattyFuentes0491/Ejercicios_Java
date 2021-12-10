/*
Pregunta 2
Imprimir un tablero de damas donde la "X" representa el color negro y el "_" representa el blanco. 
El tablero debe tener n x n casillas. Por ejemplo, para n=5 el tablero se vería así:
X_X_X
_X_X_
X_X_X
_X_X_
X_X_X
Tu tablero siempre debe partir con un cuadro negro (una "X") en la esquina superior izquierda y el valor de n puede ir 
de 1 a 10. En caso de que el valor de n sea diferente, asumir que n es igual a 5.
El código para el tamaño de n ya está ahí, puede editarlo para probar con otros valores y puede hacer clic en el botón 
de actualización junto a él para volver al valor original que se utiliza para validar su código durante la prueba. 
 */
package prueba;

/**
 *
 * @author Tatty Fuentes
 */
public class Ejercicio2_TableroDamas {
    
static int n=5;
    
    public static void main(String[] args) {
        String [][] data = new String[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                data [i][j] = (i+j+1)%2 !=0 ? "X" : "_";
            }
        }
        for (int i=0; i<n; i++){
            for( int j=0; j<n; j++){
                System.out.print(data[i][j]);
            }
            System.out.println("");
        }
     }
    
}
