/* 
You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.

 Example 1:
Input: root = [4,2,7,1,3], val = 5
Output: [4,2,7,1,3,5]

*/


class Solution {
    public TreeNode insertIntoBST(TreeNode root, int key) {
       
        TreeNode parent =null,cur=root;
        while(cur!=null){
            if(key>cur.val){
                parent=cur;
            cur=cur.right;
            }
            
        else if(key<cur.val){
            parent=cur;
            cur=cur.left;
        }
    }
    TreeNode newNode = new TreeNode(key);
    if(parent==null) return newNode;
    
    if(key>parent.val){
        parent.right=newNode;
    }
    else if(key<parent.val){
        parent.left=newNode;
    }
    return root;
        
    }
}
