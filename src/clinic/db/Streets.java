/**
 * 
 */
package clinic.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * klasa reprezentuj¹ca tabelê streets
 * ulice
 * @author £ukasz Kochanek
 * @version 1.0
 */
@Entity
@Table(name = "STREETS")
public class Streets implements ObjectDB {

	private static final long serialVersionUID = -1344531311031162521L;
	
	@Id
	@Column(name = "ID_STREETS")
	private int idStreets;
	
	@Column(name = "NAME")
	private String name;
	
	
	/**
	 * @param idStreets the idStreets to set
	 */
	public void setIdStreets(int idStreets) {
		this.idStreets = idStreets;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the idStreets
	 */
	public int getIdStreets() {
		return idStreets;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
}
