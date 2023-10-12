package Semana3;

import javax.swing.JOptionPane;

public class ClaseProfeS3 {

   
    public static void main(String[] args){
    
        
        
        //FOR
        
    //Contador con operacion negativa
//        for(int i =10; i>0; i--){
//            System.out.println("Faltan "+ i +"segundos para el lanzamiento");
//        }
//        System.out.println("Lanzamiento exitoso");
    
//     for (int i = 0; i < 5; i++){
//        System.out.println("vale: "+i);
////    }
//        for(int i =12; i>=1; i--){
//            String mes="";
//            switch(i){
//                case 1: 
//                    mes = "enero";
//                    break;
//                 case 2: 
//                    mes = "febrero";
//                    break;
//                case 3: 
//                    mes = "marzo";
//                    break;
//                case 4: 
//                    mes = "abril";
//                    break;
//                case 5: 
//                    mes = "mayo";
//                    break; 
//                case 6: 
//                    mes = "junio";
//                    break; 
//                case 7: 
//                    mes = "julio";
//                    break; 
//                case 8: 
//                    mes = "agosto";
//                    break; 
//                case 9: 
//                    mes = "septiembre";
//                    break; 
//                case 10: 
//                    mes = "octubre";
//                    break; 
//                case 11: 
//                    mes = "noviembre";
//                    break; 
//                case 12: 
//                    mes = "diciembre";
//                    break; 
//            }
//            
//            System.out.println(mes);
//        }

        
        
        
        //WHILE
//        boolean repite = true;
//        while(repite){
//            //muestre un menu
//            int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(null,"Este es el menu: 1. Servicio al Cliente. 2. Finanzas, 3. Contabilidad, 4. Ventas"));
//            if(opcionMenu>0 && opcionMenu<5){
//                repite=false;
//            }
//        }

          //contador de reglones/lineas
//          int i=0;
//          while(i<5){
//              //contador de caracteres por reglon/linea
//              int b=0;
//              while(b<10){
//                  System.out.print("@");
//                  b++;
//              }
//              
//              //salto a la siguiente linea/reglon
//              System.out.println("");
//              i++;
//          }
          //
          //
          //
//          
//            for (int a= 1; a <= 10; a++){
//              System.out.println("for" +a);
//            }
////          
//                int i = 1;
//            while (i <= 10){
//            System.out.println("while: "+i);
//            i++;
//            }
//          
//            i=1;
//            do {
//            System.out.println("Do:"+ i);
//            i++;
//            } while (i <= 10);
//            
          
//            for (int ab = 0; ab<10; ab++){
//                System.out.println("AB, ejecucion: "+ab);
//                for(int fc =0; fc<6; fc++){
//                    System.out.println("FC ejecucion:"+fc);
//                }
//            }

            //EJERCICIO #2 PRESENTACION
//            boolean repite = true;
//            do{
//                
//                int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero entero superior a cero."));
//                
//                if(numero>0){
//                    repite=false;
//                    for(int i = 1; i<=10; i++){
//                        System.out.println(numero + " X "+ i + "="+(numero*i));
//                    }
//                }
//            }while(repite);


            //EJERCICIO #3 PRESENTACION
//            int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero entero superior a cero."));
//            
//            //Cantidad de lineas a imprimir
//            for(int i = 0; numero>=i; i++){
//                int b = 0;
//                //Imprima la cantidad de caracteres, igual al numero de linea actual
//                while(b<i){
//                    System.out.print("*");
//                    b++;
//                }
//                System.out.println("");
//            }

            //EJERCICIO #5
            //solicitar x estudiantes
            //solicitar nota para cada uno
            //definir, nota mayor, nota menor, promedio,
            //y cantidad estudiantes aprobados
            int numeroEstudiantes = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cantidad de estudiantes."));
            
            int notaMayor=0, notaMenor=100, promedio=0, cantidadAprobados=0;
//            
            for(int i=0; i<numeroEstudiantes; i++){

                int nota = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la nota para el estudiante "+i+"."));
                
                if(nota>notaMayor){
                    notaMayor=nota;
                    System.out.println("Nueva nota Mayor:"+nota);
                }
                
                if(notaMenor>nota){
                    notaMenor=nota;
                    System.out.println("Nueva nota Menor:"+nota);

                }
                
                if(nota>69){
                    cantidadAprobados++;
                    System.out.println("Suma un estudiante aprobado con nota:"+nota);

                }
                promedio+=nota;
                
                System.out.println("Estudiante: "+i+". Nota: "+nota);
            }
            
            promedio = promedio / numeroEstudiantes;
            
            System.out.println("Nota Mayor: "+notaMayor+". Nota menor: "+ notaMenor+". Promedio: "+promedio+". CantidadAprobados: "+cantidadAprobados);
            //Solucion con while: utiliza variable booleana
    }
}
