public class NotificadorSMS implements Notificador{
    @Override 
    public void enviar(String mensagem){
        System.out.printf("SMS: %s\n", mensagem);
    }
}
