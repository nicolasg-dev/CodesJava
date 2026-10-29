public class ServicoAlerta{
    Notificador notify;
    
    void alertaCritico(String mensagem){
        notify.enviar(" Alerta Crítico: "+ mensagem);
    }
}

//Implemente uma classe ServicoAlerta que tenha um atributo do tipo Notificador, passado via construtor, e um método:

//void alertaCritico(String mensagem);
//Esse método deve usar o notificador para enviar a mensagem com um prefixo " Alerta Crítico: ".