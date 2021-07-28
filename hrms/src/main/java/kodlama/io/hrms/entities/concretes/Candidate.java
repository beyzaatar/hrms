package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="candidates")
@Data
public class Candidate {

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="nationality_id")
	private String nationality_id;
	
	@Column(name="birth_year")
	private int birth_year;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
}
