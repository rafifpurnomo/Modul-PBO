package TP06;

public class Koordinat {
    int x;
    int y;

    public Koordinat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double hitungJarak(Koordinat k) {
        int dx = this.x - k.x;
        int dy = this.y - k.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

}

class KoordinatLingkaran extends Koordinat {
    private double r;

    public KoordinatLingkaran(int x, int y, double r) {
        super(x, y);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public boolean isBersinggungan(KoordinatLingkaran k) {
        double jarak = this.hitungJarak(k);
        return jarak <= this.r + k.r;
    }
}

class Koordinat3D extends Koordinat {
    private int z;

    public Koordinat3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

public double hitungJarak(Koordinat3D k) {
        int dx = Math.abs(this.x - k.x);
        int dy = Math.abs(this.y - k.y);
        int dz = Math.abs(this.z - k.z);
        return dx + dy + dz;
    }

}
