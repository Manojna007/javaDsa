package binaryTrees;

import java.util.Scanner;

public class creation {
    Scanner sc;
    Node root;
    public void binaryTree(){
        sc=new Scanner(System.in);
    }

    Node create(){
        System.out.println("enter node data");
        int data=sc.nextInt();
        if(data==-1) return null;
        Node node=new Node(data);
        System.out.println("enter "+ data + "left data");
        node.left=create();
        System.out.println("enter "+ data + "right data");
        node.right=create();

        return node;


    }
    void inorderTraversal(Node root){
        if(root==null) return;


    }
}
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}
