
import local.mso.models.Secretaria;

/**
 *
 * @author NB-MSO-RJO
 */
public class ProjetoSCE {
    
    public static void main(String[] args) {
        
        final String TITULO = "\t\t\tSISTEMA DE CONTROLE ESCOLAR";
                
        Secretaria secretaria = new Secretaria();
        System.out.println(TITULO);
       
       secretaria.carregarDadosSecretaria();
        System.out.println(secretaria);
       
    }

}
