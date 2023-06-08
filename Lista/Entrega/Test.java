package Lista.Entrega;

import java.util.Scanner;

public class Test {
    public static void parada(char letra, int i, int pos, int np, Scanner sc, Lista l){
        System.out.println("Llegamos a la parada " + i);
        System.out.print("Desean bajar (s/n): ");
        letra = sc.next().toLowerCase().charAt(0);
        while (letra != 'n') {
            System.out.print("De cual vagon bajan: ");
            pos = sc.nextInt();
            System.out.print("Cuantos pasajeros bajan: ");
            np = sc.nextInt();
            System.out.print("Se bajan pasajeros de otro vagón (s/n):");
            letra = sc.next().toLowerCase().charAt(0);
            l.bajarPasajeros(pos-1, np);
        }

        System.out.print("Cuantos pasajeros suben: ");
        np = sc.nextInt();
        l.subirPasajeros(np);
        l.mostrarInfo();
        i++;
    }
    public static void main(String[] args) {
        int capacidad;
        int pos = 0;
        int np = 0;
        int i = 1;
        boolean finalizo = false;
        char letra;
        Nodo n;
        Lista l = new Lista();
        Scanner sc = new Scanner(System.in);
        
        while (!finalizo) {
            System.out.print("Qué capacidad tiene el vagón " + i + ": ");
            capacidad = sc.nextInt();
            System.out.println();
            n = new Nodo(capacidad);

            l.agregarNodo(n);
            if (i >= 3 && i < 7) {
                System.out.print("Desea continuar (s/n): ");
                letra = sc.next().toLowerCase().charAt(0);
                if (letra == 'n') {
                    finalizo = true;
                }
            } 
            
            if (i == 7) {
                finalizo = true;
            }
            i++;
        }
        
        finalizo = false;
        i = 0;
        letra = ' ';
        while (!finalizo) {
            if (i == 0) {
                System.out.println("Inicio del recorrido");
                System.out.print("Cuantos pasajeros suben: ");
                np = sc.nextInt();
                l.subirPasajeros(np);
                l.mostrarInfo();
            }else if(i<=3){
                parada(letra, i, pos, np, sc, l);

            } else {
                while (letra != 'n') {
                    parada(letra, i, pos, np, sc, l);

                    System.out.print("Desea continuar (s/n): ");
                    letra = sc.next().toLowerCase().charAt(0);
                    if (letra == 'n') {
                        finalizo = true;
                    }
                }
            }
            i++;
        }
    }
}
