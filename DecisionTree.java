/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisiontree;

/**
 *
 * @author Liz
 */
public class DecisionTree {

    /**
     * @param args the command line arguments
     */
    class Node
    {
        int key;
        Node left, middle, right;
    
        public Node (int item)
        {
            key = item;
            left = middle = right = null;
        } 
    }
    class DT
    {
        Node root; 
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
}
