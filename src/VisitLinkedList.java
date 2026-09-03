public class VisitLinkedList {

    class VisitNode {

        int visitId;
        String visitDate;
        String doctorName;
        String diagnosis;
        String treatment;

        VisitNode next;

        public VisitNode(
                int visitId,
                String visitDate,
                String doctorName,
                String diagnosis,
                String treatment) {

            this.visitId = visitId;
            this.visitDate = visitDate;
            this.doctorName = doctorName;
            this.diagnosis = diagnosis;
            this.treatment = treatment;
            this.next = null;
        }
    }

    VisitNode head = null;

    public void addVisit(
            int visitId,
            String visitDate,
            String doctorName,
            String diagnosis,
            String treatment) {

        VisitNode newNode = new VisitNode(
                visitId,
                visitDate,
                doctorName,
                diagnosis,
                treatment);

        if (head == null) {

            head = newNode;
            return;
        }

        VisitNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void searchVisit(int visitId) {

        VisitNode temp = head;

        while (temp != null) {

            if (temp.visitId == visitId) {

                System.out.println("Visit Found - VisitLinkedList.java:68");
                System.out.println("Visit ID: - VisitLinkedList.java:69" + temp.visitId);
                System.out.println("Date: - VisitLinkedList.java:70" + temp.visitDate);
                System.out.println("Doctor: - VisitLinkedList.java:71" + temp.doctorName);
                System.out.println("Diagnosis: - VisitLinkedList.java:72" + temp.diagnosis);
                System.out.println("Treatment: - VisitLinkedList.java:73" + temp.treatment);

                return;
            }

            temp = temp.next;
        }

        System.out.println("Visit not found. - VisitLinkedList.java:81");
    }
    
}