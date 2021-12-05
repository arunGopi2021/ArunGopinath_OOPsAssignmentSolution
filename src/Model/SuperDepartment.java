package Model;

public abstract class SuperDepartment {
    /*
        This will be the parent class
    */

    // Instance variables
    String departmentName;
    String todaysWork;
    String workDeadline;
    String todayAHoliday;

    //Constructor
    SuperDepartment(){
        this.departmentName = "Super Department";
        this.todaysWork = "No work as of now";
        this.workDeadline = "Nil";
        this.todayAHoliday = "Today is not a holiday";
    }

    

    //Getter Methods - Instance methods
    public String getDepartmentName() {
        return this.departmentName;
    }

    public String getTodaysWork() {
        return this.todaysWork;
    }

    public String getWorkDeadline() {
        return this.workDeadline;
    }

    public String isTodayAHoliday() {
        return this.todayAHoliday;
    }


    // This displays information contained in the object
    public void display(){
        System.out.println("\nWelcome to "+this.getDepartmentName());
        System.out.println(this.getTodaysWork());
        System.out.println(this.getWorkDeadline());
        System.out.println(this.isTodayAHoliday());
    }
    
}
