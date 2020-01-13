package com.ravi.cal.RaviCalculator;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {


    @Test
    public void threeMinusTwoIsOne() throws Exception {
        final long result = new Calculator().subFucn(2, 3);
        assertThat(result, is(1L));
    }

    @Test
    public void threeAndTwoIsFive() throws Exception {
        final long result = new Calculator().addFucn(2, 3);
        assertThat(result, is(1L));
    }

    
      
}

