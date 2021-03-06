/**
 * 
 */
package clinic.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * klasa reprezentująca tabelę USERS
 * użytkowników 
 * @author Łukasz Kochanek
 * @version 1.0
 */
@Entity
@Table(name = "USERS")
public class Users implements ObjectDB {

	private static final long serialVersionUID = -7358683619944606503L;
	
	@Id
	@Column(name = "ID_USERS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDUSER") 
	@SequenceGenerator(name="IDUSER", sequenceName = "IDUSER", allocationSize=1)
	private int idUser;
	
	@Column(name = "ID_DOCTOR")
	private int idDoc;
	
	@Column(name = "ID_PATIENT")
	private int idPatient;
	
	@Column(name = "ID_NURSE")
	private int nurse;
	
	@Column(name = "ID_OTHER")
	private int idOther;
	
	@Column(name = "ID_PERMISSIONS")
	private int idPermi;
	
	@Column(name = "E_MAIL")
	private String eMail;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNum;
	
	/**
	 * @param eMail the eMail to set
	 */
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	/**
	 * @param idDoc the idDoc to set
	 */
	public void setIdDoc(int idDoc) {
		this.idDoc = idDoc;
	}
	
	/**
	 * @param idOther the idOther to set
	 */
	public void setIdOther(int idOther) {
		this.idOther = idOther;
	}
	
	/**
	 * @param idPatient the idPatient to set
	 */
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}
	
	/**
	 * @param idPermi the idPermi to set
	 */
	public void setIdPermi(int idPermi) {
		this.idPermi = idPermi;
	}
	
	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	/**
	 * @param nurse the nurse to set
	 */
	public void setNurse(int nurse) {
		this.nurse = nurse;
	}
	
	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	/**
	 * @return the eMail
	 */
	public String geteMail() {
		return eMail;
	}
	
	/**
	 * @return the idDoc
	 */
	public int getIdDoc() {
		return idDoc;
	}
	
	/**
	 * @return the idOther
	 */
	public int getIdOther() {
		return idOther;
	}
	
	/**
	 * @return the idPatient
	 */
	public int getIdPatient() {
		return idPatient;
	}
	
	/**
	 * @return the idPermi
	 */
	public int getIdPermi() {
		return idPermi;
	}
	
	
	/**
	 * @return the idUser
	 */
	public int getIdUser() {
		return idUser;
	}
	
	
	/**
	 * @return the nurse
	 */
	public int getNurse() {
		return nurse;
	}
	
	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}
	
}
