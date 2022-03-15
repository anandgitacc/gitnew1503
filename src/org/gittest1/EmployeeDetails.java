package org.gittest1;

public class EmployeeDetails {
	
	private void empName() {
		System.out.println("Anand");
	}
	
	private void empMobile() {
		System.out.println("8939278836");
	}
	
	private void workingStatus() {
		
		System.out.println("Currently working");
	}
	
	private void empAdd() {
		
		System.out.println("OMR - Chennai");
	}
//<<<<<<< HEAD
	
//=======
	
//>>>>>>> 3dd327cde8e3077d7d807275504346bdaa735355
	
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		e.empMobile();
		e.empName();
	}

}
