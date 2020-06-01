public class BinaryTree {
    Node rootNode;
    // Methode für Node erstellen, eine Rekursiv Methode
    public Node addRecursive(Node current, int value){
        if(current==null){
            return new Node(value);
        }
        if(value<current.value){
            current.leftNode= addRecursive(current.leftNode,value);// es kann sein, da ist noch eine knot deshlab rufe ich wieder die Methode
        }else if(value>current.value){
            current.rightNode = addRecursive(current.rightNode,value);
        }else {
            return current;
        }
        return current;
    }
    public void add(int value){
        rootNode = addRecursive(rootNode,value);
    }
    // in Ordner Verfahren (durchsuchen im ordner)
    public void traversInOrder(Node node){
        if(node !=null){
            traversInOrder(node.leftNode);
            System.out.println("wert: "+ node.value);
            traversInOrder(node.rightNode);

        }
    }
    // suche im Baum
    public boolean containsNodeRecursive(Node current, int value){
        if(current== null){
            return false;
        }
        // gleichheit überprüfen
        if(current.value== value){
            System.out.println("wert gefunden");
            return true;
        }if(value < current.value){
        containsNodeRecursive(current.leftNode, value);
        }else {
            containsNodeRecursive(current.rightNode, value);
        }
        //System.out.println("wert Nicht gefunden");
        return false;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(100);
        tree.add(40);
        tree.add(30);
        tree.add(200);
        tree.add(300);
        tree.add(3);
        tree.add(34);
        tree.traversInOrder(tree.rootNode);
        System.out.println("⁄n");
        tree.containsNodeRecursive(tree.rootNode,898);
    }
}
