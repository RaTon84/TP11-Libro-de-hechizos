package ar.edu.unahur.obj2.hechizos;

import org.junit.Test;
import static org.junit.Assert.*;

public class test {
    LibroDeHechizos libro = new LibroDeHechizos();
    Hechizo desarme = new Expelliarmus();
    Hechizo desarme2 = new Expelliarmus();
    Hechizo crecer = new Agrandar("enormuvus");

    @Test
    public void queSePuedaAgregarUnHechizoAlLibro(){
        libro.agregarHechizo(desarme);
        assertEquals(desarme, libro.buscar("expelliarmus"));
    }

    @Test
    public void verSiUnHechizableEstaHechizado(){
        libro.agregarHechizo(desarme);
        Hechizable perro = new Animal();
        Hechizo hechizo =libro.buscar("expelliarmus");
        hechizo.aplicarHechizo(perro);
        assertEquals("Me desarmaron", perro.getEstado());
    }

    @Test
    public void verSiUnHechizableCrece() {
        libro.agregarHechizo(crecer);
        Hechizable mesa = new Mueble();
        Hechizo hechizo =libro.buscar("enormuvus");
        hechizo.aplicarHechizo(mesa);
        assertEquals("Ahora soy más grande", mesa.getEstado());
    }

    @Test
    public void noPoderAgregarUnMismoHechizo() {
        libro.agregarHechizo(desarme);
        assertEquals(1, libro.getHechizos().size());
        libro.agregarHechizo(desarme2);
        assertEquals(1, libro.getHechizos().size());
    }

    @Test
    public void verSiUnHechizableNoEstaHechizado() {
        Hechizable perro = new Animal();
        assertEquals("Normal", perro.getEstado());
    }
}
