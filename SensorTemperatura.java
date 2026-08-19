
import java.util.Random;

public class SensorTemperatura extends Sensor {
private double celsius;
private double min=15;
    private double max=45;
    private  Random random= new Random();
    public SensorTemperatura(String id, String ubicacion, boolean activo, double celsius){
    super(id, ubicacion, activo);
    this.celsius= celsius;
}
public double getCelsius(){
    return celsius;
}
public void setCelsius(double celsius){
    this.celsius= celsius;
}
@Override 
public double tomarLectura(){
double temperatura = min + ( random.nextDouble()*(max-min));
return temperatura;
}
}
