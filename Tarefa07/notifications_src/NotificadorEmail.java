public class NotificadorEmail implements Notificador{
    @Override 
    public void enviar(String mensagem){
        System.out.printf("Email: %s\n", mensagem);
    }
}
