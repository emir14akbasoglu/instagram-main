package entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="wattasap")
public class wattasap {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="surname")
	private String surname;
	@Column(name="photograph")
	private String photograph;
	@Column(name="phone number")
	private String phonenumber;
	public wattasap() {
		super();
	}
	public wattasap(int id, String name, String surname, String photograph, String phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.photograph = photograph;
		this.phonenumber = phonenumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPhotograph() {
		return photograph;
	}
	public void setPhotograph(String photograph) {
		this.photograph = photograph;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


}
