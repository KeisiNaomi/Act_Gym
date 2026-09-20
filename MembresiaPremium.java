package Act_Gym;

public class MembresiaPremium extends Membresia {
    private int pasesInvitado;

    public MembresiaPremium(String idMiembro, String nombreUsuario, int pasesInvitado){
        super(idMiembro, nombreUsuario);
        this.pasesInvitado = pasesInvitado;
    }

    @Override
    public boolean verificarAcceso(){
        System.out.println("Acceso permitido. Bienvenido a Premium!! :D");
        return true;
    }

    public boolean ingresarConInvitado(){
        if (pasesInvitado > 0){
            pasesInvitado--;
            System.out.println("Acceso con invitado permitido :D");
            System.out.printf("Pases de invitado restantes: %d%n", pasesInvitado);
            return true;
        } else {
            System.out.println("Acceso con invitado denegado. Pases agotados");
            System.out.println("Solo puede pasar el miembro :c");
            return false;
        }
    }
}