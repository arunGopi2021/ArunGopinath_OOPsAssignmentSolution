package Model;

public class HrDepartment extends SuperDepartment{
    /*
        This class extends the SuperDepartment class.

    */

    // instance method
    String activity;

    // Constructor
    public HrDepartment(){
        super();
        this.departmentName = "HR Department";
        this.activity = "Team Lunch";
    }

    //Setters methods - Instance methods
    
    public void setTodaysWork(){
        this.todaysWork = "Fill today's timesheet and mark your attendance.";
    }
    public void setWorkDeadline(){
        this.workDeadline = "Complete by end of day.";
    }

    //Getter method
    public String getActivity(){
        return this.activity;
    }

    //This method displays the information contained in the object
    public void display(){
        super.display();
        System.out.println("Today's Activity: "+this.getActivity());
    }
}
