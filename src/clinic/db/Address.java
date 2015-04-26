package clinic.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ADDRESS") 
public class Address 
{
	@Id
	@Column(name = "ID_ADDRESS")
	private int id;
	
	@Column(name = "ID_LOCALITY")
	private int id_locality;
	
	@Column(name = "ID_POSTOFFICE")
	private int id_postoffice;
	
	@Column(name = "ID_STREETS")
	private int id_strets;
	
	@Column(name = "ID_COUNTRIES")
	private int id_countries;
	
	@Column(name = "HOUSE_NUMBER")
	private int house_number;
	
	
	public void setHouse_number(int house_number) {
		this.house_number = house_number;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setId_countries(int id_countries) {
		this.id_countries = id_countries;
	}
	
	public void setId_locality(int id_locality) {
		this.id_locality = id_locality;
	}
	
	public void setId_postoffice(int id_postoffice) {
		this.id_postoffice = id_postoffice;
	}
	
	public void setId_strets(int id_strets) {
		this.id_strets = id_strets;
	}
	
	
	public int getHouse_number() {
		return house_number;
	}
	
	public int getId() {
		return id;
	}
	
	public int getId_countries() {
		return id_countries;
	}
	
	public int getId_locality() {
		return id_locality;
	}
	
	public int getId_postoffice() {
		return id_postoffice;
	}
	
	public int getId_strets() {
		return id_strets;
	}
	
}
