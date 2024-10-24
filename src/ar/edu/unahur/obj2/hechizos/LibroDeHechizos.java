package ar.edu.unahur.obj2.hechizos;

import java.util.HashSet;
import java.util.Set;

public class LibroDeHechizos {

    Set<Hechizo> hechizos = new HashSet<Hechizo>();

    public void agregarHechizo(Hechizo hechizo) {
        hechizos.add(hechizo);
    }

    public Hechizo buscar(String hechizo) {
        for (Hechizo h : hechizos) {
            if (h.toString().equals(hechizo)) {
                return h;
            }
        }
        return null;
//        Iterator<Hechizo> iterador = hechizos.iterator();
//        while (iterador.hasNext()) {
//            Hechizo h = iterador.next();
//            if (h.toString().equals(hechizo)){
//                return h;
//            }
//        }
    }

    public Set<Hechizo> getHechizos() {
        return hechizos;
    }
}
