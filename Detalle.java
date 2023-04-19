public class Detalle {
    private String tipoHabitacion;
    private int cantidad;
    private int personas;
    private int menores;

    public Detalle(){

    }
    public Detalle(String tipoHabitacion, int cantidad, int personas, int menores){
        this.tipoHabitacion=tipoHabitacion;
        this.cantidad=cantidad;
        this.personas=personas;
        this.menores=menores;

    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    public void setPersonas(int personas) {
        this.personas = personas;
    }
    public void setMenores(int menores) {
        this.menores = menores;
    }
    public int getCantidad() {
        return cantidad;
    }
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }
    public int getPersonas() {
        return personas;
    }
    public int getMenores() {
        return menores;
    }
}
