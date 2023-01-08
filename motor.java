package ardhan;

import java.util.Scanner;

public class motor extends penitipan implements titip{

    public motor(int idmotor){
        super(idmotor);
    }

    @Override
    public void id() {
        System.out.println("PLAT NOMOR = "+idmotor);
    }

    public void motor() {
        Scanner c = new Scanner(System.in);
        System.out.println("NAMA MOTOR = ");
        jenismtr = c.next();
        System.out.println("WARNA      = ");
        warna = c.next();
    }
    public  void output(){
        System.out.println("NAMA MOTOR      = "+jenismtr);
        System.out.println("PLAT NOMOR      = "+idmotor);
        System.out.println("WARNA           = "+warna);
    }
}
