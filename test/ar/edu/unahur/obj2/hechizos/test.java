package ar.edu.unahur.obj2.hechizos;

import org.junit.Test;
import static org.junit.Assert.*;

public class test {
    LibroDeHechizos libro = new LibroDeHechizos();
    
    @Test
    public void queSePuedaAgregarUnHechizoAlLibro(){        
        Hechizo desarme = new Expelliarmus();
        libro.agregarHechizo(desarme);
//        System.out.println(libro.getHechizos());
        assertEquals(desarme, libro.buscar("expelliarmus"));
    }

    @Test
    public void verSiUnHechizableEstaHechizado(){
        Expelliarmus desarme = new Expelliarmus();
        Hechizable perro = new Animal();
        libro.agregarHechizo(desarme);
        Hechizo hechizo =libro.buscar("expelliarmus");
        hechizo.aplicarHechizo(perro);
        assertEquals("Me desarmaron", perro.getEstado());
    }

    @Test
    public void verSiUnHechizableCrece() {
        Hechizo crecer = new Agrandar("enormuvus");
        Hechizable mesa = new Mueble();
        libro.agregarHechizo(crecer);
//        System.out.println(libro.getHechizos());
        Hechizo hechizo =libro.buscar("enormuvus");
        hechizo.aplicarHechizo(mesa);
        assertEquals("Ahora soy más grande", mesa.getEstado());
    }
}
