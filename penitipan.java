package ardhan;

abstract class penitipan {
    public int idpenitip;
    private double biaya;
    public   int idmotor;
    public String jenismtr;
    public   String warna;
    public int idptgs;
    public String nmptgs;
    public String nohp_petugas;

    public String nama;
    public String alamat;
    public String nohp;
    public String jk;

    public penitipan(){

    }

    public int getIdpenitip() {
        return idpenitip;
    }

    public penitipan(String nama, String alamat, String nohp, String jk,int idpenitip) {
        this.idpenitip = idpenitip;
        this.nama = nama;
        this.alamat = alamat;
        this.nohp = nohp;
        this.jk = jk;
    }

    public penitipan(int idptgs, String nmptgs, String nohp_petugas) {
        this.idptgs = idptgs;
        this.nmptgs = nmptgs;
        this.nohp_petugas = nohp_petugas;
    }

    public penitipan(int idmotor) {
        this.idmotor = idmotor;
    }

    public abstract void id();
}
