
package local.mso.models;

import java.util.Calendar;

/**
 *
 * @author NB-MSO-RJO
 */

public class Secretaria {
    
      
   /* ------------ VARIAVEIS DA CLASSE --------------------- */
    private int id;
    private String responsavel;
    private String funcioanamento;
    private String status;
    private String email;
    private String localizacao;
    
    public Secretaria(){
        //this
    };
  
   /* ------------ GETTER'S E SETTER'S --------------------- */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getFuncioanamento() {
        return funcioanamento;
    }

    public void setFuncioanamento(String funcioanamento) {
        this.funcioanamento = funcioanamento;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    
   /* ------------ METODOS DA CLASSE --------------------- */
    
    public  void carregarDadosSecretaria() {
        this.setLocalizacao("Andar Terreo ao Lado da escada");
        this.setEmail("secretaria-sce@gmail.com");
        this.setId(01);
        this.setFuncioanamento("\t\t[manhã - 08:00 h às 12:00 h tarde - 13:30 h às 16:00 h.] ");
        this.setStatus(getStatusDiaHora());
    }
    
    private static String getStatusDiaHora() {
        Calendar hoje = Calendar.getInstance();
        String msg = "";
        
        int hora = hoje.get(Calendar.HOUR);
        
        if ( hora >= 8 && hora <= 12) {
            msg = "Aberto";
        } else if (hora >= 13 &&  hora <= 17 ){ 
            msg = "Aberto";
        } else {
            msg = "Fechado";
        }
        return msg;
    }


    @Override
    public String toString() {
        return "\nSecretaria[" + this.getStatus() +"] " +
                     this.getFuncioanamento();
    } 
    
}
