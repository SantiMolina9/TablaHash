package proyectohash;

import java.util.Scanner;

public class ProyectoHash {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String op;
        
        Employee empleado = new Employee();
        System.out.println("Ingrese el tamaño de la tabla");
        int tamaño = leer.nextInt();
        Tabla tablaHash = new Tabla(tamaño);
        leer.nextLine();
        
        do{
            
        System.out.println("Ingrese una opcion");
        System.out.println("1- Metodo de Aritmetica Modular");
        System.out.println("2- Metodo de Plegamiento");
        System.out.println("3- Metodo de Mitad de Cuadrado");
        System.out.println("4- Metodo de Multiplicacion");
        System.out.println("*- Salir");
        op = leer.nextLine();
        
        switch(op){
            case "1" -> {
                System.out.println("Ingrese el ID");
                int claveModular = leer.nextInt();
                leer.nextLine();
                empleado.setId(claveModular);
                int posModular = tablaHash.aModular(claveModular);
                System.out.println("La posicion en la tabla Hash de su clave es: " + posModular);
                tablaHash.insertarAModular(empleado);
                }
            case "2" -> {
                System.out.println("Ingrese el ID");
                String clavePlegamiento = leer.nextLine();
                int posPlegamiento = tablaHash.plegamiento(clavePlegamiento);
                System.out.println("La posicion en la tabla Hash de su clave es: " + posPlegamiento);
                tablaHash.insertarPlegamiento(empleado, posPlegamiento);
                }
            case "3" -> {
                System.out.println("Ingrese el ID");
                int claveMitadDeCuadrado = leer.nextInt();
                leer.nextLine();
                empleado.setId(claveMitadDeCuadrado);
                int posMitadDeCuadrado = tablaHash.mitadDelCuadrado(claveMitadDeCuadrado);
                System.out.println("La posicion en la tabla Hash de su clave es: " + posMitadDeCuadrado);
                tablaHash.insertarMitadDelCuadrado(empleado);
                }
            case "4" -> {
                System.out.println("Ingrese el ID");
                int claveMultiplicacion = leer.nextInt();
                leer.nextLine();
                empleado.setId(claveMultiplicacion);
                int posMultiplicacion = tablaHash.multiplicacion(claveMultiplicacion);
                System.out.println("La posicion en la tabla Hash de su clave es: " + posMultiplicacion);
                tablaHash.insertarMultiplicacion(empleado);
                }
            case "*" -> System.out.println("Saliendo...");
            default -> System.out.println("Ingrese una opcion correcta");
        }
      }while(!"*".equals(op));
    }
}
