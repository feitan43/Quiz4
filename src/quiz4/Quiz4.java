/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz4;

import java.util.Scanner;
import singlylinkedlist.SNode;

/**
 *
 * @author Administrator
 */
public class Quiz4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        SNode<String> node1 = new SNode("The", null);
        SNode<String> node2 = new SNode("weather", null);
        SNode<String> node3 = new SNode("is", null);
        SNode<String> node4 = new SNode("good", null);

        LinkedSentence<SNode> sentence = new LinkedSentence<>();
        sentence.push(node4);
        sentence.push(node3);
        sentence.push(node2);
        sentence.push(node1);
        
        
        Scanner x = new Scanner(System.in);
        sentence.showStack();
        
        char i;
        do{
        System.out.println("\nUndo Y/N");
        String undo = x.nextLine();
        i = undo.charAt(0);
        
        if (i == 'Y' || i == 'y'){
            sentence.pop();
            sentence.showStack();
        }
        if (i == 'N' || i == 'n'){
            sentence.showStack();
            
        }
    }while(!sentence.isEmpty());
}
          
}
 
    