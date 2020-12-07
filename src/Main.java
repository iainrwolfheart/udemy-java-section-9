public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "London Bristol Cardiff Brighton Swindon";

        String[] places = stringData.split(" ");

        for (String place : places) {
            list.addItem(new Node(place));
        }

        list.traverse(list.getRoot());

    }
}
