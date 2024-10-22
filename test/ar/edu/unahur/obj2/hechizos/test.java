package ar.edu.unahur.obj2.hechizos;

import org.junit.Test;
import static org.junit.Assert.*;

public class test {

    @Test
    public void test() {
        assertNull(null);
    }

    @Test
    public void queSePuedaAgregarUnHechizoAlLibro(){
        LibroDeHechizos libro = new LibroDeHechizos();
        Hechizo desarme = new Expelliarmus();
        libro.agregarHechizo(desarme);
        assertEquals(desarme, libro.buscar("expelliarmus"));
    }

}
