public class Lista {
    public String NombreTarea;
    public String Duracion;
    public String NombreEncargado;
    public String Estado;

    public Lista(String NombreTarea_param, String Duracion_param, String NombreEncargado_param, String Estado_param) { 
        this.NombreTarea = NombreTarea_param;
        this.Duracion = Duracion_param;
        this.NombreEncargado = NombreEncargado_param;
        this.Estado = Estado_param;
    }

    public String getNombreTarea() {
        return NombreTarea;
    }
    
    public String getDuracion() {
        return Duracion;
    }

    public String getNombreEncargado() {
        return NombreEncargado;
    }
    
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}