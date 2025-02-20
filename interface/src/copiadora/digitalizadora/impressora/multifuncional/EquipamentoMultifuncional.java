package copiadora.digitalizadora.impressora.multifuncional;

import copiadora.Copiando;
import copiadora.digitalizadora.Digitalizadora;
import copiadora.digitalizadora.impressora.Impressora;

public class EquipamentoMultifuncional implements  Copiando,Digitalizadora, Impressora { 
    
    public void copiar(){
        System.out.println("Copiando via Equipamento Multifuncional");
    }
    

    public void digitalizar(){
        System.out.println("Digitalizando via Equipamento Multifuncional");
    }

    public void imprimir(){
        System.out.println("Imprimindo via Equipamento Multifuncional");
    }

}
