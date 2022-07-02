import superDepartment.AdminDepartment;
import superDepartment.HrDepartment;
import superDepartment.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		AdminDepartment admin = new AdminDepartment();
		
		System.out.println("Welcome to " + admin.department());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println("\n");
		
		System.out.println("Welcome to " + hr.department());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("\n");
		
		System.out.println("Welcome to " + tech.department());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}

}
