package Model;

public class AdminDepartment extends SuperDepartment{
    /*
        This class extends the SuperDepartment class.

    */

    // Constrcutor
    public AdminDepartment(){
        super();
        this.departmentName = "Admin Department";        
    }

    //Setters
    
    public void setTodaysWork(){
        this.todaysWork = "Complete your documents submission.";
    }
    public void setWorkDeadline(){
        this.workDeadline = "Complete by end of day.";
    }

}
