public class Voluntario extends Participante {

    public Voluntario (String n, Evento e) {
        super(n,e);
    }

    @Override
    public String getCertificado() {
        return super.getCertificado() + " atuando como o cargo de voluntário no evento.\n";
    }
}
