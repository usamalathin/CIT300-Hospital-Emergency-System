public class PatientBST {

    class Node {

        Patient patient;
        Node left;
        Node right;

        public Node(Patient patient) {
            this.patient = patient;
            left = null;
            right = null;
        }
    }

    Node root;

    public PatientBST() {
        root = null;
    }

    public void insert(Patient patient) {
        root = insertRecursive(root, patient);
    }

    private Node insertRecursive(Node root, Patient patient) {

        if (root == null) {
            return new Node(patient);
        }

        if (patient.patientId < root.patient.patientId) {
            root.left = insertRecursive(root.left, patient);
        }

        else if (patient.patientId > root.patient.patientId) {
            root.right = insertRecursive(root.right, patient);
        }

        return root;
    }
}