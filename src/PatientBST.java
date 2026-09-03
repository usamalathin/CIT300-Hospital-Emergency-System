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

    public Patient search(int patientId) {
        return searchRecursive(root, patientId);
    }

    private Patient searchRecursive(Node root, int patientId) {

        if (root == null) {
            return null;
        }

        if (root.patient.patientId == patientId) {
            return root.patient;
        }

        if (patientId < root.patient.patientId) {
            return searchRecursive(root.left, patientId);
        }

        return searchRecursive(root.right, patientId);
    }

    public void delete(int patientId) {
        root = deleteRecursive(root, patientId);
    }

    private Node deleteRecursive(Node root, int patientId) {

        if (root == null) {
            return null;
        }

        if (patientId < root.patient.patientId) {
            root.left = deleteRecursive(root.left, patientId);
        }

        else if (patientId > root.patient.patientId) {
            root.right = deleteRecursive(root.right, patientId);
        }

        else {

            if (root.left == null) {
                return root.right;
            }

            else if (root.right == null) {
                return root.left;
            }

            root.patient = findMin(root.right);

            root.right = deleteRecursive(root.right, root.patient.patientId);
        }

        return root;
    }

    private Patient findMin(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root.patient;
    }

}