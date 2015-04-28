/**
 * 
 */
package clinic.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Klasa reprezentująca tabelę bazy danych 
 * reprezentującej choroby
 * @author Łukasz Kochanek
 * @version 1.0
 */
@Entity
@Table(name = "DISEASES")
public class Diseases implements ObjectDB {

	private static final long serialVersionUID = -2155110646790965446L;

	@Id
	@Column(name = "ID_DISEASES")
	private int idDiseases;
	
	@Column(name = "NAME")
	private String name;
	
	/**
	 * @param idDiseases the idDiseases to set
	 */
	public void setIdDiseases(int idDiseases) {
		this.idDiseases = idDiseases;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the idDiseases
	 */
	public int getIdDiseases() {
		return idDiseases;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
}
