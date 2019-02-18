/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caravana;

import java.util.*;

/**
 *
 * @author Usuario DAM 1
 */
public class Caravana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int popcion;
        int sopcion;
        Scanner sc = new Scanner(System.in);

        zona zonaprin = new zona();
        zonaprin.setEntradas(1000);
        zona zonacoven = new zona();
        zonacoven.setEntradas(200);
        zona zonaVip = new zona();
        zonaVip.setEntradas(25);

        System.out.println("1.Mostrar número de entradas libres");
        System.out.println("2.Vender entradas");
        System.out.println("3.Salir");
        popcion = 1;

        while (popcion != 3) {
            System.out.println("Elige una opción:");
            popcion = sc.nextInt();
            if (popcion == 1) {
                System.out.println("Quedan " + zonaprin.getEntradas() + " entradas en la zona principal.");
                System.out.println("Quedan: " + zonacoven.getEntradas() + " entradas en la zona de compra-venta.");
                System.out.println("Quedan: " + zonaVip.getEntradas() + " entradas en la zona VIP.");
            } else if (popcion == 2) {
                System.out.println("En que zona desea estar:");
                System.out.println("1-Zona principal");
                System.out.println("2-Zona compra-venta");
                System.out.println("3-Zona VIP");
                sopcion = sc.nextInt();
                switch (sopcion) {
                    case 1:
                        zonaprin.Venta();
                        System.out.println("Se encuentra agotado, quedan: " + zonaprin.getEntradas());
                        break;
                    case 2:
                        zonacoven.Venta();
                        System.out.println("Se encuentra agotado, quedan: " + zonacoven.getEntradas());
                        break;
                    case 3:
                        zonaVip.Venta();
                        System.out.println(zonaVip.getEntradas() + "Se encuentra agotado, quedan: ");
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            } else if (popcion != 1 && popcion != 2 && popcion != 3) {
                System.out.println("Error");
            }
        }
    }

}