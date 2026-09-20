package Act_Gym;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Membresia> membresias = new ArrayList<>();
        membresias.add(new MembresiaBasica("B001", "Wally", 10));
        membresias.add(new MembresiaBasica("B002", "Lisa", 1));
        membresias.add(new MembresiaBasica("B003", "Lumine", 0));

        membresias.add(new MembresiaPremium("P001", "Kitty", 10));
        membresias.add(new MembresiaPremium("P002", "Harvey", 1));
        membresias.add(new MembresiaPremium("P003", "Noelle", 0));

        System.out.println("========== Acceso a Membresías ==========");
        for (Membresia m : membresias){
            System.out.println("---------- Info Miembro ----------");
            m.mostrarDatos();
            System.out.println("---------- Info Acceso ----------");
            m.verificarAcceso();

            // instanceof: verifica que el objeto pertenece a la clase MembresiaPremium
            if (m instanceof MembresiaPremium) {
                // Casting: convierte el objeto de tipo Membresia a MembresiaPremium
                ((MembresiaPremium) m).ingresarConInvitado();
            }
            System.out.println("=========================================");
        }
    }
}