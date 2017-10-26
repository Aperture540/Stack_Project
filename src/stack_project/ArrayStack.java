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
public class ArrayStack <N> {
    private int top;
    private ArrayList<N> data = new ArrayList<>();
    
    /*public ArrayStack() {

    }*/
    
    public void push(N item) {
        data.add(top, item);
        top++;
    }
    
    public N pop() {
        return data.get(--top);
    }
}
