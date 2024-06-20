package TP08;

public class DriverSerangga_1302220003 {
    
    public static void main(String[] args) {
        Serangga seranggaSemut = new Semut("Merah", new Koordinat(70, 90));
        Serangga seranggaLebah = new Lebah("Orange", new Koordinat3D(30, 40, 50));

        seranggaSemut.info();
        seranggaLebah.info();

        Koordinat newKoordinatSemut = new Koordinat(80, 100);
        Koordinat3D newKoordinatLebah = new Koordinat3D(45, 55, 65);

        seranggaSemut.gerak(newKoordinatSemut);
        seranggaLebah.gerak(newKoordinatLebah);
        
        System.out.println("");
        seranggaSemut.info();
        seranggaLebah.info();
    }
}
