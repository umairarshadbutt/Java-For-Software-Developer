public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return null;
    }

    @Override
    ListItem setNext(ListItem item) {
        return null;
    }

    @Override
    ListItem previous() {
        return null;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        return null;
    }

    @Override
    int compareTo(ListItem item) {
        return 0;
    }
}
