package AppMain;

import Model.AdminDepartment;
import Model.HrDepartment;
import Model.TechDepartment;

public class Driver {

    // Start of the program
    public static void main(String[] args) {

        //Instantiating Admin Object and setting information
        AdminDepartment adminObj = new AdminDepartment();        
        adminObj.setTodaysWork();
        adminObj.setWorkDeadline();
        // Display information in the admin object
        adminObj.display();


        // Instantiating HR object and setting information
        HrDepartment hrObj = new HrDepartment();        
        hrObj.setTodaysWork();
        hrObj.setWorkDeadline();
        // Display information in the HR object
         hrObj.display();


        // Instantiating Tech object and setting information
        TechDepartment techObj = new TechDepartment();
        techObj.setTodaysWork();
        techObj.setWorkDeadline();
        // Display information in the Tech Object
        techObj.display();
        
    }
    
}
