/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_project;

import java.util.ArrayList;

/**
 *
 * @author agendron
 */
public class Stack_Project {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
