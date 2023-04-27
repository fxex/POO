package BaseDeDatos;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        BasedeDatos bd = new BasedeDatos();
        Tabla ta;
        String nombre;
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-----------------");
            System.out.println("Menu");
            System.out.println("Base de datos actual: " + bd.getNombre());
            if (bd.getAbierta()) {
                System.out.println("Estado de la base de datos: Abierta");
            } else {
                System.out.println("Estado de la base de datos: Cerrada");
                
            }
            System.out.println("-----------------");

            System.out.println("1. Crear Base De Datos");
            System.out.println("2. Abrir y cerrar la Base De Datos");
            System.out.println("3. Agregar una tabla");
            System.out.println("4. Eliminar una tabla");
            System.out.println("5. Listar una tabla");
            System.out.println("0. Salir");

            System.out.println("Elija su opcion: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1 -> {
                    System.out.println("-----------------");
                    System.out.println("Creacion de la base de datos");
                    System.out.println("-----------------");

                    System.out.print("Eliga su nombre: ");
                    nombre = sc.next();
                    System.out.println();

                    bd = new BasedeDatos(nombre);

                    System.out.println("Se creo su base de datos llamada " + nombre);
                    System.out.println();
                }
                case 2->{
                    System.out.println("-----------------");
                    System.out.println("Abrir y cerrar la base de datos");
                    System.out.println("-----------------");
                    if (bd.getAbierta()) {
                        bd.cerrar();
                        System.out.println("Su base de datos se cerro exitosamente");
                        System.out.println();
                    } else {
                        bd.abrir();
                        System.out.println("Su base de datos se abrio exitosamente");
                        System.out.println();
                    }
                }
                case 3->{
                    System.out.println("-----------------");
                    System.out.println("Crear y agregar una Tabla a la base de datos");
                    System.out.println("-----------------");

                    System.out.print("Ingrese el nombre de su tabla: ");
                    nombre = sc.next();

                    ta = new Tabla(nombre);
                    
                    System.out.println("Se creo exitosamente la tabla");
                    System.out.println();

                    System.out.println("Subiendo la tabla: " + nombre + " a la base de datos");
                    try {
                        bd.agregarTabla(ta);
                        System.out.println("Se subio correctamente la tabla");
                    } catch (DBException d) {
                        System.out.println(d.getMessage());
                    } catch (TableException t){
                        System.out.println(t.getMessage());
                    }
                    System.out.println();

                }

                case 4->{
                    System.out.println("-----------------");
                    System.out.println("Eliminar una Tabla de la base de datos");
                    System.out.println("-----------------");

                    System.out.print("Ingrese el nombre de su tabla: ");
                    nombre = sc.next();

                    System.out.println("Buscando la tabla en la base de datos");
                    try {
                        bd.eliminarTabla(nombre);
                        System.out.println("Se elimino correctamente la tabla " + nombre + " de la base de datos" );
                        System.out.println();
                    } catch (DBException d) {
                        System.out.println(d.getMessage());
                    } catch (TableException t){
                        System.out.println(t.getMessage());
                    }
                }

                case 5 ->{
                    System.out.println("-----------------");
                    System.out.println("Listar las Tablas de la base de datos");
                    System.out.println("-----------------");

                    try {
                        bd.listarTablas();
                        System.out.println();
                    } catch (DBException d) {
                        System.out.println(d.getMessage());
                    }
                }

                case 0->{
                    break;
                }

                default ->{
                    System.out.println("Ingrese una opcion valida.");
                }
            }
            
        } while (opcion!= 0);
    }
}
