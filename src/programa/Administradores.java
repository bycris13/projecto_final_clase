/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

/**
 *
 * @author Cris
 */
public class Administradores {

    private String usuario;
    private String nombre_admin;
    private String id_admin;

    public Administradores() {
    }

    public Administradores(String usuario, String nombre_admin, String id_admin) {
        this.usuario = usuario;
        this.nombre_admin = nombre_admin;
        this.id_admin = id_admin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre_admin() {
        return nombre_admin;
    }

    public void setNombre_admin(String nombre_admin) {
        this.nombre_admin = nombre_admin;
    }

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public String Visualizar() {
        return "Administradores:" + "usuario:" + usuario + ", nombre_admin:" + nombre_admin + ", id_admin:" + id_admin;
    }

    public String modificar(String usuario) {
        String permiso = "Denegado";
        if (usuario.equalsIgnoreCase(usuario)) {
            permiso = "Aceptado";
        } else {
            System.out.println("No tienes permiso para modificar la informacion del visitante o trabajador");
        }
        return permiso;
    }
}
