public class Estudiante {
    String nombre = "";
    String codigo = "";
    String carrera = "";
    double promedio = 0f;

    public Estudiante(String nombre_param, String codigo_param, String carrera_param, double promedio_param) {
        this.nombre = nombre_param;
        this.codigo = codigo_param;
        this.carrera = carrera_param;
        this.promedio = promedio_param;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getCarrera() {
        return carrera;
    }
    public double getPromedio() {
        return promedio;
    }

    //Setters
    public void setNombre(String nombre_param2) {
        this.nombre = nombre_param2;
    }
    public void setCodigo(String codigo_param2) {
        this.nombre = codigo_param2;
    }
    public void seCarrera(String carrera_param2) {
        this.nombre = carrera_param2;
    }
    public void setPromedio(String promedio_param2) {
        this.nombre = promedio_param2;
    }
}