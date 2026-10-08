public class Voluntario extends Participante {

    public Voluntario (String n, Evento e) {
        super(n,e);
    }

    @Override
    public String getCertificado() {
        return super.getCertificado() + " tendo atuado como o cargo de voluntário na palestra: " + "\n";
    }
}
