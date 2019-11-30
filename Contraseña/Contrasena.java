import javax.swing.*;
/**
 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto
 * @author: Parada Martinez Erwin Eli
 * @version: 29/11/2019
 */
public class Contrasena
{
    //campos de la clase
    public static String contrasena="holamundo"; /** contraseña que tiene el programa*/
    public static int intentos=3; /**numero de intentos con los que cuenta el usuario*/
    
    /**
     * Método que compara la contraseña dada por el usuario con la establecida
     */
    public static void Contrasena(){
        while(intentos>0){ /** inicio del ciclo while*/
            String s=JOptionPane.showInputDialog("introduzca contaseña");/** dato introducido por el usuario*/
            if(s.equals(contrasena)){ /** inicio del if, compara si la contraseña escorrecta*/
                System.out.println("abierto"); /** confirma que la contraseña es la correcta*/
                break;
            }else{ /** else en caso de que la conraseña sea incorrecta*/
                System.out.println("contraseña incorrecta"); /**confirma que la contraseña es incorrecta*/
                intentos--; /** resta la variable intentos*/
            } /** fin del if*/
        }
        if(intentos==0){ /** inicio del if para comprobar si excedio del limite de intentos*/
            System.out.println("exediste los intentos"); /** indica al usuario si se excedio*/
        } /** fin de if*/
    }//cierre del metodo
    /**
     * Método main que prueba la funcion de los demás métodos
     * @param Array String de argumentos
     */
    public static void main(String [] args){
        Contrasena(); /**prueba del método contrasena*/
    }//cierre del metodo
}//cierre de la clase
