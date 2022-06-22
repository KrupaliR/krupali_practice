/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgamemodified;

/**
 * print 52 cards
 * @author KrupaliBhatt
 */
public class CardGameModified {

    
    public static void main(String[] args)
    {
        GenerateCards gc = new GenerateCards();
        gc.generate(); //delegation satisfied
        for( Card cd:gc.deck)
        {
            System.out.println(cd.getColor()+" "+cd.getRank());
        }
    }
    
}
