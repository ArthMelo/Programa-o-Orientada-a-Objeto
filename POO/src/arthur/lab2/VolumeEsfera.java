package study.arthur.lab2;
public class VolumeEsfera {
    public double Volume;
    public static final double PI = 3.14159;

    public VolumeEsfera(double raio) {
        this.Volume = (4* PI * Math.pow(raio, 3))/3;
    }
}
