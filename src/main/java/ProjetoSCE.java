
import local.mso.models.Secretaria;

/**
 *
 * @author NB-MSO-RJO
 */
public class ProjetoSCE {
    
    public static void main(String[] args) {
        
        final String TITULO = "\t\t\tSISTEMA DE CONTROLE ESCOLAR";
                
        Secretaria secretaria = new Secretaria();
        
        carregarDadosSecretaria(secretaria);
        
        System.out.println(TITULO);
    }

    private static void carregarDadosSecretaria(Secretaria secretaria) {
        secretaria.setLocalizacao("Andar Terreo ao Lado da escada");
        secretaria.setEmail("secretaria-sce@gmail.com");
        secretaria.setId(01);
        secretaria.setFuncioanamento("Horário\nmanhã - 08:00 h às 12:00 h\ntarde - 13:30 h às 16:00 h. ");
    }

}
