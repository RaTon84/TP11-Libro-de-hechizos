package ar.edu.unahur.obj2.hechizos;

public class Animal extends Hechizable {
    @Override
    public void cambiarEstado() {
        this.setEstado("Me desarmaron");
    }
}
