package org.example;

import java.time.LocalDate;

public class JuiceCoctel extends Coctel {

    private LocalDate fechaVencimiento;

    public JuiceCoctel() {
    }

    public JuiceCoctel(String nombre, long precio, LocalDate fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
