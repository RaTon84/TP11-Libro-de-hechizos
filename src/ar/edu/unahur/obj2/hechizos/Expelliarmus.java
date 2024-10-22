package ar.edu.unahur.obj2.hechizos;

import java.util.Objects;

public class Expelliarmus extends Hechizo {
    String nombre = "expelliarmus";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expelliarmus that = (Expelliarmus) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
