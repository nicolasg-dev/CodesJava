public class Voluntario extends Participante {

    public Voluntario (String n, Evento e) {
        super(n,e);
    }

    @Override
    public String getCertificado() {
        return super.getCertificado() + " atuando como voluntário do evento.\n";
    }
}
