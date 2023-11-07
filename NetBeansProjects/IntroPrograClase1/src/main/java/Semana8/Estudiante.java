
package SEM08;

import static SEM08.Estados.Activo;
import javax.swing.JOptionPane;

/**
 *
 * @author mbp_jay
 */
public class Estudiante {
    private int Cedula;
    private String nombre;
    private String apellidos;
    private String marcas[];
    private int numeros[];
    public static void main(String[] args){
    
        //La posicion 0 es utilizable, de manera que un limite de 100, llega hasta el indice 99.
        String ejemploArreglo[] = new String[100];
        String ejemploArreglo2[] = {"a","b"};//tamaño 2, new String[1], 
        //ejemploArreglo2[0]= "a", ejemploArreglo2[1] = "b";
        //ejemploArreglo2[3]="c" => ERROR (Out of bounds)
        //ejemploArreglo = new String[100];
        
        ejemploArreglo[1] = "Sem08";
        ejemploArreglo[2] = "Sem09";
        ejemploArreglo[90] = "Sem09";
        //ejemploArreglo[100] = "hola";
        ejemploArreglo[3] ="sem10";
        ejemploArreglo[4] = "sem11";
        //JOptionPane.showMessageDialog(null,ejemploArreglo[1] );
        //System.out.println(ejemploArreglo[1] + ", "+ejemploArreglo[2]+", "+ejemploArreglo[90]+ ", "+ejemploArreglo[100]);
        
        //Llenado de un arreglo
        Estudiante estudiante = new Estudiante();
        estudiante.marcas = new String[100];
        estudiante.insertarEnArreglo(51,"prueba");
        for(int posicion = 0; posicion<100; posicion++){
            //business rule
            if(posicion%2>0){
                Math.random();
                //"Objeto.metodo"
                //System.out.println(estudiante.marcas[posicion]);
            }
        }
        
        
        //EJERCICIO 2
        // Buscar un numero en el arreglo
        //devuelva posicion en el arreglo
        //indique si el numero no existe en el arreglo.
        estudiante.numeros = new int[100];
        estudiante.insertarEnArreglo();
//        int num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero a buscar."));
        //estudiante.imprimirPosicion(num);
        
        
        //EJERCICIO 3
        //vendedor 1-5
        //sumar ventas y guardarlas para cada uno
//        int ventas[] = new int[5];
//        for(int vendedor = 0; vendedor<5; vendedor++){
//            int monto=0;
//            do{
//            monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de la venta del vendedor: "+(vendedor+1)));
//            //suma el valor de la venta que el usuario acaba de ingresar.
//            ventas[vendedor] += monto;
//            }while(monto>0);
//        }
//        
//        for(int posicion=0; posicion<5; posicion++){
//            System.out.println("El vendedor "+(posicion+1)+" facturó: "+ventas[posicion]);
//        }
        
        
        
        //Arreglos Multidimensionales
//        
//        String siglo[][] = new String[10][10];
//        //2000
//        String 
//        for(int decada=0; decada<10; decada++){
//            for(int annio =0; annio<10; annio ++){
//                siglo[decada][annio] = annioSiglo+decada+""+annio; // "20"+"0"+"0" = "2000"
//                //"2000"
//                //"2001"
//                //"2002"
//            }
//        }
//        
//        
//        for(int decada=0; decada<10; decada++){
//            //por cada decada, recorre cada annio del 0 al 9 y guarda el valor del annio
//            for(int annio =0; annio<10; annio ++){
//                System.out.println(siglo[decada][annio]);
//            }
//        }
//        
//        System.out.println("El annio en la posicion: [0][0] es:"+siglo[0][0]);
//        System.out.println("El annio en la posicion: [0][0] es:"+siglo[2][7]);annioSiglo = "20";
//        //2000
//        
//        for(int decada=0; decada<10; decada++){
//            for(int annio =0; annio<10; annio ++){
//                siglo[decada][annio] = annioSiglo+decada+""+annio; // "20"+"0"+"0" = "2000"
//                //"2000"
//                //"2001"
//                //"2002"
//            }
//        }
//        
//        
//        for(int decada=0; decada<10; decada++){
//            //por cada decada, recorre cada annio del 0 al 9 y guarda el valor del annio
//            for(int annio =0; annio<10; annio ++){
//                System.out.println(siglo[decada][annio]);
//            }
//        }
//        
//        System.out.println("El annio en la posicion: [0][0] es:"+siglo[0][0]);
//        System.out.println("El annio en la posicion: [0][0] es:"+siglo[2][7]);








        //EJERICIO 1 ARREGLOS MULTIDIMENSIONALES
        //NxN, Numero Mayor, Suma 4 esquinas, Suma diagonal, Suma Diagonal Inversa
        
//        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
//        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
//        int arregloBidimensional[][] = new int[filas][columnas];
//        
//        for(int contadorFilas = 0; contadorFilas<filas; contadorFilas++){
//            for(int contadorColumnas=0; contadorColumnas<columnas; contadorColumnas++ ){
//                arregloBidimensional[contadorFilas][contadorColumnas]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero."));
//            }
//        }
//        
//        int numMayor=0;
//        int sumaEsquinas =0;
//        int sumaDiagonal = 0;
//        int sumaDiagRev=0;
//        
//        for(int contadorFilas = 0; contadorFilas<filas; contadorFilas++){
//            for(int contadorColumnas=0; contadorColumnas<columnas; contadorColumnas++ ){
//                if(arregloBidimensional[contadorFilas][contadorColumnas]>numMayor){
//                    numMayor=arregloBidimensional[contadorFilas][contadorColumnas];
//                }
//                //sumaDiagonal
//                //sumaDiagRev
//            }
//        }
//        sumaEsquinas = arregloBidimensional[filas][columnas] + arregloBidimensional[0][0] +arregloBidimensional[0][columnas]+arregloBidimensional[filas][0];
//                
           Estados a =  Estados.Activo;
           System.out.println(a);
    }
    
    
    public void insertarEnArreglo(int posicionComienzo,String valor){
        for(int posicion = posicionComienzo; posicion<100; posicion++){
            marcas[posicion] = "posicion "+posicion+": "+valor;
        }
    }
    
    public void imprimirPosicion(int numeroBusqueda){
        for(int posicion = 0; posicion<100; posicion++){
            if(numeros[posicion]==numeroBusqueda){
//                JOptionPane.showMessageDialog(null, "Numero encontrado en posicion: "+posicion);
                break;
            }
            if(posicion == 99){
//                JOptionPane.showMessageDialog(null, "Numero no existe en el arreglo.");
            }
        }
    }
    
    //inserta Numeros en arreglo numeros
    public void insertarEnArreglo(){
        for(int posicion = 0; posicion<100; posicion++){
            numeros[posicion] = posicion;
        }
    }
}

