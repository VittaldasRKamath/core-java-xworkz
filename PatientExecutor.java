class PatientExecutor{
	public static void main(String patientDetails[]){
		Patient patient=new Patient();
		patient.setPatientId(179);
		patient.setName("Vittaldas R Kamath");
		patient.setNurseName("Nivi S");
		patient.setage(21);
		patient.setDiseaseName("Love Disease");
		patient.setWardNo(478);
		patient.setAdmittedDate("08/04/2023");
		patient.setHospitalName("Nuthan Life care");
		patient.setPatientAddress("Adgur");
		patient.setGender("Male");
		patient.setConsultantDoctor("Prakruthi K S");
		
		
		System.out.println("Patient Id : "+patient.getPatientId());
		System.out.println("Patient Name : "+patient.getName());
		System.out.println("Nurse Name : "+patient.getNurseName());
		System.out.println("Patient age : "+patient.getAge());
		System.out.println("Patient disease  : "+patient.getDiseaseName());
		System.out.println("Patient Ward No : "+patient.getWardNo());
		System.out.println("Patient Admitted Date : "+patient.getAdmittedDate());
		System.out.println("Patient Hospital Name : "+patient.getHospitalName());
		System.out.println("Patient Address : "+patient.getPatientAddress());
		System.out.println("Patient Gender : "+patient.getGender());
		System.out.println("Consultant Doctor : "+patient.getConsultantDoctor());
	}
}