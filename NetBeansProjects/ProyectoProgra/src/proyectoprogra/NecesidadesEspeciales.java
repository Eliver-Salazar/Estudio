package proyectoprogra;

import javax.swing.JOptionPane;



public class NecesidadesEspeciales {
   private Espacio[] espacios;
   private int espaciosRegistrados;

   public NecesidadesEspeciales(Espacio[] espacios, int espaciosRegistrados) {
       this.espacios = espacios;
       this.espaciosRegistrados = espaciosRegistrados;
   }

   // Nuevo: Método para registrar un parqueo de necesidades especiales
   public void registrarParqueoNecesidadesEspeciales(String tipo, int capacidad) {
       // Crear un nuevo espacio
       Espacio nuevoEspacio = new Espacio(espaciosRegistrados + 1, tipo, capacidad);

       // Agregar el nuevo espacio al array de espacios
       if (espaciosRegistrados < espacios.length) {
           espacios[espaciosRegistrados] = nuevoEspacio;
           espaciosRegistrados++;

           // Ajustar la numeración para dar prioridad a los parqueos de necesidades especiales
           ajustarNumeracionNecesidadesEspeciales();

           // Muestra un mensaje de éxito
           JOptionPane.showMessageDialog(null, "Parqueo de necesidades especiales agregado correctamente","Éxito", JOptionPane.INFORMATION_MESSAGE);
       } else {
           // Manejar el caso de superar la capacidad máxima de espacios
           JOptionPane.showMessageDialog(null, "Se ha alcanzado la capacidad máxima de espacios.",
                  "Capacidad Máxima Alcanzada", JOptionPane.WARNING_MESSAGE);
       }
   }

   //Método para ajustar la numeración de los parqueos de necesidades especiales
   private void ajustarNumeracionNecesidadesEspeciales() {
       // Ajustar la numeración del resto de espacios
       for (int i = espaciosRegistrados - 1; i >= 0; i--) {
           Espacio espacioActual = espacios[i];
           if (espacioActual.getIdentificador() > espaciosRegistrados) {
               espacioActual.setIdentificador(espacioActual.getIdentificador() + 1);
           }
       }
   }
}

