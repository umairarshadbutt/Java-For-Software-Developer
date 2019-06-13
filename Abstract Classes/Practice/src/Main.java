public class Main {

    public static void main(String[] args) {
        MyLinkList list= new MyLinkList(null);
        list.traverse(list.getRoot());

        String strinData = "Create a string data array to avoid typing loads of addItem instructions";

        String[] data = strinData.split(" ");
        for(String s: data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
    }
}
