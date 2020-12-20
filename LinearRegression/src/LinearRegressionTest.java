import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinearRegressionTest {


    @Test
    void linearRegressionTest(){
        double[] xArray = {2.0,2.5,8.7,9.0,4.3,6.7,8.1,6.2,3.1};
        double[] yArray = {1.4,6.7,4.2,5.3,1.2,2.1,6.1,2.2,5.1};
        LinearRegression rg = new LinearRegression(xArray,yArray);
        assertEquals(rg.slope(),0.1519067717476562);
        assertEquals(rg.intercept(), 2.957057483285399);
        assertEquals(rg.R2(), 0.03838250749861567);
        assertFalse(rg.r2 > 0.1, "Solution unacceptable");
    }
}
