public class Simulator {
    public static void main(String[] args) {
        Asdos Fairuzikun = new Asdos("Fairuzikun", 20, 13);
        System.out.println(Fairuzikun.nama + " adalah seorang asdos dengan jam sibuk " + Fairuzikun.getJamSibuk());

        Asdos Angel = new Asdos("Angel-chan", 20, 4);
        System.out.println(Angel.nama + " adalah seorang asdos dengan jam sibuk " + Angel.getJamSibuk());
        
        Dosen Raja = new Dosen("Raja OP Damanik", 5);
        System.out.println(Raja.nama + " adalah seorang dosen dengan jam sibuk " + Raja.getJamSibuk());

        Mahasiswa Firman = new Mahasiswa ("Firman", 20);
        System.out.println(Firman.nama + " adalah seorang mahasiswa dengan jam sibuk " + Firman.getJamSibuk());

        Mahasiswa Nidtopas = new Mahasiswa ("Nid to pass this sem", 23);
        System.out.println(Nidtopas.nama + " adalah seorang mahasiswa dengan jam sibuk " + Nidtopas.getJamSibuk());

        Dosen Nivotko = new Dosen("Nivotko", 3);
        System.out.println(Nivotko.nama + " adalah seorang dosen dengan jam sibuk " + Nivotko.getJamSibuk());

        int totalJamSibuk = 0;
        totalJamSibuk += Fairuzikun.getJamSibuk();
        totalJamSibuk += Angel.getJamSibuk();
        totalJamSibuk += Raja.getJamSibuk();
        totalJamSibuk += Firman.getJamSibuk();
        totalJamSibuk += Nidtopas.getJamSibuk();
        totalJamSibuk += Nivotko.getJamSibuk();

        System.out.println("Total jam sibuk elemen Fasilkom adalah " + totalJamSibuk);
    }
    }

