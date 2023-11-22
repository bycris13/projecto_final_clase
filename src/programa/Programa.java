/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaracion de variables en empleados
        String ced_emp, dirección, nombre_emp, fec_nac, correo_emp, fecha_ingreso;
        int tel_emp;
        String iddep_emp;
        //Declaracion de variables de Visitantes
        String nombre_vis, ced_vis, correo_vis, iddep_vis, fecha_ingresovis;
        //Declaracion de variables Administradores
        String usuario, nombre_admin, id_admin;
        //Declaracion de variables de Departamentos
        String nombre_dp, identificador_dp;
        //Declaracion de variables de Programa 
        int n = 0, opccion, i, e, b = 0, count = 0;
        boolean validacion = false;
        String contraseña, identificacionDepartamento, limp, cedulaEmpEliminar;
        //Vector para Administradores 
        Administradores A[] = new Administradores[3];
        //Vector para departamentos
        Departamentos D[] = new Departamentos[7];
        D[0] = new Departamentos("Atención al Cliente ", "10", 9);
        D[1] = new Departamentos("Gerencia", "11", 3);
        D[2] = new Departamentos("Almacén", "12", 6);
        D[3] = new Departamentos("Recursos Humanos", "13", 3);
        D[4] = new Departamentos("Logística e Inventario ", "14", 10);
        D[5] = new Departamentos("Financiera y administrativa", "15", 3);
        D[6] = new Departamentos("Taller y mantenimiento", "16", 12);
        e = 7;

        // ArrayList de Empleados
        ArrayList<Empleados> E = new ArrayList<>();
        Empleados empleado0 = new Empleados("Brayan David Herrera Barajas", "1096057021", "Calle 15 carrera 24", "2004-11-04", "bherrerabarajs@gmail.com", 3022762, "11", "2023-11-19");
        E.add(empleado0);

        Empleados empleado1 = new Empleados("Juan", "109636789463", "calle14 carrera 2", "2001-01-2", "david@gmail.com", 302285, "11", "2023-11-20");
        E.add(empleado1);

        Empleados empleado2 = new Empleados("Juanlopez", "109652389465", "calle14 carrera 2", "2001-01-2", "david@gmail.com", 30225, "11", "2023-11-20");
        E.add(empleado2);

        Empleados empleado3 = new Empleados("Lopez Peres", "107643219765", "calle14 carrera 2", "2001-01-2", "Lopez Peres@gmail.com", 30225, "11", "2023-11-20");
        E.add(empleado3);

        Empleados empleado4 = new Empleados("Lopez", "106643219765", "calle14 carrera 2", "2001-01-2", "Lopez@gmail.com", 30225, "10", "2023-11-20");
        E.add(empleado4);

        Empleados empleado5 = new Empleados("San Juan", "102145219765", "calle14 carrera 2", "2001-01-2", "Lopez@gmail.com", 30225, "10", "2023-11-20");
        E.add(empleado5);

        Empleados empleado6 = new Empleados("San Juan", "102145219765", "calle14 carrera 2", "2001-01-2", "Lopez@gmail.com", 30225, "10", "2023-11-20");
        E.add(empleado6);
        //Empleados m = new Empleados();
        //Vector de visitantes
        ArrayList<Visitantes> V = new ArrayList<>();
        Visitantes visitante0 = new Visitantes("Brayan David", "109636789465", "bdavidherrera@gmail.com", "11", "2023-11-19");
        V.add(visitante0);

        Visitantes visitante1 = new Visitantes("Juan", "109126789465", "herrera@gmail.com", "11", "2023-11-19");
        V.add(visitante1);

        Visitantes visitante2 = new Visitantes("Sabado Herre", "109735189765", "SabadoHerre@gmail.com", "11", "2023-11-19");
        V.add(visitante2);

        Visitantes visitante3 = new Visitantes("Luiz Lopez", "102346789765", "LuizLopez@gmail.com", "11", "2023-11-19");
        V.add(visitante3);

        Visitantes visitante4 = new Visitantes("Maria", "102346789101", "Maria@gmail.com", "10", "2023-11-19");
        V.add(visitante4);

        Visitantes visitante5 = new Visitantes("Felipe", "1023402149101", "Felipe@gmail.com", "10", "2023-11-19");
        V.add(visitante5);

        do {
            System.out.println("Ingrese su nombre,identificacion de administrador y usuario para registarse como administrador:");
            nombre_admin = entrada.next();
            limp = entrada.nextLine();
            id_admin = entrada.next();
            limp = entrada.nextLine();//Limpiar bufer de entrada.
            usuario = entrada.next();
            Administradores nuevo = new Administradores(usuario, nombre_admin, id_admin);
            A[n] = nuevo;
            n++;
            do {
                System.out.println("INGRESAR AL PROGRAMA");
                System.out.println("Ingrese su usuario y su contrañesa(Indentificacion de administrador):");
                for (i = 0; i < n; i++) {
                    usuario = entrada.next();
                    limp = entrada.nextLine();
                    contraseña = entrada.next();
                    if (A[i].getUsuario().equalsIgnoreCase(usuario) && A[i].getId_admin().equalsIgnoreCase(contraseña)) {
                        validacion = true;
                    } else {
                        System.out.println("Usuario o contraseña incorrectos. Intente nuevamente.");
                    }
                }
            } while (!validacion);
            do {
                System.out.println("Bienvenido administrador");
                System.out.println("""
                                    MENU DE OPCCIONES
                                    1.Registra a los visitantes y seleccionar a que departamento se dirige
                                    2.Registra a los empleados y seleccionar a que departamento se dirige
                                    3.Consultar listado de los visitantes y empleados que hay en cada departamento
                                    4.Modificar informacion de las empleados registrados
                                    5.Eliminar un empleado.
                                    0.SALIR DEL MENU
                                    
                                      Ingrese su opccion:""");
                opccion = entrada.nextInt();
                switch (opccion) {
                    case 1:
                        System.out.println("Ingrese el nombre del Visitante:");
                        nombre_vis = entrada.next();
                        limp = entrada.nextLine();

                        System.out.println("Ingrese la cedula del Visitante:");
                        ced_vis = entrada.next();
                        limp = entrada.nextLine();

                        System.out.println("Ingrese el correo del visitante");
                        correo_vis = entrada.next();
                        limp = entrada.nextLine();

                        System.out.println("Ingrese el identificador del departamento:"
                                + "\n.Atencion al cliente=10"
                                + "\n.Gerencia=11"
                                + "\n.Almacén=12"
                                + "\n.Recursos Humanos=13"
                                + "\n.Logística e Inventario=14"
                                + "\n.Financiera y administrativa=15"
                                + "\n.Taller y mantenimiento=16");

                        iddep_vis = entrada.next();
                        limp = entrada.nextLine();

                        System.out.println("Ingrese la fecha en la que ingresa el visitante");
                        fecha_ingresovis = entrada.next();

                        Visitantes nuevos = new Visitantes(nombre_vis, ced_vis, correo_vis, iddep_vis, fecha_ingresovis);
                        V.add(nuevos);
                        count = count + 1;
                        System.out.println("-------------");
                        System.out.println(count);
                        break;

                    case 2:
                        System.out.println("Ingrese el nombre del empleado:");//la fecha y hora entrada
                        nombre_emp = entrada.next();
                        limp = entrada.nextLine();
                        System.out.println("Ingrese la cedula del empleado:");
                        ced_emp = entrada.next();
                        limp = entrada.nextLine();
                        System.out.println("Ingrese la direccion del empleado:");
                        dirección = entrada.next();
                        limp = entrada.nextLine();
                        System.out.println("Ingrese la fecha de nacimiento del empleado:");
                        fec_nac = entrada.next();
                        limp = entrada.nextLine();
                        System.out.println("Ingrese el correo del empleado:");
                        correo_emp = entrada.next();
                        System.out.println("Ingrese el telefono del empleado:");
                        tel_emp = entrada.nextInt();
                        limp = entrada.nextLine();
                        System.out.println("Ingrese el identificador del departamento:"
                                + "\n.Atencion al cliente=10"
                                + "\n.Gerencia=11"
                                + "\n.Almacén=12"
                                + "\n.Recursos Humanos=13"
                                + "\n.Logística e Inventario=14"
                                + "\n.Financiera y administrativa=15"
                                + "\n.Taller y mantenimiento=16");
                        iddep_emp = entrada.next();
                        limp = entrada.nextLine();
                        System.out.println("Ingrese la fecha de ingreso del empleado:");
                        fecha_ingreso = entrada.next();
                        Empleados nuev = new Empleados(nombre_emp, ced_emp, dirección, fec_nac, correo_emp, tel_emp, iddep_emp, fecha_ingreso);
                        E.add(nuev);
                        count = count + 1;
                        System.out.println("-------------");
                        System.out.println(count);
                        break;

                    case 3:

                       int cantidadEmpleados = 0;
                        int cantidadVisitantes = 0;
                        System.out.println("Ingrese el identificador del departamento:");
                        identificacionDepartamento = entrada.next();
                        for (i = 0; i < e; i++) {
                            if (D[i].getIdentificador_dp().equals(identificacionDepartamento)) {
                                System.out.println(D[i].Visualizar());
                            }
                        }

                        if (identificacionDepartamento.equals("10")) {
                            for (i = 0; i < E.size(); i++) {
                                if (E.get(i).getIddep_emp().equals("10")) {
                                    if (cantidadEmpleados < 2) {
                                        System.out.println(E.get(i).Visualizar());
                                        cantidadEmpleados++;
                                    }
                                }
                            }
                            for (i = 0; i < V.size(); i++) {
                                if (V.get(i).getIddep_vis().equals("10")) {///if (V.get(i).getIddep_vis().equals("10")
                                    if (cantidadVisitantes < 7) {
                                        System.out.println(V.get(i).Visualizar());
                                        cantidadVisitantes++;
                                    } else {
                                        System.out.println("Aforo lleno " );
                                        i = V.size();
                                    }
                                }
                            }
                            cantidadEmpleados = 0;
                            cantidadVisitantes = 0;
                        } else if (identificacionDepartamento.equals("11")) {
                            for (i = 0; i < E.size(); i++) {
                                if (E.get(i).getIddep_emp().equals("11")) {
                                    if (cantidadEmpleados < 2) {
                                        System.out.println(E.get(i).Visualizar());
                                        cantidadEmpleados++;
                                    }
                                }

                            }
                            for (i = 0; i < V.size(); i++) {
                                if (cantidadVisitantes < 1) {
                                    if (V.get(i).getIddep_vis().equals("11")) {
                                        System.out.println(V.get(i).Visualizar());
                                        cantidadVisitantes++;
                                    }
                                } else {
                                    System.out.println("Aforo lleno ");
                                    i = V.size();
                                }
                            }
                            
                            cantidadEmpleados = 0;
                            cantidadVisitantes = 0;
                            
                        } else if (identificacionDepartamento.equals("12")) {
                            for (i = 0; i < E.size(); i++) {
                                if (E.get(i).getIddep_emp().equals("12")) {
                                    if (cantidadEmpleados < 3) {
                                        System.out.println(E.get(i).Visualizar());
                                        cantidadEmpleados++;
                                    }
                                }

                            }

                            for (i = 0; i < V.size(); i++) {
                                if (cantidadVisitantes < 3) {
                                    if (V.get(i).getIddep_vis().equals("12")) {
                                        System.out.println(V.get(i).Visualizar());
                                        cantidadVisitantes++;
                                    }
                                } else {
                                    System.out.println("Aforo lleno ");
                                    i = V.size();
                                }
                            }

                        } else if (identificacionDepartamento.equals("13")) {

                        }
                        break;
                    /*for(i=0;i<E.size();i++){
                              System.out.println(E.get(i).Visualizar());
                             }
                             System.out.println("Deceseas remover a un empleado");
                             i=entrada.nextInt();
                             E.remove(i);*/
                    case 4:
                        System.out.println("Ingrese su usuario de administardor para poder modificar de los empleados");
                        usuario = entrada.next();
                        for (i = 0; i < n; i++) {
                            if (A[i].getUsuario().equalsIgnoreCase(usuario)) {
                                if (A[i].modificar(usuario).equalsIgnoreCase("Aceptado")) {
                                }
                            } else {
                                System.out.println("No se encontro su usario:" + "\n." + usuario);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Ingrese la cedula del empleado que deseas eliminar");
                        cedulaEmpEliminar = entrada.next();
                        Iterator<Empleados> iterator = E.iterator();
                        while (iterator.hasNext()) {
                            Empleados empleado = iterator.next();
                            if (empleado.eliminarEmpleado(cedulaEmpEliminar, E)) {
                                //se econtro el empleado y salio del bucle
                                break;
                            }
                        }

                        break;
                }

            } while (opccion != 0);
        } while (n < 3);

    }
}
