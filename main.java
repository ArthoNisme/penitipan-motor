package ardhan;

public class main {
    public static void main(String[] args) {
        datapenitip a = new datapenitip("Ardhan","JOGJA","08512313131","laki-laki",1);
        System.out.println();
        petugas b = new petugas(112,"suryanto","0989712331");
        motor c = new motor(3242);

        System.out.println(" DATA PENITIP");
        a.id();
        System.out.println("--------------------------------");
        System.out.println("NAMA PENITIP = "+a.nama);
        System.out.println("ALAMAT PENITIP = "+a.alamat);
        System.out.println("NO HP PENITIP = "+a.nohp);
        System.out.println("JENIS KELAMIN = "+a.jk);
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("DATA PETUGAS");
        b.id();
        System.out.println("NAMA PETUGAS = "+b.nmptgs);
        System.out.println("NO HP PETUGAS = "+b.nohp_petugas);
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("DATA MOTOR");
        c.id();
        System.out.println();
        c.motor();
        System.out.println("DATA MOTOR");
        c.output();
        System.out.println("=================================");
        System.out.println("  STRUK PENITIPAN SEPEDA MOTOR");
        System.out.println("=================================");
        a.id();
        System.out.println("NAMA PENITIP    = "+a.nama);
        System.out.println("ALAMAT PENITIP  = "+a.alamat);
        System.out.println("NO HP PENITIP   = "+a.nohp);
        System.out.println("JENIS KELAMIN   = "+a.jk);
        System.out.println("NAMA PETUGAS    = "+b.nmptgs);
        System.out.println("NO HP PETUGAS   = "+b.nohp_petugas);
        c.output();
    }
}