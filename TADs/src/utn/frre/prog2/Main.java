package utn.frre.prog2;

public class Main {
    
    public static void main(String[] args) {

        MyBinaryTree<Integer> tree = new MyBinaryTree<>(new BinaryNode(23));
        tree.add(4);
        tree.add(8);
        tree.add(12);
        //tree.printInOrder();
        tree.printInWidth();

        /*
        IMyCollections<Integer> list = new MyList();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(10);

        list.remove();

        System.out.println(list.toString());

        for (Integer v : list) {
            System.out.println(v.toString());
        }

        MyGrafo<Integer> grafo = new MyGrafo('a', 'b', 'c');
        grafo.conectar(2, 3, 50);
        grafo.printMatriz();
        */
    }
}
