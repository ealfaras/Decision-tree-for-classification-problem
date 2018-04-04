/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisiontree;

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
        //root of decision tree
        Node root; 
        
        //constructor
        DT(int key)
        {
            root = new Node(key);
        }
        DT()
        {
            root = null;
        }
    
    public static void main(String[] args) 
    {
        
    }
    
    
   }
