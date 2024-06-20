package TP06;

public class DriverTP06 {

    public static void main(String[] args) {
        Koordinat A = new Koordinat(30, 24);
        Koordinat3D B = new Koordinat3D(20, 14, 15);

        double jarakAB = B.hitungJarak(A);
        System.out.println("Jarak antara B dan A: " + jarakAB);

        Koordinat3D C = new Koordinat3D(22, 52, 64);

        double jarakBC = B.hitungJarak(C);
        System.out.println("Jarak antara B dan C: " + jarakBC);

        KoordinatLingkaran D = new KoordinatLingkaran(70, 120, 25.5);
        KoordinatLingkaran E = new KoordinatLingkaran(50, 100, 65.2);

        double jarakDE = D.hitungJarak(E);
        System.out.println("Jarak antara D dan E: " + jarakDE);

        boolean isBersinggungan = D.isBersinggungan(E);
        System.out.println("Apakah D dan E bersinggungan: " + isBersinggungan);
    }
}

