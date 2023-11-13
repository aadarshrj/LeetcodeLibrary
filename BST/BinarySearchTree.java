package BST;

public class BinarySearchTree {
    public Node root = null;
    
    class Node{
        Node leftChild;
        int data;
        Node rightChild;
        public Node(){}
        public Node(Node leftChild, int data, Node rightChild) {
            this.leftChild = leftChild;
            this.data = data;
            this.rightChild = rightChild;
        }
    }
    Node search(Node root , int key){
        if (root == null){
            return null;
        }
        if (root.data == key){
            return root;
        }else if (root.data < key){
            search(root.rightChild , key);
        }else{
            search(root.leftChild , key);
        }
        return null;
    }
    void insert(int key){
        Node temp = root;
        Node p ,q = null;

        if(root == null){
            p = new Node(null,key,null);
            root = p;
            return;
        }
        while (temp != null){
            q = temp;
            if(key < temp.data){
                temp = temp.leftChild;
            }else if(key > temp.data){
                temp = temp.rightChild;
            }else{
                return;
            }
        }
        p = new Node(null,key,null);
        if (key < q.data){
            q.leftChild = p;
        }else{
            q.rightChild = p;
        }
    }
    void inorderTraversal(Node head){
        if (head != null){
            inorderTraversal(head.leftChild);
            System.out.println(head.data);
            inorderTraversal(head.rightChild);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(123);
        bst.insert(91);
        bst.insert(0);

        bst.inorderTraversal(bst.root);
    }
}
