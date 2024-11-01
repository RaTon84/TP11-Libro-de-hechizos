package ar.edu.unahur.obj2.hechizos;

public class Animal extends Hechizable {

    public Animal() {}

    @Override
    public void cambiarEstado() {
        this.setEstado("Me desarmaron");
    }
}
