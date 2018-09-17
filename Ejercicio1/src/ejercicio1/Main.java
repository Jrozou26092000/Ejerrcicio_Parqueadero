/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Juanes
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();
        int menu;
        do{
            System.out.println("Bienvenido al parqueadero");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Ingresar un vehículo.");
            System.out.println("2. Sacar un vehículo.");
            System.out.println("3. Mostrar seccion.");
            System.out.println("4. Ingresos.");
            System.out.println("0. Salir.");
            menu = leer.nextInt();
            switch(menu){
                case 1:
                    parqueadero.IngresarVehiculo();
                    break;
                case 2:
                    System.out.println("En que seccion se encuentra el vehiculo?");
                    int numsec = leer.nextInt();
                    numsec-=1;
                    System.out.println("Placa del vehiculo?");
                    String numplaca;
                    numplaca = leer.next();
                    System.out.println("Cual es el costo por minuto en el parqueadero?");
                    double costoMinuto;
                    costoMinuto = leer.nextDouble();
                    parqueadero.cuentaTiempo(numsec,numplaca,costoMinuto); 
                    parqueadero.SacarVehiculo(numsec,numplaca);
                    parqueadero.DevueltaVehiculoZonaTemporal(numsec);
                    break;
                case 3:
                    parqueadero.MostrarSeccion();
                    break;
                case 4:
                    System.out.println("Los ingresos totales son: " + parqueadero.getIngreso());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }while(menu != 0);
    }
}
