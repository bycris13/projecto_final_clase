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
public class Departamentos {

    private String nombre_dp;
    private String identificador_dp;
    private int aforo;

    public Departamentos() {
    }

    public Departamentos(String nombre_dp, String identificador_dp, int aforo) {
        this.nombre_dp = nombre_dp;
        this.identificador_dp = identificador_dp;
        this.aforo = aforo;
    }

    public String getNombre_dp() {
        return nombre_dp;
    }

    public void setNombre_dp(String nombre_dp) {
        this.nombre_dp = nombre_dp;
    }

    public String getIdentificador_dp() {
        return identificador_dp;
    }

    public void setIdentificador_dp(String identificador_dp) {
        this.identificador_dp = identificador_dp;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public String Visualizar() {
        return "Deparatamento: " + nombre_dp + "identificador departamento: " + identificador_dp + "Aforo: " + aforo;
    }
}