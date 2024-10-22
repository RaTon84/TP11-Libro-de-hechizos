package ar.edu.unahur.obj2.hechizos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LibroDeHechizos {

    Set<Hechizo> hechizos = new HashSet<Hechizo>();

    public void agregarHechizo(Hechizo desarme) {
        hechizos.add(desarme);
    }

    public Hechizo buscar(String hechizo) {
        Iterator<Hechizo> iterador = hechizos.iterator();
        while (iterador.hasNext()) {
            Hechizo h = iterador.next();
            if (h.toString().equals(hechizo)){
                return h;
            }
        }
        return null;

//        hechizos.stream().map().toString()
//        if (hechizos.stream().anyMatch(h -> h.toString().equals(hechizo))) {
//            return 2;
//        }else{
//            return 3;
//        }
//        hechizos.
//        return hechizos.contains(hechizo) ? hechizos.iterator().next() : null;
    }

    public Set<Hechizo> getHechizos() {
        return hechizos;
    }
}
