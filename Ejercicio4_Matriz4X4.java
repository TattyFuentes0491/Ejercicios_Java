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
