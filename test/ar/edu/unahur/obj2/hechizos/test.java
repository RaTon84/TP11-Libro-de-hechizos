package ar.edu.unahur.obj2.hechizos;

import org.junit.Test;
import static org.junit.Assert.*;

public class test {

    @Test
    public void queSePuedaAgregarUnHechizoAlLibro(){
        LibroDeHechizos libro = new LibroDeHechizos();
        Hechizo desarme = new Expelliarmus();
        libro.agregarHechizo(desarme);
        System.out.println(libro.getHechizos());
        assertEquals(desarme, libro.buscar("expelliarmus"));
    }

    @Test
    public void verSiUnHechizableEstaHechizado(){
        LibroDeHechizos libro = new LibroDeHechizos();
        Expelliarmus desarme = new Expelliarmus();
        Hechizable perro = new Animal();
        libro.agregarHechizo(desarme);
        Hechizo hechizo =libro.buscar("expelliarmus");
        hechizo.aplicarHechizo(perro);
        Assert.assertEquals("Me desarmaron", perro.getEstado());
    }
}
