package pilaresdapoo;

import pilaresdapoo.apps.FacebookMenseger;
import pilaresdapoo.apps.MSNMenseger;
import pilaresdapoo.apps.ServicoMesagemInstantania;
import pilaresdapoo.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
      ServicoMesagemInstantania smi = null;

        String appEscolhido = "tlg";

      if(appEscolhido.equals("msn")){
        smi = new MSNMenseger();
      }else if(appEscolhido.equals("fbm")){
        smi = new FacebookMenseger();
      }else if (appEscolhido.equals("tlg")){
        smi = new Telegram();
      }
      smi.enviarMensagem();
      smi.receberMensagem();
    }

   
}
