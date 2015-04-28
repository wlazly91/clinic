/**
 * 
 */
package clinic.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * klasa reprezentuj¹ca tabele postoffice
 * (poczta)
 * @author £ukasz Kochanek
 * @version 1.0
 */
@Entity
@Table(name = "POST_OFFICE")
public class PostOffice implements ObjectDB {

	private static final long serialVersionUID = -6669312476488384074L;

	@Id
	@Column(name = "ID_POSTOFFICE")
	private int idPostOf;
	
	@Column(name = "ID_LOCALITY")
	private int idLocality;
	
	@Column(name = "CODE")
	private String code;
	
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * @param idLocality the idLocality to set
	 */
	public void setIdLocality(int idLocality) {
		this.idLocality = idLocality;
	}
	
	/**
	 * @param idPostOf the idPostOf to set
	 */
	public void setIdPostOf(int idPostOf) {
		this.idPostOf = idPostOf;
	}
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @return the idLocality
	 */
	public int getIdLocality() {
		return idLocality;
	}
	
	/**
	 * @return the idPostOf
	 */
	public int getIdPostOf() {
		return idPostOf;
	}
	
	
}
