package ardhan;

import java.util.Scanner;

public class kendaraan implements menu{
    private int no,id;
    private String nama,alamat,jenis,plat;
    @Override
    public void penitipan() {
        Scanner titip = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("| PROGRAM PENITIPAN DAN CUCI MOTOR   |");
        System.out.println("---------------------------------------");
        System.out.println("MASUKAN NAMA CUSTOMER        = ");
        nama = titip.next();
        System.out.println("MASUKAN ALAMAT               = ");
        alamat = titip.next();
        System.out.println("MASUKAN JENIS MOTOR          = ");
        jenis = titip.next();
        System.out.println("MASUKAN NO POLISI            = ");
        plat = titip.next();
        System.out.println("MASUKAN NO HP                = ");
        no = titip.nextInt();
        System.out.println("MASUKAN NO ANTRIAN PENITIPAN =");
        id = titip.nextInt();

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("|     STRUK PENGAMBILAN MOTOR        |");
        System.out.println("-------------------------------------");
        System.out.println(" NAMA CUSTOMER        = "+nama);
        System.out.println(" ALAMAT               = "+alamat);
        System.out.println(" JENIS MOTOR          = "+jenis);
        System.out.println(" NO POLISI            = "+plat);
        System.out.println(" NO HP                = "+no);
        System.out.println(" NO ANTRIAN PENITIPAN ="+id);

    }

    @Override
    public void pencucian() {
        Scanner cuci = new Scanner(System.in);
        int harga = 12000;
        System.out.println("-------------------------------------");
        System.out.println("| PROGRAM PENITIPAN DAN CUCI MOTOR   |");
        System.out.println("---------------------------------------");
        System.out.println("MASUKAN NAMA CUSTOMER        = ");
        nama = cuci.next();
        System.out.println("MASUKAN ALAMAT               = ");
        alamat = cuci.next();
        System.out.println("MASUKAN JENIS MOTOR          = ");
        jenis = cuci.next();
        System.out.println("MASUKAN NO POLISI            = ");
        plat = cuci.next();
        System.out.println("MASUKAN NO HP                = ");
        no = cuci.nextInt();
        System.out.println("MASUKAN NO ANTRIAN CUCIAN    = ");
        id = cuci.nextInt();
        System.out.println("HARGA PENCUCIAN              = ");
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("|     STRUK PENGAMBILAN MOTOR        |");
        System.out.println("-------------------------------------");
        System.out.println(" NAMA CUSTOMER        = "+nama);
        System.out.println(" ALAMAT               = "+alamat);
        System.out.println(" JENIS MOTOR          = "+jenis);
        System.out.println(" NO POLISI            = "+plat);
        System.out.println(" NO HP                = "+no);
        System.out.println(" NO ANTRIAN PENCUCIAN = "+id);
        System.out.println(" TOTAL BAYAR CUCIAN   = "+harga);
    }
}
