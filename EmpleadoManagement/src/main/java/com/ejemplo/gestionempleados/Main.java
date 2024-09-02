package com.ejemplo.gestionempleados;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de EmpleadoServiceImpl
        EmpleadoService empleadoService = new EmpleadoServiceImpl();

        // Crear empleados
        Empleado empleado1 = new Empleado("E001", "Juan Pérez", "Desarrollador", 5000, LocalDate.of(2020, 1, 10), "IT");
        Empleado empleado2 = new Empleado("E002", "María García", "Diseñadora", 4500, LocalDate.of(2021, 5, 15), "Diseño");

        // Registrar empleados
        empleadoService.registrarEmpleado(empleado1);
        empleadoService.registrarEmpleado(empleado2);

        // Listar empleados
        System.out.println("Lista de empleados:");
        for (Empleado e : empleadoService.listarEmpleados()) {
            System.out.println(e.getNombre());
        }

        // Calcular IGSS e IRTRA
        empleadoService.calcularIgss(empleado1);
        empleadoService.calcularIrtra(empleado1);
        System.out.println("IGSS de " + empleado1.getNombre() + ": " + empleado1.getIgss());
        System.out.println("IRTRA de " + empleado1.getNombre() + ": " + empleado1.getIrtra());

        // Agregar un bono y un descuento
        empleadoService.agregarBono("E001", 500);
        empleadoService.agregarDescuento("E002", 200);

        // Listar empleados después de bonificaciones y descuentos
        System.out.println("Lista de empleados después de bonificaciones y descuentos:");
        for (Empleado e : empleadoService.listarEmpleados()) {
            System.out.println(e.getNombre() + " - Salario Base: " + e.getSalarioBase());
        }

        // Dar de baja un empleado
        empleadoService.bajarEmpleado("E002");

        // Listar empleados después de dar de baja
        System.out.println("Lista de empleados después de dar de baja:");
        for (Empleado e : empleadoService.listarEmpleados()) {
            System.out.println(e.getNombre());
        }
    }
}