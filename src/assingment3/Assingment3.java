/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment3;

/**
 *
 * @author walte
 */
public class Assingment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MeldableHeap mh = new MeldableHeap();
       for(int i = 0 ; i < 6 ; i++){
           mh.add(i);
       }
       mh.remove(1);
       mh.displayHeap();
       
    }
    
}
