package Mapeo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author diego
 * @version 2.0
 */
@Entity
@Table(name = "vender")
public class Vender implements Serializable {
    
    @Id
    @JoinColumn(name = "id")
    private int id;
   
    
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    @JoinColumn(name = "idAlimento_fk")
    private Alimentos alimentos;
    
    
    @ManyToOne
    @JoinColumn(name = "idNombre_fk")
    private Puesto puesto;
    
    
    public Vender(){
        
    }
    
    public Vender(int id, Alimentos alimentos, Puesto puesto){
        this.id = id;
        this.alimentos = alimentos;
        this.puesto = puesto;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public Alimentos getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(Alimentos alimentos) {
        this.alimentos = alimentos;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    
    
}
