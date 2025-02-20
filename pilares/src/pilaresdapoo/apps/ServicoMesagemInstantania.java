package pilaresdapoo.apps;

public abstract class  ServicoMesagemInstantania { 
    
     public abstract void enviarMensagem();
     public abstract void receberMensagem();

    protected void validarConectandoInternet(){ 
        System.out.println("Validando se esta conectado a internet");
    }
}