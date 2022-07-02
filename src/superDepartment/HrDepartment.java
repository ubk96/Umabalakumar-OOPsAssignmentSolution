package superDepartment;

public class HrDepartment extends SuperDepartment{
	
	public String department() {
		String name = "Admin Department";
		return name;
	}
	
	public String getTodaysWork() {
		String work = "Fill today’s timesheet and mark your attendance";
		return work;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
	public String doActivity() {
		String activity = "team Lunch";
		return activity;
	}
}
