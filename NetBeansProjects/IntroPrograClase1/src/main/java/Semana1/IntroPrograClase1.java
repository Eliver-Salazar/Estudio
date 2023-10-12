
package Semana1;

//El import siempre debe estar para poder usar la libreria
import javax.swing.JOptionPane;

public class IntroPrograClase1 {
    
    //Ejecuta la funcionalidades suma enteros
    public static void main(String[] args) {
        

        //Integer(Entero) Asignando variables tipo Entero
        int Precio;//int edad; Se puede hacer la sentencia de esta forma para reducir espacio
        int Edad;
        
        int numeroUno;
        int numeroDos;
        
        numeroUno = 5;
        numeroDos = 10;
        
        //Llamar a la libreria para mostrar los resultados de suma de numeros
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " +(numeroUno + numeroDos));
        
        
        /*Diferentes asignaciones de la 
        funcion string (Cadena de caracteres)
        */
        String Nombre;
        Nombre = "Manuel";
        Nombre = "M";
        Nombre = " ";
        
        
        //Char, un caracter
        char Inicial;
        Inicial = 'D'; //Se usan comillas simples para la funcion Char
        
        
        /*double, utiliza el doble de la capacidad de espacio que un int
        Se puede usar para usar decimales
        */
        double Deposito;
        Deposito = 2147483647;
        
        //Para usar numeros con mas cantidad de decimales, 
        //siempre debe finalizar con una 'f'
        float Temperatura;
        Temperatura = 16.1231313f;
        
        //Se pueden definir variables en mas de una linea
        float saldo, porcetanje, prueba1, prueba2;
        
        //Ejemplo para ingresar nombre de usuario e imprimir el mensaje
        String Lectura = JOptionPane.showInputDialog("Ingrese su nombre de usuario: ");
        JOptionPane.showMessageDialog(null, Lectura);
        
        
        //Casteo de funciones, casting
        Lectura = JOptionPane.showInputDialog("Ingrese su edad");
        Edad = Integer.parseInt(Lectura); //Devuelve el dato numerico a pesar
        //de escribirse en alfa.
        JOptionPane.showMessageDialog(null, "El año de nacimiento es: "+ (2023-Edad));
       
        
        //Formas de imprimir mensajes
        JOptionPane.showMessageDialog(null, "Bienvenido\n"
                + "al mundo de Java");
            
         String Texto = "Bienvenido al mundo de Java";    
         JOptionPane.showMessageDialog(null, Texto);
        
        
       
       
        
        
        
        
        

    }
}
