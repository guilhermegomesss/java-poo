package copiadora.digitalizadora.impressora.multifuncional.estabelecimento;


import copiadora.Copiando;
import copiadora.digitalizadora.impressora.Impressora;
import copiadora.digitalizadora.impressora.multifuncional.EquipamentoMultifuncional;


public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora =  em;
        Copiando copiando = em;

        impressora.imprimir();
        copiando.copiar();



    }
}
