package clinic.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author £ukasz Kochanek
 * @version 1.0
 */

@Entity
@Table(name = "DOCTOR")
public class Doctor {
	
	@Id
	@GeneratedValue 
	@Column(name = "ID_DOCTOR")
	private int id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SURNAME")
	private String surname;
	
	public Doctor(){}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	  
}
