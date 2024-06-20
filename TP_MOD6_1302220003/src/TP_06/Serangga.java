package TP_06;

public abstract class Serangga {
    private final int JMLKAKI = 6;
    private String warna;

    public Serangga(String color){
        this.warna = color;
    }
    
    public int getJMLKAKI() {
        return JMLKAKI;
    }
    
    public String getWarna() {
        return warna;
    }   

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public abstract void info();
    public abstract void gerak(int[] axis);
}

class Semut extends Serangga{
    private Koordinat kordinat;

    public Semut(String color, int X, int Y) {
        super(color);
        this.kordinat = new Koordinat(X,Y);
    }
    
    public Koordinat getKordinat() {
        return kordinat;
    }

    public void setKordinat(Koordinat kordinat) {
        this.kordinat = kordinat;
    }
    
    @Override
    public void gerak(int[] axis){
        kordinat.setX(kordinat.getX() + 10);
        kordinat.setY(kordinat.getY() + 10);
    } 
    
    @Override
    public void info(){
        System.out.println("Posisi Semut: ");
        System.out.println("X: " + kordinat.getX());
        System.out.println("Y: " + kordinat.getY());
    }
}


class Lebah extends Serangga{
    private Koordinat3D koordinat3D;

    public Lebah(String color, int X, int Y, int Z) {
        super(color);
        this.koordinat3D = new Koordinat3D(X,Y,Z);
    }

    public Koordinat3D getKoordinat3D() {
        return koordinat3D;
    }

    public void setKoordinat3D(Koordinat3D koordinat3D) {
        this.koordinat3D = koordinat3D;
    }
    
    @Override
    public void gerak(int[] axis){
        koordinat3D.setX(koordinat3D.getX() - 50);
        koordinat3D.setY(koordinat3D.getY() - 60);
        koordinat3D.setZ(koordinat3D.getZ() - 70);
    } 
    
    @Override
    public void info(){
        System.out.println("Posisi Lebah: ");
        System.out.println("X: " + koordinat3D.getX());
        System.out.println("Y: " + koordinat3D.getY());
        System.out.println("Z: " + koordinat3D.getZ());
    }
    
    public void terbang(int X, int Y, int Z){
        koordinat3D.setX(koordinat3D.getX() + X);
        koordinat3D.setY(koordinat3D.getY() + Y);
        koordinat3D.setZ(koordinat3D.getZ() + Z);
    }
}

interface BisaTerbang{
    public void terbang(int X, int Y, int Z);
}