/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Empleados {

    private String nombre_emp;
    private String ced_emp;
    private String dirección;
    private String fec_nac;
    private String correo_emp;
    private int tel_emp;
    private String iddep_emp;
    private String fecha_ingreso;

    public Empleados() {
    }

    public Empleados(String nombre_emp, String ced_emp, String dirección, String fec_nac, String correo_emp, int tel_emp, String iddep_emp,String fecha_ingreso) {
        this.nombre_emp = nombre_emp;
        this.ced_emp = ced_emp;
        this.dirección = dirección;
        this.fec_nac = fec_nac;
        this.correo_emp = correo_emp;
        this.tel_emp = tel_emp;
        this.iddep_emp = iddep_emp;
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getNombre_emp() {
        return nombre_emp;
    }

    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    public String getCed_emp() {
        return ced_emp;
    }

    public void setCed_emp(String ced_emp) {
        this.ced_emp = ced_emp;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(String fec_nac) {
        this.fec_nac = fec_nac;
    }

    public String getCorreo_emp() {
        return correo_emp;
    }

    public void setCorreo_emp(String correo_emp) {
        this.correo_emp = correo_emp;
    }

    public int getTel_emp() {
        return tel_emp;
    }

    public void setTel_emp(int tel_emp) {
        this.tel_emp = tel_emp;
    }

    public String getIddep_emp() {
        return iddep_emp;
    }

    public void setIddep_emp(String iddep_emp) {
        this.iddep_emp = iddep_emp;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
   

    public String Visualizar() {
        return "Empleados:" + "nombre_emp:" + nombre_emp + ",ced_emp:" + ced_emp + ",dirección:" + dirección + ",fec_nac:" + fec_nac + ",correo_emp:" + correo_emp + ",tel_emp:" + tel_emp + ",iddep_emp:" + iddep_emp +"fecha_ingreso"+ fecha_ingreso;

    }

    public void modificar(String cedulaEmpEliminar, List<Empleados> listaEmpleados) {
        Iterator<Empleados> iterator = listaEmpleados.iterator();
        Scanner scanner = new Scanner(System.in);
        while (iterator.hasNext()) {
            Empleados empleado = iterator.next();
            if (empleado.getCed_emp().equalsIgnoreCase(ced_emp)) {
                System.out.println("Ingrese el nombre a modificar:");
                String nuevoNombre = scanner.next();
                setNombre_emp(nuevoNombre);
                System.out.println("Ingrese la direccion a modificar:");
                String nuevaDireccion = scanner.next();
                setDirección(nuevaDireccion);
                System.out.println("Ingrese el correo a modificar:");
                String nuevoCorreo = scanner.next();
                setCorreo_emp(nuevoCorreo);
                setCorreo_emp(nuevoCorreo);
                System.out.println("Ingrese el telefono a modificar");
                int nuevoTelefono = scanner.nextInt();
                setTel_emp(nuevoTelefono);
                System.out.println("Informacion del empleado:" + nuevoNombre + "\nModificacion exitosa");
            } else {
                System.out.println("El empleado con cedula " + cedulaEmpEliminar + " no fue encontrado");
            }
        }

    }

    public boolean eliminarEmpleado(String cedulaEmpEliminar, List<Empleados> listaEmpleados) {

        Iterator<Empleados> iterator = listaEmpleados.iterator();
        Scanner scanner = new Scanner(System.in);

        while (iterator.hasNext()) {
            Empleados empleado = iterator.next();
            if (empleado.getCed_emp().equalsIgnoreCase(cedulaEmpEliminar)) {
                // Se encontró al empleado, se solicita confirmación
                System.out.println("Empleado con cédula " + cedulaEmpEliminar + " encontrado. ¿Está seguro de eliminarlo? (s/n)");
                
                String respuesta = scanner.nextLine().toLowerCase();
                if (respuesta.equalsIgnoreCase("s")) {
                    // Confirmado, se elimina y se confirma
                    System.out.println("Empleado eliminado.");
                    iterator.remove();
                } else {
                    // No confirmado, se informa y se sale del ciclo
                    System.out.println("Eliminación cancelada.");
                }
                return true;
            }
        }
        System.out.println("El empleado con cedula "+ cedulaEmpEliminar+"no fue encontrado"  );
        return false;
        /*public static Empleados[] eliminar(Empleados[] empleados, int idEmpleado) {
        int indiceEmpleado = -1;
        // buscar el indice del empleado que queremos eliminar
        for (int i = 0; i < empleados.length; i++) {
            if (!empleados[i].getNombre_emp().equalsIgnoreCase(idEmpleado)){
            } else {
                indiceEmpleado = i;
                break;
            }
        }

        // si el empleado no existe en el Arrayist
        if (indiceEmpleado == -1) {
            System.out.println("El empleado con el ID: " + idEmpleado + " no existe en el sistema.");
            return empleados;
        }

        // eliminar el empleado del Arrayist
        for (int i = indiceEmpleado; i < empleados.length - 1; i++) {
            empleados[i] = empleados[i + 1];
        }
        return null;*/

    }
}
