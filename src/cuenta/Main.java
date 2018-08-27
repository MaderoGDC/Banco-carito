/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Main {
    public  static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        int numero = lectura.nextInt();
        
        
        
        Cuenta cuenta1 = new Cuenta(1012,1234,"Magdalena Sanchez",0); //asignarle valores 3el constructor
        System.out.println("Numero: " + cuenta1.getNumero());
        System.out.println("Clave: " + cuenta1.getClave());
        System.out.println("Dueno: " + cuenta1.getDueno());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println("Global: "+ Cuenta.global);
        cuenta1.consignar(100000);
        System.out.println("su nuevo saldo es:" + cuenta1.getSaldo());
        
        
        Cuenta cuenta2 = new Cuenta()
       //
        System.out.println("Clave" + cuenta1.getClave());
        // System.out.println(Math.round(50));
    }
    
}
