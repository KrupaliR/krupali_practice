/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgamemodified;

/** Model 
 * raw data defined
 * enum ? to avoid tight coupling
 * enum value and type safety
 * @author KrupaliBhatt
 * 
 * Question-4 : It is easy to reuse and extend because loose coupling do not depend on each other.
 * Question-5 : High cohesion.
 */
public class Card 
{
    public enum Color {RED,YELLOW,GREEN,BLUE};
    public enum Rank {ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAWTWO,DRAWFOUR,WILDCARD};
private Rank rank;
private Color color;
public Card(Color c,Rank r)
{
    this.color = c;
    this.rank =r;
}   
    /**
     * @return the value
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * @param rank the value to set
     */
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    /**
     * @return the suit
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the suit to set
     */
    public void setColor(Color color) {
        this.color = color;
    }


}

