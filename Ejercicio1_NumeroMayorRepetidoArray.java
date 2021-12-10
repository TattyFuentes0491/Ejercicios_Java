/*
Pregunta 1
Tiene un arreglo (llamado myArray) con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa en Java que 
imprima el numero que tiene mas ocurrencias seguidas en arreglo y también imprimir la cantidad de veces que aparece en 
la secuencia. El código que llena el arreglo ya esta escrito, pero puede editarlo para probar con otros valores. 
Con el botón de refrescar puede recuperar el valor original que sera utilizado para evaluar la pregunta como correcta o 
incorrecta durante la ejecución. Su programa debe analizar el arreglo de izquierda a derecha para que en 
caso de que dos números cumplan la condición, el que aparece por primera vez de izquierda a derecha será el que se 
imprimirá. La salida de los datos para el arreglo en el ejemplo (1,2,2,5,4,6,7,8,8,8) sería la siguiente:
Longest: 3
Number: 8
En el ejemplo, la secuencia mas larga la tiene el numero 8 con una secuencia de tres ochos seguidos. Tenga en cuenta que 
el código que escriba debe imprimir los resultados exactamente como se muestra con el fin de que la pregunta sea 
considerada válida. 
 */
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
