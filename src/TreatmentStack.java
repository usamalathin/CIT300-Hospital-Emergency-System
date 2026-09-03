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
}