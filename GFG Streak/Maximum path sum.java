/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    int maxSum;  // global variable to track maximum path sum
    
    int findMaxSum(Node root) {
        maxSum = Integer.MIN_VALUE;
        helper(root);
        return maxSum;
    }
    
    int helper(Node node) {
        if (node == null) return 0;
        
        // ignore negative paths
        int left = Math.max(0, helper(node.left));
        int right = Math.max(0, helper(node.right));
        
        // compute maximum path sum passing through this node
        int currPathSum = node.data + left + right;
        
        // update global maximum
        maxSum = Math.max(maxSum, currPathSum);
        
        // return max one-side path sum
        return node.data + Math.max(left, right);
    }
}
