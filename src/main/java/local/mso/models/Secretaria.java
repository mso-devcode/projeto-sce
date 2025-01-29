
package local.mso.models;

import java.util.Date;

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
    
    public Secretaria(){};
  
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

    @Override
    public String toString() {
        return "Secretaria[" +
                "Id='" + this.getId() + '\'' +
                ", matricula='" +  + '\'' +
                ", curso='" +  + '\'' +
                ", disciplinas="   +
                ", notas="   +
                ']';
    } 
    
}
