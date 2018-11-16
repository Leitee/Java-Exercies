package utn.frre.prog2;

public class MyBinaryTree<T>{
    private BinaryNode<T> root;

    public MyBinaryTree(BinaryNode root) {
        this.root = root;
    }

    public boolean isEmtpy() {
        return this.root == null;
    }

    public void add(T element) {
        this.root = addRecursively(this.root, element);
    }

    public void remove(T element) {
        this.root = removeRecursively(this.root, element);
    }

    public void printPreOrder() {
        preOrder(this.root);
    }

    public void printInOrder() {
        inOrder(this.root);
    }

    public void printPostOrder() {
        posOrder(this.root);
    }

    public void printInWidth () {
        inWidth(this.root);
    }


    private void preOrder(BinaryNode node) {

        if (node == null)
            return;

        System.out.println(node.Value);

        preOrder(node.LeftChild);
        preOrder(node.RightChild);
    }

    private void inOrder(BinaryNode node) {

        if (node == null)
            return;

        inOrder(node.LeftChild);
        System.out.println(node.Value);
        inOrder(node.RightChild);
    }

    private void posOrder(BinaryNode node) {

        if (node == null)
            return;

        posOrder(node.LeftChild);
        posOrder(node.RightChild);
        System.out.println(node.Value);
    }

    private void inWidth(BinaryNode<T> node) {
        MyBinaryQueue<BinaryNode> queue = new MyBinaryQueue();
        queue.add(node);

        while (!queue.isEmpty())
        {
            BinaryNode aux = queue.remove();
            System.out.print(aux.Value + " ");

            /*Enqueue left child */
            if (aux.LeftChild != null) {
                queue.add(aux.LeftChild);
            }

            /*Enqueue right child */
            if (aux.RightChild != null) {
                queue.add(aux.RightChild);
            }
        }
    }

    private int compareTo(BinaryNode<T> node, T element) {
        return node.Value.toString().compareTo(element.toString());
    }

    private BinaryNode<T> addRecursively(BinaryNode<T> node, T value) {
        if (node == null) {
            node = new BinaryNode(value);
            return node;
        }

        if (this.compareTo(node, value) <= 0) {
            node.LeftChild = addRecursively(node.LeftChild, value);
        }
        else if (this.compareTo(node, value) > 0) {
            node.RightChild = addRecursively(node.RightChild, value);
        }
        return node;
    }

    private BinaryNode<T> removeRecursively(BinaryNode<T> node, T value) {

        BinaryNode<T> temp = node;

        if (temp == null) {
            return temp;
        }

        if(this.compareTo(temp, value) < 0) {
            temp.LeftChild = removeRecursively(temp.LeftChild, value);
        }
        else if(this.compareTo(temp, value) > 0){
            temp.RightChild = removeRecursively(temp.RightChild, value);
        }
        else {
            if(temp.LeftChild == null && temp.RightChild == null){
                temp = null;
            }
            else if(temp.RightChild == null){
                temp = temp.LeftChild;
            }
            else if(temp.LeftChild == null){
                temp = temp.RightChild;
            }
            else {
                BinaryNode<T> tempLeftLeaf  = findNodeIntoLeftSide(temp.RightChild);
                temp.Value = tempLeftLeaf.Value;
                temp.RightChild = removeRecursively(temp.RightChild, tempLeftLeaf.Value);
            }
        }
        return temp;
    }

    private BinaryNode<T> findNodeIntoLeftSide(BinaryNode<T> node) {
        BinaryNode<T> temp = node;
        while(temp.LeftChild != null){
            temp = temp.LeftChild;
        }
        return temp;
    }
}