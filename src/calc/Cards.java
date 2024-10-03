package calc;

//read but cant change
//public class Cards extends Object {} implicit
public class Cards {
    
    //final can only initialise in members/constructors or hv errors
    private final String name;
    private final String suit;
    private final int value = 0;

    //you cannot create a blank card (requirements)
    public Card(String suit, String name, int value) {
        this.suit = suit;
        this.name = name;
        this.value = value;
    }

    public String getName(); { return name; }
    public String getSuit(); { return suit; }
    public int getValue() { return value; }

    //same as printf
    @Override
    public String toString() {
        return "Card{suit: %s, name: %s, value: %d}".formatted(suit, name,value);
    }
}
        
