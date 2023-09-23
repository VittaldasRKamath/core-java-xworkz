class PatientExecutor{
	public static void main(String[] pat){
		
	Patient patient=new Patient();
	patient.setPatientId(457);
	patient.setPatientName("Vittaldas R Kamath");
	patient.setDiseases("Job Fever");
	patient.setDocName("Lalu Prasad");
	
		
	Hospital hospital=new Hospital();
	hospital.patient=patient;
	hospital.hospitalName="Kamath Hospital";
	System.out.println("------------------------------------------------------------------------");							
	System.out.println("Hospital Name : "+hospital.hospitalName);
	System.out.println("Patient Id : "+hospital.patient.getPatientId());
	System.out.println("Patient Name : "+hospital.patient.getPatientName());
	System.out.println("Diseases : "+hospital.patient.getDiseases());
	System.out.println("Doctor name : "+hospital.patient.getDocName());
	System.out.println("------------------------------------------------------------------------");							
	}
}
