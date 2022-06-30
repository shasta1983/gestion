package com.example.gestion;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Employee {

    private @Id @GeneratedValue Long id;
    private String nombre;
    private String apellido;
    private String role;

    Employee() {}

    Employee(String name, String apellido, String role) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.role = role;
    }

    public Long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getRole() {
        return this.role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.nombre, employee.nombre)
                && Objects.equals(this.apellido, employee.apellido)
                && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.nombre, this.apellido, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", nombre='" + this.nombre + '\'' + ", apellido='" + this.apellido + '\'' +", role='" + this.role + '\'' + '}';
    }
}