package com.example.gestion;

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
        super("No se puede encontrar el Empleado " + id);
    }
}