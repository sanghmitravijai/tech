package kali.tech.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BaseEntity {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
long id;
@Column
private String createdBy;
@Column
private String updatedBy;
@Column
private Date createdOn;
@Column
private Date updatedOn;

public void setId(long userid) {
	id=userid;
}
public long getId() {
	return id;
}

public void setCreatedBy(String username) {
	createdBy=username;
}
public String getCreatedBy() {
return createdBy;
}

public void setUpdatedBy(String update) {
	updatedBy=update;
}
public String getUpdatedBy() {
	return updatedBy;
}

public  void setCreatedOn(Date date) {
	createdOn=date;
}
public Date getCreatedOn() {
	return createdOn;
}

public void setUpdatedOn(Date modify) {
	updatedOn=modify;
}
public Date getUpdatedOn() {
	return updatedOn;
}

}
