## Binary Search Tree Project
<details><summary>Turkish</summary>
  <p>
  <h1>Binary Search Nedir? </h1>
  Binary Search (İkili Arama) sıralanmış öğe listesinden bir öğeyi bulmak için etkili bir algoritmadır.  
  
  Olası konumları tek bir konumla daraltana kadar, öğeyi içerebilecek listenin yarısını tekrar tekrar bölerek çalışır.

  `Average case`; aradığımız sayının ortada olmasıdır.   
  `Worst case`; aradığımız sayının sonda olmasıdır.   
  `Best case`; aradığımız sayının dizinin en başında olmasıdır. 

  Kaynak : [Link](https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search)

  <h1>Binary Search Tree Nedir? </h1>
  İkili Arama Ağacı(Binary Search Tree), düğümlerden(Node) oluşan ve her bir düğümün en fazla 2 alt düğüme(Child node) sahip olduğu veri yapılarından bir tanesidir. Düğüm(Node), bir veri yapısının en temel birimidir. 
  
  Düğümler veriler içerebilirler ve aynı zamanda diğer düğümler ile aralarında bir bağlantı bulundurabilirler.

  - İkili Arama Ağacı'nda en üstte bulunan düğüm kök(Root) olarak adlandırılır.
  - Kökten küçük değere sahip olan düğümler kökün sol tarafında yer alır
  - Kökten büyük değere sahip olan düğümler kökün sağ tarafında yer alır.

### Java Kod Örneği
```Java
public class BinarySearchTree {

    public class Node {
        //instance variable of Node class
        public int data;
        public Node left;
        public Node right;

        //constructor
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // instance variable
    public Node root;

    // constructor for initialise the root to null BYDEFAULT
    public BinarySearchTree() {
        this.root = null;
    }

    // insert method to insert the new Data
    public void insert(int newData) {
        this.root = insert(root, newData);
    }

    public Node insert(Node root, int newData) {
        // Base Case: root is null or not
        if (root == null) {
            // Insert the new data, if root is null.
            root = new Node(newData);
            // return the current root to his sub tree
            return root;
        }
        // Here checking for root data is greater or equal to newData or not
        else if (root.data >= newData) {
            // if current root data is greater than the new data then now process the left sub-tree
            root.left = insert(root.left, newData);
        } else {
            // if current root data is less than the new data then now process the right sub-tree
            root.right = insert(root.right, newData);
        }
        return root;
    }

    // method for search the data , is data is present or not in the tree ?
    public boolean search(int data) {
        return search(this.root, data);
    }

    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return search(root.left, data);
        }
        return search(root.right, data);
    }

    //Traversal
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        // Creating the object of BinarySearchTree class
        BinarySearchTree bst = new BinarySearchTree();
        // call the method insert
        
        int[] arr = {8,5,9,3,7};
        for(int i = 0; i < arr.length; i++)
        {
            bst.insert(arr[i]);
            bst.preorder();
        }

        System.out.println(bst.search(7));
        
    }
}

```

  </p>


  # Görevler
  ## [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] 

  ### 1 - Yukarı verilen dizinin Binary-Search-Tree aşamalarını yazınız. 

                    7
                  /   \
                 5     8  
                / \      \
              1    6      9   
             / \
            0   3   
                / \
               2   4   

<img  src="https://github.com/aykutcihansevim/PatikaDev/blob/main/images/BinaryTree.png?raw=true">

### 2 - Big-O gösterimini yazınız. 
- Big-O Notation : `O(nlogn)`
- Time Complexity : `nlogn` 

</details>




                
