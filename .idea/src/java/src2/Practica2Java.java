package src2;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.*;

class Practica2Java {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        String opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Bienvenido a la Práctica 2 de java de Liberto Bianchi");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("[1] Método 1");
        System.out.println("[2] Método 2");
        System.out.println("[3] Método 3");
        System.out.println("[4] Método 4");
        System.out.println("[5] Método 5");
        System.out.println("[6] Método 6");
        System.out.println("[7] Método 7");
        System.out.println("[8] Método 8");
        System.out.println("[9] Método 9");
        System.out.println("[10] Salir");
        System.out.println("Inserta tu opción : ");
        opcion = sc.nextLine();
        switch (opcion) {
            case "1":
                System.out.println("Has seleccionado metodo 1");
                metodo1();
                break;

            case "2":
                System.out.println("Has seleccionado metodo 2");
                metodo2();
                break;

            case "3":
                System.out.println("Has seleccionado metodo 3");
                metodo3();
                break;

            case "4":
                System.out.println("Has seleccionado metodo 4");
                metodo4();
                break;

            case "5":
                System.out.println("Has seleccionado metodo 5");
                metodo5();
                break;

            case "6":
                System.out.println("Has seleccionado metodo 6");
                metodo6();
                break;

            case "7":
                System.out.println("Has seleccionado metodo 7");
                metodo7();
                break;

            case "8":
                System.out.println("Has seleccionado metodo 8");
                metodo8();
                break;

            case "9":
                System.out.println("Has seleccionado metodo 9");
                metodo9();
                break;

            case "10":
                System.out.println("\nApagando...");
                break;


        }
    }


    public static void metodo1() {
        Integer numeros[] = new Integer[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserta el número " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        System.out.println("Los cinco numeros introducidas són: " + Arrays.toString(numeros));
        menu();
    }

    public static void metodo2() {
        Integer numeros[] = new Integer[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserta el número " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        List listaNumeros = Arrays.asList(numeros);
        Collections.reverse(listaNumeros);
        Integer invertidos[] = (Integer[]) listaNumeros.toArray(numeros);
        System.out.println("Numeros al revés : " + Arrays.toString(invertidos));
        menu();

    }


    public static void metodo3() {
        Integer positivos[] = new Integer[0];
        Integer negativos[] = new Integer[0];
        Integer ceros[] = new Integer[0];
        Integer numeroInsertado;
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserta el número " + (i + 1));
            numeroInsertado = sc.nextInt();
            if (numeroInsertado > 0) {positivos[i] = numeroInsertado;
            }
            else if (numeroInsertado < 0) {
                negativos[i] = numeroInsertado;
            }
            else if (numeroInsertado == 0) {
                ceros[i] = numeroInsertado;
            }

        }
        System.out.println(Arrays.toString(positivos));
        System.out.println(Arrays.toString(negativos));
        System.out.println(Arrays.toString(ceros));
        menu();
    }


    public static void metodo4() {
        System.out.println("Inserta La palabra deseada: ");
        String palabra = sc.nextLine();
        System.out.println("Longitud = " + palabra.replace(" ", "").length());
        menu();
    }

    public static void metodo5() {
        String palabra[] = new String[50];
        String palabraInsertada;
        System.out.println("Inserta La palabra deseada: ");
        palabraInsertada = sc.nextLine();

        List palabra2 = Arrays.asList(palabra);

        Collections.reverse(palabra2);
        String invertido[] = (String[]) palabra2.toArray(palabra);
        System.out.println("Texto : " + Arrays.toString(invertido));
        menu();
    }

    public static void metodo6() {
        System.out.println("Inserta La frase deseada: ");
        String palabra = sc.nextLine();
        System.out.println("Longitud = " + palabra.replace(" ", ""));
        menu();
    }

    public static void metodo7() {
        System.out.println("Inserta la frase deseada: ");
        String frase1 = sc.nextLine();
        System.out.println("Inserta la segunda frase deseada: ");
        String frase2 = sc.nextLine();
        System.out.println(frase1+frase2);
        menu();
    }

    public static void metodo8() {
        System.out.println("Inserta la frase deseada: ");
        String frase = sc.nextLine();
        System.out.println("Inserta la letra deseada: ");
        String letra = sc.nextLine();
        char letraChar = letra.charAt(1);
        char mayus = Character.toUpperCase(letraChar);
        char[] aCaracteres = frase.toCharArray();

        for (int i = aCaracteres.length; i >= 1; i--) {
            if (aCaracteres[i] == letraChar){
                aCaracteres[i] = mayus;
            }

        }
        System.out.println(Arrays.toString(aCaracteres));
        menu();
    }

    public static void metodo9() {
        System.out.println("Has elegido el Método 9");
        menu();
    }

}

