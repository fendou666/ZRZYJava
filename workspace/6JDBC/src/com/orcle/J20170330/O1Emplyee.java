package com.orcle.J20170330;

public class O1Emplyee {
	private int employeeId;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String hireDate;
	private String jobId;
	private double salary;
	private double commissionPCT;
	private int managerId;
	private int departmentId;
	
	
	
	public O1Emplyee() {
		
	}

	public O1Emplyee(int employeeId, String lastName, String email,
			String phoneNumber, String hireDate, String jobId, double salary,
			double commissionPCT, int managerId, int departmentId) {
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.commissionPCT = commissionPCT;
		this.managerId = managerId;
		this.departmentId = departmentId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommissionPCT() {
		return commissionPCT;
	}

	public void setCommissionPCT(double commissionPCT) {
		this.commissionPCT = commissionPCT;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return employeeId + "\t" + lastName
				+ "\t" + email + "\t" + phoneNumber
				+ "\t" + hireDate + "\t" + jobId + "\t"
				+ salary + "\t" + commissionPCT + "\t"
				+ managerId + "\t" + departmentId;
	}
	
	
	
	
	
}
