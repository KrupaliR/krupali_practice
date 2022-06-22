/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgamemodified;

/**
 * High cohesion 
 * to generate card 52 ,store in array
 * @author KrupaliBhatt
 */
public class GenerateCards 
{
    int size=60;
    Card[] deck = new Card[size];
    public void generate()
    {
        int counter=0;
        // enum hearts , values 4*12=52
        for(Card.Color c:Card.Color.values() ) //hearts
        {
            for( Card.Rank  r : Card.Rank.values())//ace
            {
            deck[counter] = new Card(c,r);
            counter++;
            }
    }
}
}
