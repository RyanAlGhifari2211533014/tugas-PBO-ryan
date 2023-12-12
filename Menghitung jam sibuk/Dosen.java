class Dosen extends Elemen {
    private int jumlahHariKerja;

    public Dosen(String nama, int jumlahHariKerja) {
        super(nama);
        this.jumlahHariKerja = jumlahHariKerja;
    }

    @Override
    public String toString() {
        return getNama() + " adalah seorang dosen dengan jam sibuk " + getJamSibuk();
    }

    public int getJamSibuk() {
        return jumlahHariKerja * 8;
    }
}
