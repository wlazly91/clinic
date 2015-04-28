/**
 * 
 */
package clinic.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Klasa reprezentuj¹ca tabele HeathCheck
 * (badania)
 * @author £ukasz Kochanek
 * @version 1.0
 */
@Entity
@Table(name = "HEALTH_CHECK")
public class HealthCheck implements ObjectDB {

	private static final long serialVersionUID = 4736086748182759357L;
	
	@Id
	@Column(name = "ID_HEALTH")
	private int idHealth;
	
	@Column(name = "NAME")
	private String name;
	
	/**
	 * @param idHealth the idHealth to set
	 */
	public void setIdHealth(int idHealth) {
		this.idHealth = idHealth;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the idHealth
	 */
	public int getIdHealth() {
		return idHealth;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
