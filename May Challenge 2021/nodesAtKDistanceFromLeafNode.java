
// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
    //Function to return count of nodes at a given distance from leaf nodes.
    int count = 0;
    int printKDistantfromLeaf(Node root, int k)
    {
        find(root,new int[1000],new boolean[1000] ,0, k);
        return count;
    }
    public void find(Node root,int path[],boolean[] vis,int currLen, int k)
    {
        //base case
        if(root == null)
        {
            return;
        }
        
        path[currLen] = root.data;
        vis[currLen] =false;
        currLen++;
        
        if(root.left == null && root.right == null 
        && currLen- k -1>= 0 && vis[currLen-k-1] != true)
        {
            vis[currLen - k -1]= true;
            count++;
            return;
        }
        
        find(root.left, path, vis, currLen, k);
        find(root.right, path, vis, currLen, k);
        
        
    }

}
