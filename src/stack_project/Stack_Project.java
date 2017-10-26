/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_project;

/**
 *
 * @author agendron
 */
public class Stack_Project {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*class myStack{
            private ArrayList myList 
                    
            public boolean push()
        }*/
        ArrayStack stack = new ArrayStack();
        stack.push("One");
        stack.push(2);
        stack.push(3.0);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    
}
