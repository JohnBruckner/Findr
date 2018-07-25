package database.setup;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//    private String s_number;
	private Integer id;
	private String name;
	private String email;
//    private String p_hash;


//    public String getS_number() {
//            return s_number;
//        }
//
//    public void setS_number(String s_number) {
//        this.s_number = s_number;
//    }


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//    public String getP_hash() {
//        return p_hash;
//    }

//    public void setP_hash(String p_hash) {
//        this.p_hash = p_hash;
//    }
}
