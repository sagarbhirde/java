package entity;

public class Department {
	
	int departmentId;
	
	String departmentName;
	
	String location;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName  + "]";
	}

	/**
	 * @return the departmentId
	 */
	public synchronized int getDepartmentId() {
		return departmentId;
	}

	public Department(int departmentId, String departmentName, String location) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.location = location;
	}

	/**
	 * @param departmentId the departmentId to set
	 */
	public synchronized void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * @return the departmentName
	 */
	public synchronized String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public synchronized void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the location
	 */
	public synchronized String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public synchronized void setLocation(String location) {
		this.location = location;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department department=new Department(32, "Computer", "Pune ");
	
		System.out.println(department);

	}

}
