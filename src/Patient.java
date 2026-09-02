public class Patient {

    int patientId;
    String patientName;
    int age;
    String contactNumber;
    String medicalCondition;

    public Patient(int patientId, String patientName, int age,
                   String contactNumber, String medicalCondition) {

        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.contactNumber = contactNumber;
        this.medicalCondition = medicalCondition;
    }

    public void displayPatient() {

        System.out.println("Patient ID       : - Patient.java:21" + patientId);
        System.out.println("Patient Name     : - Patient.java:22" + patientName);
        System.out.println("Age              : - Patient.java:23" + age);
        System.out.println("Contact Number   : - Patient.java:24" + contactNumber);
        System.out.println("Medical Condition: - Patient.java:25" + medicalCondition);
        System.out.println("");

    }
}