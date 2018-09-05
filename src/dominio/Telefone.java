package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telefone implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String fone;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	@Override
	public String toString() {
		return "Telefone [id=" + id + ", fone=" + fone + "]";
	}
	
	
	public Telefone() {
		super();
	}
	
	
	
}
