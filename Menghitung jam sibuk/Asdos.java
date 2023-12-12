class Asdos extends Mahasiswa {
    private int jamSibuk;

    public Asdos(String nama, int SKS, int jamSibuk) {
        super(nama, SKS);
        this.jamSibuk = jamSibuk;
    }

    @Override
    public String toString() {
        return getNama() + " adalah seorang asdos dengan jam sību " + getJamSibuk();
    } 
    @Override
    public int getJamSibuk() {
        return super.getJamSibuk() + jamSibuk;
    }
}