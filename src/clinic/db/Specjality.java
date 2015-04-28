/**
 * 
 */
package clinic.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * klasa reprezntuj�ca tabel� Specjality
 * (specjalo��)
 * @author �ukasz Kochanek
 * @version 1.0
 */

@Entity
@Table(name = "SPECJALITY")
public class Specjality implements ObjectDB {

	private static final long serialVersionUID = -2787682233121341803L;

	@Id
	@Column(name = "ID_SPECJALITY")
	private int idSpecjal;
	
	@Column(name = "NAME")
	private String name;
	
	/**
	 * @param idSpecjal the idSpecjal to set
	 */
	public void setIdSpecjal(int idSpecjal) {
		this.idSpecjal = idSpecjal;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the idSpecjal
	 */
	public int getIdSpecjal() {
		return idSpecjal;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
}
