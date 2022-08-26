package binarySearchTree;

public class search {
    static boolean isPresent(Node root,int key){
        if(root==null) return false;
        System.out.println(root.data);
        if(root.data==key) return true;

        if(key>root.data){
            return isPresent(root.right,key);
        }
        return isPresent(root.left,key);
    }
    static boolean isPresentIterative(Node root,int key){
        Node cur=root;
        while(cur!=null){
            if(cur.data==key) return true;
            if(key>cur.data) cur=cur.right;
            else cur=cur.left;
        }
        return  false;
    }
    public static void main(String[] args){

    }
}
