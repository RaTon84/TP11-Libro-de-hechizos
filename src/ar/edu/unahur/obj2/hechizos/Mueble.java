package ar.edu.unahur.obj2.hechizos;

public class Mueble extends Hechizable {

    public Mueble() {
    }

    @Override
    public void cambiarEstado() {
        this.setEstado("Ahora soy más grande");
    }
}
