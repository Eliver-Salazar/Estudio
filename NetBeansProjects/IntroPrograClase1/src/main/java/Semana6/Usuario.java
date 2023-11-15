/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEM06;

/**
 *
 * @author mbp_jay
 */
public class Usuario {
    public String nombre ="";
    private String correo ="";    
    private String password = "";
    
    
    
    //Primer constructor: Public Usuario(String password)
    public Usuario(String password){
        this.setPassword(password);
    }
    
    //Segundo constructor: Genera password aleatoriamente
    public Usuario(){
        int password = (int)(Math.random()*1000000000)+1;
        this.setPassword(""+password);
    }
    
    
    //setter
    public void setPassword(String password){
        if(this.validaPassword(password) == true){
            //retorna true si es valido, si no false;
            this.password = password;
        }
    }

    //getter
    public String getPassword(){
        return password;
    }
    
    public String imprimir(){
        return "Password: "+this.password;
    }
    
    private boolean validaPassword(String password){
        //tiene que tener al menos 8 caracteres
        //no puede tener dos caracteres iguales consecutivos
        boolean valida = false;
        
        // 8 chars o mas
        if(password.length()>=8){
            valida = true;
        }
        
        for(int i = 0; i<password.length()-1;i++){
            //obtenga los dos caracteres a comparar.
            char a = password.charAt(i);
            char b = password.charAt(i+1);
            
            //si los dos caracteres siendo evaluados son iguales, pues la validacion
            //falla, valida = false;
            if(b == a){
                valida = false;
            }
        }
        
        return valida;
    }
    
}
