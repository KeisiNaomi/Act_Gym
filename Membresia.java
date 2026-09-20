package Act_Gym;

public abstract class Membresia {
    protected String idMiembro;
    protected String nombreUsuario;

    public Membresia(String idMiembro, String nombreUsuario){
        this.idMiembro = idMiembro;
        this.nombreUsuario = nombreUsuario;
    }

    public abstract boolean verificarAcceso();
    public void mostrarDatos(){
        System.out.printf("ID: %s%n", idMiembro);
        System.out.printf("Nombre: %s%n", nombreUsuario);
    }
}