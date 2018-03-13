package pl.euler;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class CalculationsTest {

    @Test
    public void shouldReturnResultFor10(){
        //given
        Calculations calculator= new Calculations();
        //when
        int result= calculator.sumAllDivisibileBy3and5(10);
        //then
        Assert.assertThat(result, is(23));
    }

    @Test
    public void shouldReturnResultFor15(){
        //given
        Calculations calculator= new Calculations();
        //when
        int result= calculator.sumAllDivisibileBy3and5(15);
        //then
        Assert.assertThat(result, is(45));
    }

    @Test
    public void shouldReturnResultFor50(){
        //given
        Calculations calculator= new Calculations();
        //when
        int result= calculator.sumAllDivisibileBy3and5(50);
        //then
        Assert.assertThat(result, is(543));
    }

    @Test
    public void shouldReturnResultFor1000(){
        //given
        Calculations calculator= new Calculations();
        //when
        int result= calculator.sumAllDivisibileBy3and5(1000);
        //then
        Assert.assertThat(result, is(233168));
    }

}
