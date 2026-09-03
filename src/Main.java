public class Main {

    public static void main(String[] args) {

        Patient p1 = new Patient(
                101,
                "Usama",
                22,
                "0771234567",
                "Fever");

        Patient p2 = new Patient(
                102,
                "Ali",
                25,
                "0772345678",
                "Injury");

        Patient p3 = new Patient(
                103,
                "Sara",
                30,
                "0773456789",
                "Headache");

        PatientBST bst = new PatientBST();

        bst.insert(p1);
        bst.insert(p2);
        bst.insert(p3);

        System.out.println("BST Patient Records - Main.java:32");

        bst.displayPatients();

        EmergencyQueue queue = new EmergencyQueue();

        queue.enqueuePatient(p1);
        queue.enqueuePatient(p2);
        queue.enqueuePatient(p3);

        queue.displayQueue();

        queue.dequeuePatient();

        queue.displayQueue();

        TreatmentStack stack = new TreatmentStack();

        stack.pushTreatment(p1);
        stack.pushTreatment(p2);
        stack.pushTreatment(p3);

        stack.displayStack();

        stack.popTreatment();

        stack.displayStack();

        VisitLinkedList visits = new VisitLinkedList();

        visits.addVisit(
                1,
                "2026-09-03",
                "Dr Silva",
                "Fever",
                "Medicine");

        visits.addVisit(
                2,
                "2026-09-04",
                "Dr Perera",
                "Injury",
                "Treatment");

        visits.displayVisits();

        visits.searchVisit(1);

        visits.removeVisit(1);

        visits.displayVisits();
    }
}