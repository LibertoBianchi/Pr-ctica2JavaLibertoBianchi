import java.util.Scanner;

public class Practica2Java {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
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
        String letras [] = new String[5];
        Scanner sc = new Scanner(System.in);
        String palabraInsertada;
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserta la palabra número" +(i));
            palabraInsertada = sc.nextLine();
            letras[i]=palabraInsertada;
            System.out.println(letras);
        }
        System.out.println(letras);
    }
    public static void metodo2() {
        System.out.println("Has elegido el Método 2");
    }
    public static void metodo3() {
        System.out.println("Has elegido el Método 3");
    }
    public static void metodo4() {
        System.out.println("Has elegido el Método 4");
    }
    public static void metodo5() {
        System.out.println("Has elegido el Método 5");
    }
    public static void metodo6() {
        System.out.println("Has elegido el Método 6");
    }
    public static void metodo7() {
        System.out.println("Has elegido el Método 7");
    }
    public static void metodo8() {
        System.out.println("Has elegido el Método 8");
    }
    public static void metodo9() {
        System.out.println("Has elegido el Método 9");
    }

}
