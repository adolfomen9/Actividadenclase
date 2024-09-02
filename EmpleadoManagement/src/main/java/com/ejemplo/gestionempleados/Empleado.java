package com.ejemplo.gestionempleados;

import java.time.LocalDate;

public class Empleado {
    // Atributos
    private String idEmpleado;
    private String nombre;
    private String puestoTrabajo;
    private double salarioBase;
    private LocalDate fechaIngreso;
    private String departamento;
    private double igss;
    private double deducciones;
    private double irtra;
    
    // Constructor
    public Empleado(String idEmpleado, String nombre, String puestoTrabajo, double salarioBase, LocalDate fechaIngreso, String departamento) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.puestoTrabajo = puestoTrabajo;
        this.salarioBase = salarioBase;
        this.fechaIngreso = fechaIngreso;
        this.departamento = departamento;
        this.igss = 0.0; // Inicialmente en 0, se calculará después
        this.deducciones = 0.0; // Inicialmente en 0, se calculará después
        this.irtra = 0.0; // Inicialmente en 0, se calculará después
    }
    
    // Getters y Setters
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getIgss() {
        return igss;
    }

    public void setIgss(double igss) {
        this.igss = igss;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    public double getIrtra() {
        return irtra;
    }

    public void setIrtra(double irtra) {
        this.irtra = irtra;
    }

    // Métodos adicionales como calcular IGSS, IRTRA, etc., se agregarán en la clase EmpleadoServiceImpl.
}