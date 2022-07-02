package superDepartment;

public class AdminDepartment extends SuperDepartment{
	
	public String department() {
		String name = "Admin Department";
		return name;
	}
	
	public String getTodaysWork() {
		String work = "Complete your documents Submission";
		return work;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
}
