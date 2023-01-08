package ardhan;

import java.util.Scanner;

public class datapenitip extends penitipan implements titip{

    @Override
    public void id() {
        System.out.println("ID PENITIPAN    =  "+idpenitip);
    }


    public datapenitip(String nama, String alamat, String nohp, String jk,int idpenitip){
        super(nama,alamat,nohp,jk,idpenitip);
    }
}
