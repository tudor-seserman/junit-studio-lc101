package test;
import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }

    @Test
    public void bracketsInWrongOrderReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyOneBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[[[["));
    }

    @Test
    public void onlyOneBracket2(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]]]]]]"));
    }

    @Test
    public void nestedBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }

    @Test
    public void falseStartBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]]]]]]]][]"));
    }

    @Test
    public void falseStartBracketsReturnsFalse2(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[[[[]"));
    }

    @Test
    public void falseEndBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][[[[[["));
    }

    @Test
    public void falseEndBrackets2(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]]]]]]]"));
    }

    @Test
    public void withCharactersBracketsRight(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]38250250-"));
    }

    @Test
    public void withCharactersBracketsMiddle(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[38250250-]"));
    }

    @Test
    public void withCharactersBracketsLeft(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("38250250-[]"));
    }

    @Test
    public void withMultipleBracketsTrue(){assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][][][]"));}


}
