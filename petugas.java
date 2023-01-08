package ardhan;

import java.util.Scanner;

public class petugas extends penitipan implements titip{


    @Override
    public void id() {
        System.out.println("ID PETUGAS = "+idptgs);
    }

    public petugas(int idptgs, String nmptgs, String nohp_petugas){
        super(idptgs,nmptgs,nohp_petugas);
    }
}
