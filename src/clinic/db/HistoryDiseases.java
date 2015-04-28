/**
 * 
 */
package clinic.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Klasa reprezentuj¹ca tabelê History Diseases
 * (historia choroby)
 * @author £ukasz Kochanek
 * @version 1.0
 */
@Entity
@Table(name = "HISTORY_DISEASES")
public class HistoryDiseases implements ObjectDB {


	private static final long serialVersionUID = -5161160493512899651L;

	@Id
	@Column(name = "ID_HISTORY")
	private int idHistory;
	
	@Column(name = "ID_PATIENT")
	private int idPatient;
	
	@Column(name = "ID_DISEASES")
	private int idDiseases;
	
	@Column(name = "ID_VISITS")
	private int idVisit;
	
}
