import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ellioe03 on 05/04/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class GapInPrimesTest {

    @Test
    public void shouldWorkForGapOfTwoLowNumbers() {
        assertEquals("[3, 5]", Arrays.toString(GapInPrimes.gap(2,3,50)));
    }

    @Test
    public void shouldWorkForGapOfTwoForNotFirstNumber() {
        assertEquals("[5, 7]", Arrays.toString(GapInPrimes.gap(2,4,50)));
    }

    @Test
    public void shouldWorkForAnyGapForNumber() {
        assertEquals("[7, 11]", Arrays.toString(GapInPrimes.gap(4,7,50)));
    }

    @Test
    public void shouldWorkForAnyGapForNotFirstNumber() {
        assertEquals("[7, 11]", Arrays.toString(GapInPrimes.gap(4,5,50)));
    }

    @Test
    public void shouldWorkForGapOfTwoBigNumbers() {
        assertEquals("[101, 103]", Arrays.toString(GapInPrimes.gap(2,100,110)));
    }

    @Test
    public void shouldWorkForGapOfTwoBigNumbersGapFour() {
        assertEquals("[103, 107]", Arrays.toString(GapInPrimes.gap(4,100,110)));
    }

    @Test
    public void shouldGiveNullWhereNoPairFound() {
        assertEquals(null, GapInPrimes.gap(6,100,110));
    }

    @Test
    public void shouldFindGapForAnyGap() {
        assertEquals("[359, 367]", Arrays.toString(GapInPrimes.gap(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(GapInPrimes.gap(10,300,400)));
    }


    @Test
    public void NextPrimeShouldWorkForLowPrimeNumbers() {
        assertEquals(5,GapInPrimes.nextPrimeNumberIncluding(4));
    }

    @Test
    public void NextPrimeShouldWorkForOneAndTwo() {
        assertEquals(1,GapInPrimes.nextPrimeNumberIncluding(1));
        assertEquals(2,GapInPrimes.nextPrimeNumberIncluding(2));
        assertEquals(3,GapInPrimes.nextPrimeNumberIncluding(3));
        assertEquals(5,GapInPrimes.nextPrimeNumberIncluding(5));



    }


}