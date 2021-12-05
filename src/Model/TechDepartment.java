package Model;

public class TechDepartment extends SuperDepartment{
    /*
        This class extends the SuperDepartment class.

    */

    // Instance method
    String stackInformation;

    // Constructor
    public TechDepartment(){
        super();
        this.departmentName = "Tech Department";        
        this.stackInformation = "Core Java";
    }

    //Setters
    
    public void setTodaysWork(){
        this.todaysWork = "Complete coding of Module 1.";
    }
    public void setWorkDeadline(){
        this.workDeadline = "Complete by end of day.";
    }


    // getter method
    public String getStackInformation() {
        return this.stackInformation;
    }


    //This method displays the information contained in the object
    public void display(){
        super.display();
        System.out.println("Stack Details: "+this.getStackInformation());
    }
}
