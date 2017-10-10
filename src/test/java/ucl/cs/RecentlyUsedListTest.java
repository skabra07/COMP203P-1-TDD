package ucl.cs;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;


/**
 * Created by Suyash on 10-Oct-17.
 */
public class RecentlyUsedListTest {

    public RecentlyUsedList list = new RecentlyUsedList();

    @Test
    public void checkIfEmptyWhenInitialised(){
        assertThat(list.isEmpty(),is(true));
    }

    @Test
    public void checkIfAbleToAdd(){
        try{
            list.add("Hello");
            assertThat(list.isEmpty(),is(false));
        }
        catch (IllegalArgumentException iae){
            fail("String not added");
        }
    }

    @Test
    public void getItemFromList(){
        list.add("Hello");
        list.add("World");
        assertThat(list.get(),is("Hello"));

    }

    @Test
    public void checkIfFirstValueIsRecentlyAddedValue(){
        list.add("hello");
        assertThat(list.getFirstValue(),is("hello"));
    }

    @Test
    public void repeatedValuedAreMovedInsteadOfAdded(){
        list.add("hello");
        list.add("world");
        list.add("i am good");
        list.add("hello");
        assertThat(list.numberOfItems("hello"),is(1));
        assertThat(list.getFirstValue(),is("hello"));


    }
}
