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

    public void dequeuePatient() {

        if (emergencyQueue.isEmpty()) {

            System.out.println("Emergency queue is empty. - EmergencyQueue.java:25");
            return;
        }

        Patient treatedPatient = emergencyQueue.poll();

        System.out.println(
            treatedPatient.patientName +
            " removed from emergency queue."
        );
    }

    public void displayQueue() {

        if (emergencyQueue.isEmpty()) {

            System.out.println("Emergency queue is empty. - EmergencyQueue.java:41");
            return;
        }

        System.out.println("Emergency Queue: - EmergencyQueue.java:45");

        for (Patient patient : emergencyQueue) {

            System.out.println(
                patient.patientId + " - " +
                patient.patientName
            );
        }
    }
}