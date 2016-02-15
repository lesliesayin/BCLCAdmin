package ph.edu.stpaul.domain;

import java.util.Date;

public class Registration {
	private String id;
	private String studentType;
	private String schoolYear;
	private final String studentId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date birthDate;
	private String gender;
	private String religion;
	private String birthPlace;
	private String address;
	private String fatherFirstName;
	private String fatherMiddleName;
	private String fatherLastName;
	private String fatherOccupation;
	private String fatherLandlineNumber;
	private String fatherMobileNumber;
	private String motherFirstName;
	private String motherMiddleName;
	private String motherLastName;
	private String motherOccupation;
	private String motherLandlineNumber;
	private String motherMobileNumber;
	private String level;
	private String cluster;
	private String adviser;
	private String schedule;
	private String startTime;
	private String endTime;
	
	public Registration(String studentNumber) {
		studentId = studentNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudentType() {
		return studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public String getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(String schoolYear) {
		this.schoolYear = schoolYear;
	}

	public String getStudentId() {
		String studentIdCopy = studentId;
		return studentIdCopy;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	public String getFatherFirstName() {
		return fatherFirstName;
	}

	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}

	public String getFatherMiddleName() {
		return fatherMiddleName;
	}

	public void setFatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
	}

	public String getFatherLastName() {
		return fatherLastName;
	}

	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	public String getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}

	public String getFatherLandlineNumber() {
		return fatherLandlineNumber;
	}

	public void setFatherLandlineNumber(String fatherLandlineNumber) {
		this.fatherLandlineNumber = fatherLandlineNumber;
	}

	public String getFatherMobileNumber() {
		return fatherMobileNumber;
	}

	public void setFatherMobileNumber(String fatherMobileNumber) {
		this.fatherMobileNumber = fatherMobileNumber;
	}

	public String getMotherFirstName() {
		return motherFirstName;
	}

	public void setMotherFirstName(String motherFirstName) {
		this.motherFirstName = motherFirstName;
	}

	public String getMotherMiddleName() {
		return motherMiddleName;
	}

	public void setMotherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
	}

	public String getMotherLastName() {
		return motherLastName;
	}

	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}

	public String getMotherOccupation() {
		return motherOccupation;
	}

	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}

	public String getMotherLandlineNumber() {
		return motherLandlineNumber;
	}

	public void setMotherLandlineNumber(String motherLandlineNumber) {
		this.motherLandlineNumber = motherLandlineNumber;
	}

	public String getMotherMobileNumber() {
		return motherMobileNumber;
	}

	public void setMotherMobileNumber(String motherMobileNumber) {
		this.motherMobileNumber = motherMobileNumber;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getCluster() {
		return cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
	}

	public String getAdviser() {
		return adviser;
	}

	public void setAdviser(String adviser) {
		this.adviser = adviser;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", studentType=" + studentType + ", schoolYear=" + schoolYear + ", studentId="
				+ studentId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", birthDate=" + birthDate + ", gender=" + gender + ", religion=" + religion + ", birthPlace="
				+ birthPlace + ", address=" + address + ", fatherFirstName=" + fatherFirstName + ", fatherMiddleName="
				+ fatherMiddleName + ", fatherLastName=" + fatherLastName + ", fatherOccupation=" + fatherOccupation
				+ ", fatherLandlineNumber=" + fatherLandlineNumber + ", fatherMobileNumber=" + fatherMobileNumber
				+ ", motherFirstName=" + motherFirstName + ", motherMiddleName=" + motherMiddleName
				+ ", motherLastName=" + motherLastName + ", motherOccupation=" + motherOccupation
				+ ", motherLandlineNumber=" + motherLandlineNumber + ", motherMobileNumber=" + motherMobileNumber
				+ ", level=" + level + ", cluster=" + cluster + ", adviser=" + adviser + ", schedule=" + schedule
				+ ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registration other = (Registration) obj;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}
}
