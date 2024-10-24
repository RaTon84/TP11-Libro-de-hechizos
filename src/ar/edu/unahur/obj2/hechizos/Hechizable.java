package ar.edu.unahur.obj2.hechizos;

public abstract class Hechizable {

    private String estado;

    public String getEstado() {
        return estado;
    }

    public abstract void cambiarEstado();

    protected void setEstado(String estado) {
        this.estado = estado;
    }
}
