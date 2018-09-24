package kali.tech.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class Brand extends BaseEntity{
@Column
private String name;
@Column
private Date established;
@Column
private String country;
@Column
private boolean status;
@Column
private String description;

public void setName(String brandname) {
	name=brandname;
}
public String getName() {
	return name;
}
public void setEstablished(Date brandestablished) {
	established=brandestablished;
}
public Date getEstablished() {
	return established;
}

public void setCountry(String brandcountry) {
	country=brandcountry;
}
public String getCountry() {
	return country;
}
public void setStatus(boolean companystatus) {
	status=companystatus;
}
public boolean getStatus() {
return status;
}
public void setDescription(String branddescripton) {
	description=branddescripton;
}
public String getDescription() {
	return description;
}
}
