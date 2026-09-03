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
}