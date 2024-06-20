package TP08;

public class Koordinat {
    private int X;
    private int Y;

    public Koordinat(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    
    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
}

class Koordinat3D extends Koordinat {
    private int Z;

    public Koordinat3D(int X, int Y, int Z) {
        super(X, Y);
        this.Z = Z;
    }

    public int getZ() {
        return Z;
    }

    public void setZ(int Z) {
        this.Z = Z;
    }
}