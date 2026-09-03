import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    Queue<Patient> emergencyQueue;

    public EmergencyQueue() {
        emergencyQueue = new LinkedList<>();
    }

    public void enqueuePatient(Patient patient) {

        emergencyQueue.add(patient);

        System.out.println(
            patient.patientName + " added to emergency queue."
        );
    }
}