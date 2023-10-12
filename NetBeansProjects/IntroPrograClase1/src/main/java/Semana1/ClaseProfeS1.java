package Semana1;

import javax.swing.JOptionPane;

public class ClaseProfeS1 {

    //ejecuta la funcionalidad: suma enteros.
    public static void main(String[] args) {
        
        //declaracion
        //Integer (entero)
        int precio;
        int edad;
        
        int numeroUno;
        int numeroDos;
        
        //asignacion de valor a la variable
        numeroUno = 5; 
        numeroDos = 10;
        
        
        //Llama Libreria para mostrar resultado de suma de numeros enteros.
        //JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+ (numeroUno+numeroDos));
        
        
        //Sintaxis variables
        
        /*
        Cadena de caracteres:
        Cadena vacia, 
        Cadena con un caracter, 
        Cadena con mas de un caracter
        */
        String nombre;
        nombre = "Manuel";
        nombre = "M";
        nombre = "";
        
        
        //Char, character
        //Caracter del teclado, puede ser numero, letra, simbolo
        //o cualquier caracter del teclado.
        char inicial;
        inicial = 'D';
        inicial = ' ';
        
        //double
        double deposito;
        deposito =  2147483645.2;
        deposito = 10.2;
        
        //float
        float temperatura;
        temperatura = 16.1298379f;
        
        
        
        float saldo, porcentaje, prueba123,  prueba345;
       
        //declaracion y asignacion en la misma sentencia/instruccion.
        String nombreUsuario = "Indefinido Indefinido";
        
        
        //Ejemplo para ingresar nombre de usuario.
        String lectura = JOptionPane.showInputDialog("Ingrese su nombre de usuario.");
        //JOptionPane.showMessageDialog(null, lectura);
        
        
        // casting, casteo, cast.
        
        lectura = JOptionPane.showInputDialog("Ingrese su edad.");
        //conversion del dato de String a int
        edad = Integer.parseInt(lectura);
        
        // resta edad a 2023 para obtener año de nacimiento
        JOptionPane.showMessageDialog(null, "el año de nacimiento es: "+(2023-edad));
        
        
        // Segundo parametro es la cadena de caracteres en crudo
        JOptionPane.showMessageDialog(null,"Bienvenido al mundo de Java.\n" +
        "Podrás dar solución a muchos problemas");
        
        String texto = "Bienvenido al mundo de Java.\n" +
"Podrás dar solución a muchos problemas";
        //Segundo parametro es el valor que tenga la variable texto, 
        //el valor puede cambiar dependiendo de las condiciones donde se ejecute 
        //(lectura de nombre de usuario por ej.)
        JOptionPane.showMessageDialog(null, texto);
        
    }    
}