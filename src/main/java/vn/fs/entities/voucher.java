package vn.fs.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor 
@NoArgsConstructor
@Entity
@Table(name = "voucher")
public class voucher implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int count;
	private double discount;
	private int type;
	private Date startDate;
	private Date endDate;
	private Date createDate;
	private boolean status;
	@Override
	public String toString() {
		return "voucher [id=" + id + ", name=" + name + ", count=" + count + ", discount=" + discount + ", type=" + type
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", createDate=" + createDate + ", status="
				+ status + "]";
	}
	
}
