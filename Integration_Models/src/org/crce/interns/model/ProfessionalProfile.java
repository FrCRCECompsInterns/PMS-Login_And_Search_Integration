package org.crce.interns.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professional_profile", catalog = "user_schema")
public class ProfessionalProfile {
	@Id
	@Column(name = "username")
	private String userName;
	@Column(name = "branch")
	private String branch;
	@Column(name = "status")
	private String status;
	@Column(name = "field_of_interest")
	private String fieldOfInterest;
	@Column(name = "achievements")
	private String acheivements;
	@Column(name = "projects")
	private String projects;
	@Column(name = "internships")
	private String internships;
	@Column(name = "co_curricular_activities")
	private String coCurricularActivities;
	@Column(name = "extra_curricular_activities")
	private String extraCurricularActivities;
	@Column(name = "created_date")
	private Date createdDate;
	@Column(name = "created_by")
	private String createsBy;
	@Column(name = "modified_date")
	private Date modifiedDate;
	@Column(name = "modified_by")
	private String modifiedBy;
	@Column(name = "year")
	private String year;
	@Column(name = "work_experience")
	private String workExperience;
	@Column(name = "degree_percentage")
	private String degreePercentage;
	@Column(name = "degree_kts")
	private String degreeKts;
	@Column(name = "degree_drops")
	private String degreeDrops;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFieldOfInterest() {
		return fieldOfInterest;
	}
	public void setFieldOfInterest(String fieldOfInterest) {
		this.fieldOfInterest = fieldOfInterest;
	}
	public String getAcheivements() {
		return acheivements;
	}
	public void setAcheivements(String acheivements) {
		this.acheivements = acheivements;
	}
	public String getProjects() {
		return projects;
	}
	public void setProjects(String projects) {
		this.projects = projects;
	}
	public String getInternships() {
		return internships;
	}
	public void setInternships(String internships) {
		this.internships = internships;
	}
	public String getCoCurricularActivities() {
		return coCurricularActivities;
	}
	public void setCoCurricularActivities(String coCurricularActivities) {
		this.coCurricularActivities = coCurricularActivities;
	}
	public String getExtraCurricularActivities() {
		return extraCurricularActivities;
	}
	public void setExtraCurricularActivities(String extraCurricularActivities) {
		this.extraCurricularActivities = extraCurricularActivities;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatesBy() {
		return createsBy;
	}
	public void setCreatesBy(String createsBy) {
		this.createsBy = createsBy;
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}
	public String getDegreePercentage() {
		return degreePercentage;
	}
	public void setDegreePercentage(String degreePercentage) {
		this.degreePercentage = degreePercentage;
	}
	public String getDegreeKts() {
		return degreeKts;
	}
	public void setDegreeKts(String degreeKts) {
		this.degreeKts = degreeKts;
	}
	public String getDegreeDrops() {
		return degreeDrops;
	}
	public void setDegreeDrops(String degreeDrops) {
		this.degreeDrops = degreeDrops;
	}
}
