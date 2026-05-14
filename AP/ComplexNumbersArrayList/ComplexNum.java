public class ComplexNum implements Comparable<ComplexNum>{
	private double real; // real part
	private double imag; //imaginary part
	private double r;
	private double theta;
	
	//default constructor.
	//set real = imag = 0;
	public ComplexNum()
	{
		imag = 0;
		real = 0;
		
		polarize();
	}
	
	//specific constructor
	//use this. keyword to set private variables
	//set r and theta by using polarize method
	public ComplexNum(double real, double imag)
	{
		this.real = real;
		this.imag = imag;
	
	    polarize();
	}
	
	// return the real part
	public double getReal(){
		return real;
	}
	
	// return the imaginary part
	public double getImag(){
		return imag;
	}
	
	// return r, the magnitude
	public double getR() {
	    return r;
	}
	
	// return theta
	public double getTheta() {
	    return theta;
	}
	
	//add a complex number to this
	//complex number. return a ComplexNum
	public ComplexNum plus(ComplexNum a)
	{	
	    return new ComplexNum(
	        getReal() + a.getReal(),
	        getImag() + a.getImag()
	    );
	}
	
	//subtract the passed object from the calling object
	// return a complex number.
	public ComplexNum minus(ComplexNum a)
	{
		return new ComplexNum(
		    getReal() - a.getReal(),
		    getImag() - a.getImag()
		);
	}
	
	// multiply the passed object by the calling object
	// return an object that is a complex number
	public ComplexNum times (ComplexNum a)
	{
	    // FOIL method
		return new ComplexNum(
		    (getReal() * a.getReal()) - (getImag() * a.getImag()),
		    (getImag() * a.getReal()) + (getReal() * a.getImag())
		);
	}
	
	// return the complex conjugate of the object
	// return an object that is a complex number
	public ComplexNum conjugate()
	{
        return new ComplexNum(
            getReal(),
            -getImag()
        );
	}
	
	// return the rationalized version of this 
	// complex number.
	// 1/(a+bi) where a+bi is the current object
	public ComplexNum rationalize()
	{
	    ComplexNum numerator = this.conjugate();
	    ComplexNum denominator = this.times(numerator);
	    return new ComplexNum(
	        numerator.getReal() / denominator.getReal(),
	        numerator.getImag() / denominator.getReal()
	    );
	}
	
	// calculate r and theta given a and b
	public void polarize()
	{
		r = Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
		theta = Math.atan(imag / real);
		
// 		System.out.println("The polarized coordinates are:");
// 		System.out.printf("\tradius = %.2f\n\ttheta = %f\n", r, theta);
	}
	
	/*used to see if two complex numbers are equal
	 * Two complex numbers are equal if their magnitudes are equal. 
	 * To see if two doubles are equal we are going to check the
	 * absolute value of the difference which should be less than .01.
     * Write .equals first and use that for compareTo.
     */
	public boolean equals (ComplexNum second){
	    return (Math.abs(getR() - second.getR()) < 0.01);
	}
	
	// <0 if less, 0 if equal, >0 if greater
	@Override
	public int compareTo(ComplexNum second){
		if (this.equals(second)) {
		    return 0;
		} else if (getR() < second.getR()) {
            return -1;
		} else {
		    return 1;
		}
	}
	
	// write code here to return a string
	// in the form a + bi
	public String toString(){
	    return String.format("%.2f + %.2fi", real, imag);
	}
}
