public class Main {
    public static void main(String[] args) {
        ServicoAlerta alerta_email = new ServicoAlerta();
        alerta_email.notify = new NotificadorEmail();

        ServicoAlerta alerta_sms = new ServicoAlerta();
        alerta_sms.notify = new NotificadorSMS();
        
        ServicoAlerta alerta_push = new ServicoAlerta();
        alerta_push.notify = new NotificadorPush();
                
        alerta_email.alertaCritico("Você reprovou em POO !! :(");
        alerta_sms.alertaCritico("Seu cartão foi cancelado ! :)");
        alerta_push.alertaCritico("Alerta de tempestades ! :)");

        

    }
}