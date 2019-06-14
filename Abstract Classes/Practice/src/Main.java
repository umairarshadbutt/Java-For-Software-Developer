public class Main {

    public static void main(String[] args) {
        MyLinkList list= new MyLinkList(null);
        list.traverse(list.getRoot());

        String strinData = "4 5 8 7 9 6 2 8 4 6 3 7   1 5 6 8 7 7";

        String[] data = strinData.split(" ");
        for(String s: data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());


        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("9"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("8"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("6"));
        list.traverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
    }
}
