package com.dal.Controller;
import com.dal.Model.SalaryModel;
public class SalaryController {
   SalaryModel sm = new SalaryModel();
   
   public void SetBasic(double Sal) {
	   sm.setBasic(Sal);
   }
   
   public void CalculateSal() {
	   System.out.println("Controller CalculateSal");
	   sm.CalCulateSalary();
   }
   public void ViewSalary() {
	   System.out.println("Basic :" +sm.getBasic());
	   System.out.println("HRA :" + sm.getHRA());
	   System.out.println("DA :"+sm.getDA());
	   System.out.println("TA :"+sm.getTA());
	   double Gross = sm.getBasic() + sm.getHRA() + sm.getDA() + sm.getTA();
	   System.out.println("Gross :"+ Gross);
   }

}
