package org.crce.interns.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails", catalog="user_schema")
@SuppressWarnings("serial")
public class UserDetails implements Serializable{
	@Id
	@Column(name = "username" )
	String userName;
	@Column(name = "user_password" )
	String userPassword;
	@Column(name = "account_active" )
	String accountActive;
	@Column(name = "current_state" )
	String currentState;
	@Column(name = "last_login" )
	Date lastLogin;
	@Column(name = "role_id" )
	String roleId;
	@Column(name = "created_by" )
	String createdBy;
	@Column(name = "created_date" )
	Date createdDate;
	@Column(name = "modified_by" )
	String modifiedBy;
	@Column(name = "modified_date" )
	Date modifiedDate;
	
	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassWord() {
		return userPassword;
	}

	public void setUserPassWord(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getAccountActive() {
		return accountActive;
	}

	public void setAccountActive(String accountActive) {
		this.accountActive = accountActive;
	}
	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}

}
