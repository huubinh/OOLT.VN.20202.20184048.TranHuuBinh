package equation;

public class FirstDegree {
	private double a;
    private double b;

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
    public String solve() {
    	String res = null;
        if ( a == 0 && b == 0)
        	res = "Phuong trinh co vo so nghiem.";
        else if ( a == 0 && b != 0 )
        	res = "Phuong trinh vo nghiem.";
        else
        	res = "Phuong trinh co nghiem duy nhat x = " + Double.toString(-b/a);
    return res;
    }
}
