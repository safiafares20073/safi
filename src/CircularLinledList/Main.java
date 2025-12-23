package CircularLinledList;

public class Main {

    public static void main(String[] args) {
        circularlinkedlist<String> list=new circularlinkedlist<String>();
        circularlinkedlist<Integer> list2=new circularlinkedlist<Integer>();
        list.addFirst("Jawaher");
        list.addFirst("Safia");
        list.addLast("Manal");
        list.addLast("Ali");
        list.addFirst("Asala");
        list.removeFirst();
        list.removeLast();
        list.display();




    }
}
