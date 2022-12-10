public class transaksi extends sepatu {
    private int id_transaksi;
    private int jumlah[];
    private int total_bayar;
    private int sub_total[];
    private int diskon[];
    private int jum;
    private String alamatTujuan;
    private String tgl;

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public int[] getJumlah() {
        return jumlah;
    }

    public void setJumlah(int[] jumlah) {
        this.jumlah = jumlah;
    }

    public int getTotal_bayar() {
        return total_bayar;
    }

    public void setTotal_bayar(int total_bayar) {
        this.total_bayar = total_bayar;
    }

    public int[] getSub_total() {
        return sub_total;
    }

    public void setSub_total(int[] sub_total) {
        this.sub_total = sub_total;
    }

    public int[] getDiskon() {
        return diskon;
    }

    public void setDiskon(int[] diskon) {
        this.diskon = diskon;
    }

    public int getJum() {
        return jum;
    }

    public void setJum(int jum) {
        this.jum = jum;
    }

    public String getAlamatTujuan() {
        return alamatTujuan;
    }

    public void setAlamatTujuan(String alamatTujuan) {
        this.alamatTujuan = alamatTujuan;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public void Transaksi() {
        for (int i = 0; i < jum; i++) {
            sub_total[i] = ((jumlah[i] * harga[i]) - (jumlah[i] * harga[i] * diskon[i]));
            total_bayar += sub_total[i];
            System.out.println(i + 1 + "    " + namasepatu[i] + "   " + (harga[i]) + "    " + jumlah[i] + "     " + (int) (diskon[i] * 100) + "%" + "     " + (sub_total[i]));
        }
        System.out.println(" ");
        //Menampilkan total bayar
        System.out.println("Total Bayar : " + (total_bayar));
    }

    @Override
    public void setData() {

    }

    @Override
    public void tampil() {

    }
}
