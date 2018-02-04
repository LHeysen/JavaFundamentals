package manejoarchivos;

import java.util.Scanner;
//import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alumno alumno = new Alumno();
        boolean indOpcion1 = false;
        int nroAlumno;
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("Bienvenidos Al menu");
            System.out.println("[1] N alumnos");
            System.out.println("[2] Ingreso de Registo de Aumnos");
            System.out.println("[3] Calculo Promedio Final");
            System.out.println("[4] Obtener el alumnos mayor Promedio Total");
            System.out.println("[0] Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese numero de Alumnos: ");
                    nroAlumno = scanner.nextInt();
                    alumno.setNotas(new Notas[nroAlumno]);
                    indOpcion1 = true;
                    break;
                case 2:
                    if (indOpcion1) {

                        for (int index = 0; index < alumno.getNotas().length; index++) {
                            Notas notas = new Notas();
                            System.out.println("Alumno" + (index + 1));
                            System.out.println("Ingrese DNI del Alumnos");
                            alumno.setDni(scanner.nextInt());
                            System.out.println("Ingrese nombre");
                            alumno.setNombre(scanner.next());
                            System.out.println("Ingrese Apellido Paterno");
                            alumno.setApellidoPaterno(scanner.next());
                            System.out.println("Ingrese Apellido Materno");
                            alumno.setApellidoMaterno(scanner.next());
                            System.out.println("Ingrese Sexo");
                            alumno.setSexo(scanner.next());
                            System.out.println("Ingrese Nota de Practica");
                            notas.setNotaPractica(scanner.nextDouble());
                            System.out.println("Ingrese Nota de Medio ciclo");
                            notas.setNotaMedio(scanner.nextDouble());
                            System.out.println("Ingrese Nota Final");
                            notas.setExamenFinal(scanner.nextDouble());
                            //notas.getPromedioFinal(scanner.nextDouble())=notas.getNotasPracticas + notas.getNotasPracticas;
                            alumno.getNotas()[index] = notas;
                        }
                    } else {
                        System.out.println("Ingrese la opcion1");
                    }
                    break;
                case 3:
                    if (indOpcion1) {
                        //Notas notas = new Notas();
                        double promediofinal = 0.0;
                        for (Notas notas : alumno.getNotas()) {
                        promediofinal =(notas.getNotaPractica() + notas.getNotaMedio() + notas.getExamenFinal()) / 3;
                        System.out.println("Total: " + promediofinal);
                        alumno.getPromedioFinal();
                                 }
                        
                    } else {
                        System.out.println("Ingrese la opcion1");
                    }
                    break;

                case 4:
                  if (indOpcion1) {
                        double promediofinal = 0.0;
                                //String nombre;
                        for (Notas notas : alumno.getNotas()) {
                            if (notas != null) {
                                //nombre = alumno.getNombre();
                                promediofinal = ((notas.getNotaPractica() + notas.getNotaMedio() + notas.getExamenFinal()) / 3);                               
                           if(promediofinal>promediofinal) {
                            System.out.println("Total: " + promediofinal);
                        }
                            }
                            
                        //System.out.println("Total: " + alumno.getNombre());
                        
                        
                        
                        }
                        
                    } else {
                        System.out.println("Ingrese la opcion1");
                    }
                    break;
            }
        }
    }
}
