public class NotificadorPush implements Notificador{
    @Override 
    public void enviar(String mensagem){
        System.out.printf("Push: %s\n", mensagem);
    }
}
