
import java.lang.Math;
public class GradientDescent {
    double previousStep = 0;


    public void gradientApproach(float stepSize, double initialX) {
        //int wOneInit,wOneNew,wOneOld = 0;
        double precision = 0.00001;
        double stepCoefficient = stepSize;
        double currentX;
        double previousX = initialX;
        double previousY = changePositionBy(previousX,stepCoefficient,precision);
        currentX = stepCoefficient * previousY;
        int iter = 100;

        while (previousStep > precision && iter > 0) {
            iter--;
            double currentY = changePositionBy(currentX,stepCoefficient,precision);
            if (currentY > previousY) {
                stepCoefficient = -stepCoefficient/2;
            }
            previousX = currentX;
            currentX += stepCoefficient * previousY;
            previousY = currentY;
            previousStep = StrictMath.abs(currentX - previousX);
        }
    }

    public double changePositionBy(double prevX, double stepSize, double precision) {
        //mutlak
        double prevXsqrt = prevX*prevX;
        double prevXnormal = Math.sqrt(prevXsqrt);
        if(stepSize < precision ) {
        prevXnormal = prevXnormal+stepSize;
        }
        else if( stepSize > precision) {
            prevXnormal = prevXnormal-stepSize;
        }
        return prevXnormal;

    }







    public double[] takeDerivative(double[] coefficents) {

        double[] derivative = new double[coefficents.length - 1];
        for (int i = 0; i < derivative.length; i++) {
            derivative[i] = coefficents[i] * (coefficents.length - 1 - i);
        }
        return derivative;

    }
    double cosinusEq (double x) {
        return Math.cos(x);
    }
    public double integralF(double a, double b,int n){

        int i,z;
        double h,s;

        n=n+n;
        s = cosinusEq(a)*cosinusEq(b);
        h = (b-a)/n;
        z = 4;

        for(i = 1; i<n; i++){
            s = s + z * cosinusEq(a+i*h);
            z = 6 - z;
        }
        return (s * h)/3;
    }
}


