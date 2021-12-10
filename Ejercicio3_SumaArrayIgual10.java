
package prueba;

import com.sun.org.apache.xerces.internal.util.FeatureState;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Tatty Fuentes
 */
public class Ejercicio3_SumaArrayIgual10 {
    
    static int[] myArray = {1,3,4,2,7,0};
        
    public static void main(String[] args) {
        boolean resu10=false;
        for (int i=0; i<myArray.length; i++){
            for (int j=0; j<myArray.length; j++){
                if (i != j){
                    if ((myArray[i] + myArray[j]) == 10 ){
                        System.out.println(myArray[i] + " " + myArray[j]);
                        resu10 = true;                         
                        break;
                    }
                }
            }
            if (resu10)
            break; 
        }          
    }
}
