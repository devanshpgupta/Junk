package com.demo.model;
import javax.persistence.*;

@Entity
@Table(name="eval")
public class eval {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
private int id;

@Column(name="emails")
private String emails;

public eval()
{
	
}

public eval(String emails) {
	super();
	this.emails = emails;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmails() {
	return emails;
}

public void setEmails(String emails) {
	this.emails = emails;
}
	
}
