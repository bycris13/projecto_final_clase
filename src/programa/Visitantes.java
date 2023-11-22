/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

/**
 *
 * @author Cris
 */
public class Visitantes {

    private String nombre_vis;
    private String ced_vis;
    private String correo_vis;
    private String iddep_vis;
    private String fecha_ingresovis;

    public Visitantes() {
    }

    public Visitantes(String nombre_vis, String ced_vis, String correo_vis, String iddep_vis,String fecha_ingresovis) {
        this.nombre_vis = nombre_vis;
        this.ced_vis = ced_vis;
        this.correo_vis = correo_vis;
        this.iddep_vis = iddep_vis;
        this.fecha_ingresovis = fecha_ingresovis;
    }

    public String getNombre_vis() {
        return nombre_vis;
    }

    public void setNombre_vis(String nombre_vis) {
        this.nombre_vis = nombre_vis;
    }

    public String getCed_vis() {
        return ced_vis;
    }

    public void setCed_vis(String ced_vis) {
        this.ced_vis = ced_vis;
    }

    public String getCorreo_vis() {
        return correo_vis;
    }

    public void setCorreo_vis(String correo_vis) {
        this.correo_vis = correo_vis;
    }

    public String getIddep_vis() {
        return iddep_vis;
    }

    public void setIddep_vis(String iddep_vis) {
        this.iddep_vis = iddep_vis;
    }

    public String getFecha_ingresovis() {
        return fecha_ingresovis;
    }

    public void setFecha_ingresovis(String fecha_ingresovis) {
        this.fecha_ingresovis = fecha_ingresovis;
    }

    public String Visualizar() {
        return "Visitantes:" + "nombre_vis:" + nombre_vis + "ced_vis:" + ced_vis + ",correo_vis:" + correo_vis + "iddep_vis:" + iddep_vis + "fecha_ingresovis"+fecha_ingresovis;

    }

}
