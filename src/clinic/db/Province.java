/**
 * 
 */
package clinic.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Klasa reprezentuj�ca tabel� Province
 * (wojew�dztwo)
 * @author �ukasz Kochanek
 * @version 1.0
 */
@Entity
@Table(name = "PROVINCE")
public class Province implements ObjectDB {

	private static final long serialVersionUID = -1841442360821236465L;

	@Id
	@Column(name = "ID_PROVINCE")
	private int idProvince;
	
	@Column(name = "NAME")
	private String name;
	
	/**
	 * @param idProvince the idProvince to set
	 */
	public void setIdProvince(int idProvince) {
		this.idProvince = idProvince;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the idProvince
	 */
	public int getIdProvince() {
		return idProvince;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
		
}