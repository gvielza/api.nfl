package apinfl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "players")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String passYds;
	private String ydsAtt;
	private String Att;
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
	public String getPassYds() {
		return passYds;
	}
	public void setPassYds(String passYds) {
		this.passYds = passYds;
	}
	public String getYdsAtt() {
		return ydsAtt;
	}
	public void setYdsAtt(String ydsAtt) {
		this.ydsAtt = ydsAtt;
	}
	public String getAtt() {
		return Att;
	}
	public void setAtt(String att) {
		Att = att;
	}
	public Player(Integer id, String name, String passYds, String ydsAtt, String att) {
		super();
		this.id = id;
		this.name = name;
		this.passYds = passYds;
		this.ydsAtt = ydsAtt;
		Att = att;
	}

}
