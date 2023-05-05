/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectohash;

import java.time.LocalDate;

/**
 *
 * @author Santiago
 */
public class Employee {
    int id;
    String nombre;
    String job;
    String Salary;
    LocalDate fechaDeIngreso;
    Employee T[];
    
    public Employee() {
    }
    

    public Employee(String nombre, String job, String Salary) {
        this.nombre = nombre;
        this.job = job;
        this.Salary = Salary;
    }
    
    
    public Employee(int id, String nombre, String job, String Salary, LocalDate fechaDeIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.job = job;
        this.Salary = Salary;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    
}
