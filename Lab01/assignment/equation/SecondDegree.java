package equation;

public class SecondDegree {
	private double a;
    private double b;
    private double c;

    public double getA() {
        return this.a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return this.b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return this.c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public String solve() {
    	String res = null;
    	double d = b*b - 4*a*c;
    	if ( d == 0 )
    		res = "Phuong trinh co nghiem kep x = " + Double.toString(-b/2/a);
    	else if ( d> 0 )
    		res = "Phuong trinh co hai nghiem phan biet (x1,x2) = (" +
    				Double.toString((-b + Math.sqrt(d))/2/a) + "," +
    				Double.toString((-b - Math.sqrt(d))/2/a) + ")";
    	else
    		res = "Phuong trinh vo nghiem";
    	return res;
    }
}
