import java.util.Stack;

public class TreatmentStack {

    Stack<Patient> treatmentStack;

    public TreatmentStack() {

        treatmentStack = new Stack<>();
    }

    public void pushTreatment(Patient patient) {

        treatmentStack.push(patient);

        System.out.println(
            patient.patientName +
            " treatment record added to stack."
        );
    }

    public void popTreatment() {

        if (treatmentStack.isEmpty()) {

            System.out.println("Treatment stack is empty. - TreatmentStack.java:26");
            return;
        }

        Patient patient = treatmentStack.pop();

        System.out.println(
            patient.patientName +
            " treatment record removed from stack."
        );
    }
}