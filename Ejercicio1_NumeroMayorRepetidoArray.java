
package prueba;

/*
 * @author Tatty Fuentes
 */
public class Ejercicio1_NumeroMayorRepetidoArray {

    /**
     * @param args the command line arguments
     */
    
    static int[] myArray = {1,2,2,4,5,6,7,8,8,8};
    
    public static void main(String[] args) {
        // TODO code application logic here
        int longest=1;
        int number=1;
        
        for (int i=0; i<myArray.length; i++){
            int maxRep=0;
            for (int j=0; j<myArray.length; j++){
                //validamos el numero mas repetido dentro del array
                if (myArray[i] == myArray[j]){
                    maxRep++;
                }
                if (maxRep>longest){
                    longest=maxRep;
                    number=myArray[i];
                }
            }
        }
        System.out.println("Longest: " + longest);
        System.out.println("Number: " + number);
    }
    
}
