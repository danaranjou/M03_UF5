package model;

import main.Logable;

public class Employee extends Person implements Logable {
	private int employeeId;
	private boolean logged = false;

	public Employee(int employeeId, boolean logged) {
		super();
		this.employeeId = employeeId;
		this.logged = logged;

	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	final static int USER = 123;
	final static String PASSWORD = "test";

	public boolean isLogged() {
		return logged;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public static int getUSER() {
		return USER;
	}

	public static String getPASSWORD() {
		return PASSWORD;
	}

	@Override
	public boolean logEmployee(int user, String pass) {
		if (user == getUSER() && pass.equalsIgnoreCase(getPASSWORD())) {
			return true;
		} else {
			return false;
		}
	}

}
