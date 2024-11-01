package ar.edu.unahur.obj2.hechizos;

public abstract class Hechizable {

    private String estado = "Normal";

    public String getEstado() {
        return estado;
    }

    protected void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract void cambiarEstado();
}
