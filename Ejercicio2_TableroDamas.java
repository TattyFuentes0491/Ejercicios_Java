
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
