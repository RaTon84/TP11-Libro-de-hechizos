package ar.edu.unahur.obj2.hechizos;

import java.util.Objects;

public class Hechizo {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void aplicarHechizo(Hechizable hechizable) {
        hechizable.cambiarEstado();
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hechizo hechizo = (Hechizo) o;
        return Objects.equals(nombre, hechizo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
