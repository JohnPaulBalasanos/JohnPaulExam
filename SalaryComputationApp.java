import java.util.Scanner;
class SalaryComputationApp
{
	static void calculate(double annual_salary, double tax_excess, double min_income, double fix_tax_deduction){
		double calcu;
		System.out.printf("Your Annual Salary: %.2f \n",annual_salary);
		calcu=annual_salary/12;
		System.out.printf("Your Monthly rate: %.2f",calcu);
		calcu=calcu/22;
		System.out.printf("\nYour Daily Rate: %.2f",calcu);
		calcu=calcu/8;
		System.out.printf("\nYour Hourly Rate: %.2f",calcu);
		calcu=annual_salary-fix_tax_deduction;
		calcu=calcu-min_income;
		calcu=fix_tax_deduction+(tax_excess*calcu);
		System.out.printf("\nYour Annual Tax Deduction: %.2f",calcu);
		calcu=calcu/12;
		System.out.printf("\nYour Monthly Tax Deduction: %.2f",calcu);
		calcu=(annual_salary/12)-calcu;
			System.out.printf("\nNet Pay: %.2f",calcu);

		
	}
	
	
	public static void main(String[] args)	
	{
	  double annual_salary,min_income,monthly=12,days=22,hours=8,tax_excess=0,fixed_tax_deduction=0;
	 Scanner input = new Scanner(System.in);
	  System.out.println("Enter Annual Salary:");
	  annual_salary = input.nextDouble();
      if(250000>=annual_salary){
      	tax_excess=0;
      	min_income=0;
      }else if(annual_salary>250000 && annual_salary<=400000){
      	tax_excess=.20;
      	min_income=250000;
      	fixed_tax_deduction=0;
      	}
      else if(400000<
    		  annual_salary && annual_salary<=800000 ){
      	tax_excess=.25;
      	min_income=400000;
      	fixed_tax_deduction=30000;
      	}
      else if(annual_salary>800000 && annual_salary<=2000000){
      	tax_excess = .30;
      	min_income=800000;
      	fixed_tax_deduction=130000;
      	}
      else if(annual_salary>2000000 && annual_salary<=8000000){
      	tax_excess = .32;
      	min_income=2000000;
      	fixed_tax_deduction=490000;
      	}
      	else{
      		tax_excess=.35;
      		min_income=8000000;
      		fixed_tax_deduction=2410000;
      	}
      calculate(annual_salary,tax_excess,min_income,fixed_tax_deduction);
  }

	
}