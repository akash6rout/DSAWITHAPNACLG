package com.BinarySearchTree;

import java.util.ArrayList;

public class Main {
    public static class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode() {}

            TreeNode(int val) { this.val = val; }
            
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }

    public static class BstPair {
        int min;
        int max;
        boolean isBst;

        public BstPair(int min, int max, boolean isBst){
            this.min = min;
            this.max = max;
            this.isBst = isBst;
        }

        public BstPair(){};
    }

    public static BstPair isBST(TreeNode root){
        if(root==null){
            return new BstPair(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        }

        BstPair lst = isBST(root.left); // min, max, isBST
        BstPair rst = isBST(root.right);

        BstPair myAns = new BstPair();

        if(lst.isBst && rst.isBst && lst.max < root.val && rst.min > root.val){
            myAns.isBst = true;
        } else {
            myAns.isBst = false;
        }

        myAns.max = Math.max(root.val,Math.max(lst.max,rst.max));
        myAns.min = Math.min(root.val,Math.min(lst.min,rst.min));

        return myAns;
    }

    public static boolean isValidBST(TreeNode root) {
        BstPair ans = isBST(root);
        
        return ans.isBst;
    }


    public void getInorder(TreeNode root, ArrayList<Integer> inorder){
        if(root==null){
            return;
        }

        getInorder(root.left, inorder);
        //
        inorder.add(root.val);
        // right
        getInorder(root.right, inorder);
    }

    public boolean isValidBST2(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>();

        getInorder(root, inorder);

        // inorder list should be sorted
        for(int i=1; i<inorder.size(); i++){
            int previousValue = inorder.get(i-1);
            int currentValue = inorder.get(i);

            if(previousValue > currentValue){
                return false;
            }
        }

        return true;
    }

    TreeNode prev = null;
    boolean isBST = true;

    public void inorder(TreeNode root){
        if(root == null){
            return;
        }

        inorder(root.left);

        if(prev!=null){
            if(prev.val>=root.val){
                isBST = false;
            }
        }

        prev = root;
        inorder(root.right);
    }

    public boolean isValidBST3(TreeNode root) {
        inorder(root);
        return isBST;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(6);

        root.left = left;
        root.right = right;

        System.out.println(isValidBST(root));
    }
}
