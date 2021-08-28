
/*
class Node
{
    int data;
    Node left, right;
    
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree
{
    //Function to return the maximum difference between any 
    //node and its ancestor.
    int max = Integer.MIN_VALUE;
    int maxDiff(Node root)
    {
        find(root);
        return max;
    }
    public int find(Node root)
    {
        //base case
        
        if(root == null)return Integer.MAX_VALUE;
        if(root.left == null && root.right == null)return root.data;
        
        int val = Math.min(find(root.left), find(root.right));
        
        max = Math.max(max, root.data  - val);
        
        return Math.min(val, root.data);
    }
}