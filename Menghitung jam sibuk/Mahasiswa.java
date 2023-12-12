class Mahasiswa extends Elemen {
    private int SKS;

    public Mahasiswa(String nama, int SKS) {
        super(nama);
        this.SKS = SKS;
    }

    @Override
    public String toString() {
        return getNama() + " adalah seorang mahasiswa dengan jam sibu " + getJamSibuk();
    }

    public int getJamSibuk() {
        return SKS * 3;
    }
}