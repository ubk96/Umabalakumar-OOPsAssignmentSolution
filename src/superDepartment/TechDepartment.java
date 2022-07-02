package superDepartment;

public class TechDepartment extends SuperDepartment{
	
	public String department() {
		String name = "Tech Department";
		return name;
	}
	
	public String getTodaysWork() {
		String work = "Complete coding of module 1";
		return work;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
	public String getTechStackInformation() {
		String activity = "Core Java";
		return activity;
	}
}
