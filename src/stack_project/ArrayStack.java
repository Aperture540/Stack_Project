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
    private ArrayList<N> data = new ArrayList<>();
    
    public void push(N item) {
        data.add(item);
    }
    
    public N pop() {
        if(data.size()!=0) {
        N lastItem = data.get(data.size()-1);
        data.remove(data.size()-1);
        return lastItem;
        }
        
        return null;
    }
}
