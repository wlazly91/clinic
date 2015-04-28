/**
 * 
 */
package clinic.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** KLasa reprezentuj¹ca tabelê patient
 * (pacjent)
 * @author £ukasz Kochanek
 * @version 1.0
 */
@Entity
@Table(name = "PATIENT")
public class Patient implements ObjectDB {

	private static final long serialVersionUID = -6276453340015461292L;
	
	@Id
	@Column(name = "ID_PATIENT")
	private int idPatient;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SURNAME")
	private String surname;
	
	@Column(name = "PESEL")
	private String pesel;
	
	@Column(name = "INSURANCE")
	private String insurance;
	
	@Column(name = "ID_ADDRESS")
	private int adres;
	
	/**
	 * @param adres the adres to set
	 */
	public void setAdres(int adres) {
		this.adres = adres;
	}
	
	/**
	 * @param idPatient the idPatient to set
	 */
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}
	
	/**
	 * @param insurance the insurance to set
	 */
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @param pesel the pesel to set
	 */
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * @return the adres
	 */
	public int getAdres() {
		return adres;
	}
	
	/**
	 * @return the idPatient
	 */
	public int getIdPatient() {
		return idPatient;
	}
	
	/**
	 * @return the insurance
	 */
	public String getInsurance() {
		return insurance;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the pesel
	 */
	public String getPesel() {
		return pesel;
	}
	
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	
}
