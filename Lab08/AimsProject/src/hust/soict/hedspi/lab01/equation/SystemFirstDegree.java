package hust.soict.hedspi.lab01.equation;

public class SystemFirstDegree {
	private double a11;
    private double a12;
    private double b1;
    private double a21;
    private double a22;
    private double b2;
    
    public double getA11() {
        return this.a11;
    }
    public void setA11(double a11) {
        this.a11 = a11;
    }
    public double getA12() {
        return this.a12;
    }
    public void setA12(double a12) {
        this.a12 = a12;
    }
    public double getB1() {
        return this.b1;
    }
    public void setB1(double b1) {
        this.b1 = b1;
    }
    public double getA21() {
        return this.a21;
    }
    public void setA21(double a21) {
        this.a21 = a21;
    }
    public double getA22() {
        return this.a22;
    }
    public void setA22(double a22) {
        this.a22 = a22;
    }
    public double getB2() {
        return this.b2;
    }
    public void setB2(double b2) {
        this.b2 = b2;
    }
    
    public String solve() {
    	String res = null;
    	double d = a11*a22 - a21*a12;
    	double d1 = b1*a22 - b2*a12;
    	double d2 = a11*b2 - a21*b1;
    	if ( d != 0 )
    		res = "He phuong trinh co nghiem duy nhat (x1,x2) = (" +
    				Double.toString(d1/d) + "," + Double.toString(d2/d) + ")";
    	else if ( d == 0 && d1 == 0 && d2 == 0 )
    		res = "He phuong trinh co vo so nghiem";
    	else
    		res = "He phuong trinh vo nghiem";
    	return res;
    }
}
