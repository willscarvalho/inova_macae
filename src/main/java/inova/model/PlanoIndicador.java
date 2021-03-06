package inova.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author willian
 *
 *
 */
@Entity
@Table(name = "planoindicador")
public class PlanoIndicador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dtCadastro;
    private Long idUsuarioCadastro;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    // Inserido por Arnald   (RELAÇÃO DE MUITO PARA UM ENTRE PLANO INDICADOR INDICADOR X PLANO)
    @ManyToOne // MUITOS PlanosIndicadores para um Plano
    @JoinColumn(name = "idPlano", referencedColumnName = "id")
    private Plano plano;
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    // Inserido por Arnald   (RELAÇÃO DE MUITO PARA UM ENTRE PLANO INDICADOR INDICADOR X INDICADOR)    
    @ManyToOne // MUITOS Planos Indicadores para UM indicador
    @JoinColumn(name = "idIndicador", referencedColumnName = "id")
    private Indicador indicador;
    
    
    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Inserido por Arnald ///////////////////////////////////////////////////////////
    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

////////////////////////////////////////////////////////////////////////////////////////

    public Indicador getIndicador() {
        return indicador;
    }

    public void setIndicador(Indicador indicador) {
        this.indicador = indicador;
    }


    public String getDtCadastro() {
        return this.dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Long getIdUsuarioCadastro() {
        return this.idUsuarioCadastro;
    }

    public void setIdUsuarioCadastro(Long idUsuarioCadastro) {
        this.idUsuarioCadastro = idUsuarioCadastro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PlanoIndicador)) {
            return false;
        }
        PlanoIndicador other = (PlanoIndicador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inova.model.PlanoIndicador[ id=" + id + " ]";
    }

}
