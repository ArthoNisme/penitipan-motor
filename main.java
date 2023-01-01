package ardhan;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int menu;
        Scanner input = new Scanner(System.in);
        kendaraan ardhan = new kendaraan();
        do {
            System.out.println("-------------------------------------");
            System.out.println("| PROGRAM PENITIPAN DAN CUCI MOTOR   |");
            System.out.println("---------------------------------------");
            System.out.println("1.PENITIPAN MOTOR");
            System.out.println("2.PENCUCIAN MOTOR");
            System.out.println("3.KELUAR");
            System.out.println("MASUKAN PILIHAN ANDA = ");
            menu = input.nextInt();
            if (menu==1){
                ardhan.penitipan();
            } else if (menu==2) {
                ardhan.pencucian();
            } else if (menu==3) {
                System.out.println("TERIMAKASIH !!!!!!!!");
            }else {
                System.out.println("SELESAIIIIII");
            }
        }while (menu!=4);
    }
}
