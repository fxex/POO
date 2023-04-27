package Parcial2020;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        int opcionSegunda = 0;
        Test t = new Test(10);
        TextoLibre tl;
        VerdaderoFalso vf;
        OpcionMultiple om;
        int numeroPregunta;
        String enunciado, respuesta;
        do {
            System.out.println("-------------");
            System.out.println("Bienvenido al gestor de un parcial");
            System.out.println("-------------");
            
            System.out.println("Que opcion desea ingresar: ");
            System.out.println("1. Agregar una pregunta");
            System.out.println("2. Eliminar una pregunta");
            System.out.println("3. Mostrar preguntas y respuestas");
            System.out.println("0. Salir");

            System.out.print("Elija su opcion: ");
            opcion = sc.nextInt();
            System.out.println();

            switch(opcion){
                case 1 -> {
                    System.out.println("Que tipo de pregunta desea añadir");
                    System.out.println("1. Texto libre.");
                    System.out.println("2. Verdadero o falso.");
                    System.out.println("3. Opcion multiple.");

                    System.out.print("Elija su opcion: ");
                    opcionSegunda = sc.nextInt();
                    System.out.println();

                    switch(opcionSegunda){
                        case 1 -> {
                            System.out.println("-----------");

                            System.out.print("Ingrese el numero de su pregunta: ");
                            numeroPregunta = sc.nextInt();
                            System.out.println();

                            System.out.print("Ingrese el enunciado de su pregunta: ");
                            enunciado = sc.next();
                            sc.nextLine();
                            System.out.println();

                            System.out.print("Ingrese la respuesta de su pregunta: ");
                            respuesta = sc.next();
                            sc.nextLine();
                            System.out.println();

                            tl = new TextoLibre(enunciado, numeroPregunta, respuesta);

                            sc.close();
                            System.out.println("Subiendo la pregunta");
                            t.agregarPregunta(tl);
                            System.out.println("Se subio correctamente la pregunta.");

                            System.out.println("-----------");
                        }
                        case 2 -> {
                            char letra;
                            System.out.println("-----------");

                            System.out.print("Ingrese el numero de su pregunta: ");
                            numeroPregunta = sc.nextInt();
                            System.out.println();

                            System.out.print("Ingrese el enunciado de su pregunta: ");
                            enunciado = sc.next();
                            System.out.println();

                            System.out.print("Es verdadera su pregunta (s/n): ");
                            letra = Character.toLowerCase(sc.next().charAt(0));
                            System.out.println();

                            if (letra == 's') {
                                vf = new VerdaderoFalso(enunciado, numeroPregunta, true);
                            } else {
                                vf = new VerdaderoFalso(enunciado, numeroPregunta, false);   
                            }
                            System.out.println("Subiendo la pregunta");
                            t.agregarPregunta(vf);
                            System.out.println("Se subio correctamente la pregunta.");

                            System.out.println("-----------");
                        }
                        case 3 -> {
                            String respuesta1, respuesta2, respuesta3;
                            int opcionCorrecta;
                            System.out.println("-----------");

                            System.out.print("Ingrese el numero de su pregunta: ");
                            numeroPregunta = sc.nextInt();
                            System.out.println();

                            System.out.print("Ingrese el enunciado de su pregunta: ");
                            enunciado = sc.next();
                            System.out.println();

                            System.out.print("Cual es su primera opcion: ");
                            respuesta1 = sc.next();
                            System.out.println();

                            System.out.print("Cual es su segunda opcion: ");
                            respuesta2 = sc.next();
                            System.out.println();

                            System.out.print("Cual es su tercera opcion: ");
                            respuesta3 = sc.next();
                            System.out.println();

                            System.out.print("Cual es la opcion correcta: ");
                            opcionCorrecta = (sc.nextInt()-1);
                            System.out.println();

                            om = new OpcionMultiple(enunciado, numeroPregunta, respuesta1, respuesta2, respuesta3, opcionCorrecta);

                            System.out.println("Subiendo la pregunta");
                            t.agregarPregunta(om);
                            System.out.println("Se subio correctamente la pregunta.");

                            System.out.println("-----------");
                        }
                        default -> {
                            System.out.println("---------------");

                            System.out.println("Ingrese una opcion valida.");

                            System.out.println("---------------");
                        }
                    }
                }
                case 2 -> {}
                case 3 -> {}
                case 0 -> {
                    break;
                }
                default -> {}
            }
        } while (opcion != 0);
    }
}
