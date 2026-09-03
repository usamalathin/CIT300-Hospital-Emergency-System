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
}