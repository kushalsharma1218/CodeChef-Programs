/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/


class Tree
{
    //Function to count number of subtrees having sum equal to given sum.
    int count = 0;
    int countSubtreesWithSumX(Node root, int X)
    {
	    find(root,X);
	    return count;
    }
    public int find(Node root, int x)
    {
        //base case
        if(root == null)return 0;
        
        
        // subtree sum for any node in the tree
        int sum = find(root.left, x) +find(root.right, x) + root.data;
        
        if(sum == x)count++;
        
        return sum;
    }
}
