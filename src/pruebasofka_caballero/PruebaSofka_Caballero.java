package pruebasofka_caballero;

import java.util.Scanner;

/**
 *
 * @author David Caballero
 */
public class PruebaSofka_Caballero {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("\033[36m█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█");
        System.out.println("\033[36m█░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░░█");
        System.out.println("\033[36m█░░║║║╠─║─║─║║║║║╠─░░░█");
        System.out.println("\033[36m█░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░░█");
        System.out.println("\033[36m█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█");
        System.out.println(" ");
        System.out.println("Hola, ¿qué desea hacer?:\n"
                + "1.   Averiguar precio de pasajes de avión\n"
                + "2.   Recepción de Equipajes");
        System.out.print("Opción: ");
        int op = SC.nextInt();

        switch (op) {
            case 1:
                pasajeAvion(SC);

                break;
            case 2:
                System.out.println("Punto 2");

                break;
            default:
                System.out.println("\033[36m╔══════════════════╗");
                System.out.println("\033[36m║" + "\033[30m ¡Error! esta no es una opción ");
                System.out.println("\033[36m╚══════════════════╝");

        }

    }

    public static void pasajeAvion(Scanner SC) {
        float dist_km; //dist_km = La distancia a recorrer en kilometraje.
        int num_diaE; //num_diaE = El número de días de estancia.
        float valor_km; //valor_km = El precio equivalente a 1 kilometro.
        float valor_pasaje; //valor_pasaje = El precio del pasaje sin descuento.
        float descuento; //descuento = El valor a restar del precio del pasaje.
        float total_pago; //total_pago = El precio final del pasaje; ya sea, con el descuento aplicado o no.

        int i = 1; //i = contador para realizar el ciclo While
        while (i < 2) {
            System.out.println("╔-----------------╗\n"
                    + "║ PRECIOS PASAJES ║\n"
                    + "╚-----------------╝");
            System.out.println("");
            System.out.println("Por favor complete el siguiente formulario,\n"
                    + "para conocer el valor de su pasaje.");
            System.out.println("╔-------------------------╗\n"
                    + "║ Distancia en Kilometros ║\n"
                    + "╚-------------------------╝");
            System.out.print(":");
            dist_km = SC.nextFloat();
            System.out.println("╔------------------------------╗\n"
                    + "║ Cantidad de días de estancia ║\n"
                    + "╚------------------------------╝");
            System.out.print(":");
            num_diaE = SC.nextInt();

            valor_km = (float) 35.00;
            valor_pasaje = valor_km * dist_km;

            if (dist_km > 1000 && num_diaE > 7) {
                //hacer descuento
                descuento = (float) (valor_pasaje * 0.3);
                total_pago = valor_pasaje - descuento;
                System.out.println("╔----------------------------------------------------------------╗");
                System.out.println("║El precio de su pasaje es de: $" + valor_pasaje);
                System.out.println("║Pero Ud. cuenta con descuento de: $" + descuento);
                System.out.println("║Por lo tanto el precio final de su pasaje es de: $" + total_pago);
                System.out.println("╚----------------------------------------------------------------╝");

            } else {
                //1k = $35.00
                total_pago = valor_pasaje;
                System.out.println("╔----------------------------------------------------------------╗");
                System.out.println("║El precio de su pasaje es de: $" + total_pago);
                System.out.println("╚----------------------------------------------------------------╝");

            }

            System.out.println("¿Desea hacer el proceso de nuevo o desea salir?\n"
                    + "1. Repetir proceso\n"
                    + "2. Salir");
            i = SC.nextInt();

        }
    }

}
