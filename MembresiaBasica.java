package Act_Gym;

public class MembresiaBasica extends Membresia {
    private int visitasRestantes;

    public MembresiaBasica(String idMiembro, String nombreUsuario, int visitasRestantes){
        super(idMiembro, nombreUsuario);
        this.visitasRestantes = visitasRestantes;
    }

    @Override
    public boolean verificarAcceso(){
        if (visitasRestantes > 0){
            visitasRestantes--;
            System.out.println("Acceso permitido. Bienvenido :D");
            System.out.printf("Visitas restantes: %d%n", visitasRestantes);
            return true;
        } else {
            System.out.println("Acceso denegado. Visitas agotadas :c");
            return false;
        }
    }
}