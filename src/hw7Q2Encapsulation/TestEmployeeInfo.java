package hw7Q2Encapsulation;

public class TestEmployeeInfo {
	
	
		public static void main(String[] args) {
			
				Employee employee = new Employee();
				employee.setEmpName("Mashrufa");
				employee.setAge(45);
				employee.setSex('F');
				employee.setUsCitizen(true);
			
			System.out.println("\n New Employee name : " + employee.getEmpName() + "\n New Employee age :" + employee.getAge()+"\n new employee sex:"+employee.getSex()+ "\n is Us citizen:"+ employee.isUsCitizen() );
	}

}