/*
 * SplayNode
 * 10 de Octubre del 2014
 * María Isabel Fernández 13024
 * Ana Bartra 13643
 * Andrés Lainfiesta 13072
 * Maria Gabriela López 13056
 */
 
    public class SplayNode
     {    
         SplayNode left, right, parent;
         int element;
         /** Constructor **/
         public SplayNode()
         {
             this(0, null, null, null);
         }          
         /** Constructor **/
         public SplayNode(int ele)
         {
             this(ele, null, null, null);
         } 
         /** Constructor **/
         public SplayNode(int ele, SplayNode left, SplayNode right, SplayNode parent)
         {
             this.left = left;
             this.right = right;
             this.parent = parent;
             this.element = ele;         
         }    
     }
