public class Combate {
    private Personaje personaje1;
    private Personaje personaje2;

    public Combate(Personaje personaje1, Personaje personaje2) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
    }

    public void iniciarCombate() {
        while (personaje1.getSalud() > 0 && personaje2.getSalud() > 0) {
            atacar(personaje1, personaje2);
            if (personaje2.getSalud() <= 0) {
                System.out.println(personaje1.getNombre() + " ha ganado el combate!");
                break;
            }
            atacar(personaje2, personaje1);
            if (personaje1.getSalud() <= 0) {
                System.out.println(personaje2.getNombre() + " ha ganado el combate!");
                break;
            }
        }
    }

    private void atacar(Personaje atacante, Personaje defensor) {
        int daño = atacante.calcularDaño();
        defensor.recibirDaño(daño);
        System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + " causando " + daño + " de daño.");
    }
}