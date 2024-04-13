package SolidPrinciple;

public class Training extends Employee{
	
	private Boolean trained=false;
	private String trainedPlace;
	

	public Training(int employeeId, String employeeName2, Address address, Boolean trained, String trainedPlace) {
		super(employeeId, employeeName2, address);
		this.trained = trained;
		this.trainedPlace = trainedPlace;
	}

	public Boolean getTrained() {
		return trained;
	}

	public void setTrained(Boolean trained) {
		this.trained = trained;
	}

	public String getTrainedPlace() {
		return trainedPlace;
	}

	public void setTrainedPlace(String trainedPlace) {
		this.trainedPlace = trainedPlace;
	}

	

	
	@Override
	public void print()
	{
		System.out.println("Employee id : "+getEmployeeId()+"\nEmployee Name : "+getEmployeeName()+"\nTrained place : "+trainedPlace);
	}
	
	

}
