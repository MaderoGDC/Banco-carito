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
        Cuenta cuenta1 = new Cuenta(1012,1234,"Magdalena Sanchez",0); //asignarle valores 3el constructor
        cuenta1.consignar(10000);
        Cuenta cuenta2 = new Cuenta(1013,9876,"Joselito Perez",500000);
        System.out.println("digite su nueva clave: " + cuenta2.getDueno());
        int clave2= lectura.nextInt();
        cuenta2.cambiarClave(clave2);
        System.out.println("su nueva clave es: " +  cuenta2.getClave());
//System.out.println("Global: "+ Cuenta.global);
        System.out.println( cuenta2.getDueno()+ "Tu saldo es:" + cuenta2.getSaldo() );
        
// System.out.println(Math.round(50));
    }
    
}
