public class Organizador extends Participante {

    public Organizador (String n, Evento e) {
        super(n,e);
    }

    @Override
    public String getCertificado() {
        return super.getCertificado() + "atuando como organizador do evento." + "\n";
    }
}