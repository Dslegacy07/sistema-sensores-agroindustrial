public abstract class Sensor {
    private String id;
    private String ubicacion;
    private boolean activo;
    private double min=0;
    private double max=0;
    public Sensor(String id, String ubicacion, boolean activo){
        this.id=id;
        this.ubicacion=ubicacion;
        this.activo= activo;
    }
    public String getId(){
    return id;
    }
    public String getUbicacion(){
        return ubicacion;
    }
     public boolean getActivo(){
        return activo;
    }
    public void setId(String id){
        this.id= id;
    } 
    public void setUbicacion(String ubicacion){
        this.ubicacion= ubicacion;
    } 
    public void setActivo(boolean activo){
        this.activo= activo;
    } 
 public abstract double tomarLectura();
public String evaluarEstado(){
    if(activo){
        return "El Sensor esta activo";
    }
    else {
        return "El Sensor esta apagado";
    } 
}
}
