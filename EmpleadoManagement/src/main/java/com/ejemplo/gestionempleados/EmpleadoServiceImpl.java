package com.ejemplo.gestionempleados;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoServiceImpl implements EmpleadoService {
    // Lista para almacenar los empleados registrados
    private List<Empleado> empleados = new ArrayList<>();
    
    @Override
    public void registrarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado registrado: " + empleado.getNombre());
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleados;
    }

    @Override
    public void bajarEmpleado(String idEmpleado) {
        empleados.removeIf(e -> e.getIdEmpleado().equals(idEmpleado));
        System.out.println("Empleado con ID " + idEmpleado + " ha sido dado de baja.");
    }

    @Override
    public double calcularIgss(Empleado empleado) {
        // Supongamos que el IGSS es el 4.83% del salario base
        double igss = empleado.getSalarioBase() * 0.0483;
        empleado.setIgss(igss);
        return igss;
    }

    @Override
    public double calcularIrtra(Empleado empleado) {
        // Supongamos que el IRTRA es el 1% del salario base
        double irtra = empleado.getSalarioBase() * 0.01;
        empleado.setIrtra(irtra);
        return irtra;
    }

    @Override
    public void agregarBono(String idEmpleado, double bono) {
        for (Empleado empleado : empleados) {
            if (empleado.getIdEmpleado().equals(idEmpleado)) {
                double nuevoSalario = empleado.getSalarioBase() + bono;
                empleado.setSalarioBase(nuevoSalario);
                System.out.println("Bono de " + bono + " agregado a " + empleado.getNombre());
                break;
            }
        }
    }

    @Override
    public void agregarDescuento(String idEmpleado, double descuento) {
        for (Empleado empleado : empleados) {
            if (empleado.getIdEmpleado().equals(idEmpleado)) {
                double nuevoSalario = empleado.getSalarioBase() - descuento;
                empleado.setSalarioBase(nuevoSalario);
                empleado.setDeducciones(empleado.getDeducciones() + descuento);
                System.out.println("Descuento de " + descuento + " aplicado a " + empleado.getNombre());
                break;
            }
        }
    }
}