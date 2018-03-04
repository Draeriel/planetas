package planetas;

import java.util.ArrayList;
import java.util.Arrays;

public enum Planeta {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    private final double masa;
    private final double radio;
    private final double G = 6.67300E-11;

    Planeta(double masa, double radio){
        this.masa = masa;
        this.radio = radio;

    }

    public double getMasa() {
        return masa;
    }

    public double getRadio() {
        return radio;
    }

    public double pesoSuperficie(double pesoHumano){
        return tuMasa(pesoHumano) * gravedadSuperficie();
    }

    private double tuMasa(double pesoHumano){
        return pesoHumano / EARTH.gravedadSuperficie();
    }

    private double gravedadSuperficie(){
        return G * getMasa() / (getRadio() * getRadio());
    }

    public static ArrayList<Planeta> getPlanetasTerrestres(){
        ArrayList<Planeta> rocosos = new ArrayList<>();
        Arrays.stream(Planeta.values()).filter(x -> x.ordinal() < 4).forEach(x -> rocosos.add(x));
        return rocosos;
    }

    public static ArrayList<Planeta> getGigantesGaseosos(){
        ArrayList<Planeta> gaseosos = new ArrayList<>();
        Arrays.stream(Planeta.values()).filter(x -> x.ordinal() > 4).forEach(x -> gaseosos.add(x));
        return gaseosos;
    }

}
