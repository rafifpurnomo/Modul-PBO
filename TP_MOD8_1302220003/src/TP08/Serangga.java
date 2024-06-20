package TP08;

public abstract class Serangga {
    private Koordinat posisi;
    private String warna;

    public Serangga(String warna, Koordinat k) {
        this.posisi = k;
        this.warna = warna;
    }

    public Koordinat getPosisi() {
        return posisi;
    }

    public void setPosisi(Koordinat posisi) {
        this.posisi = posisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public abstract void gerak(Koordinat k);
    public abstract void info();
}

class Lebah extends Serangga{

    public Lebah(String warna, Koordinat3D k) {
        super(warna, k);
    }
    
    @Override
    public void gerak(Koordinat k){
        if (k instanceof Koordinat3D) {
            Koordinat3D newKoordinat3D = (Koordinat3D) k;
            setPosisi(k);
        } else {
            System.out.println("koordinat lebah tidak valid");
        }
    }
    
    @Override
    public void info(){
        String color = getWarna();
        Koordinat3D k = (Koordinat3D) getPosisi();
        
        System.out.println("Warna lebah: " + color);
        System.out.println("posisi lebah:");
        System.out.println("X: " + k.getX());
        System.out.println("Y: " + k.getY());
        System.out.println("Z: " + k.getZ());
    }
}

class Semut extends Serangga {

    public Semut(String warna, Koordinat k) {
        super(warna, k);
    }
    
    @Override
    public void gerak(Koordinat k){
        if (k instanceof Koordinat) {
           Koordinat newKoordinat =(Koordinat) k;
            setPosisi(k);
        } else {
            System.out.println("koordinat semut tidak valid");
        }
    }
    
    @Override
    public void info(){
        String color = getWarna();
        Koordinat k = getPosisi();
        
        System.out.println("Warna semut: " + color);
        System.out.println("posisi semut:");
        System.out.println("X: " + k.getX());
        System.out.println("Y: " + k.getY());
    }
}
