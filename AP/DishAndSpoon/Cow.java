public class Cow implements Comparable <Cow>{
    private String name;
    private int jumpHeight;
    private int jumpCount;
    
    //default constructor
    public Cow (){
        name = "";
        jumpHeight = 0;
    }
    
    // specific constructor
    public Cow (String name, int jumpHeight){
        this.name = name;
        this.jumpHeight = jumpHeight;
    }
    
    // setter
    public void setName(String name){
        this.name = name;
    }
    
    public void setHeight(int height){
        this.jumpHeight = height;
    }
    
    public int getJumpHeight() {
        return jumpHeight;
    }
    
    public void jumpTheMoon(){
        jumpCount++;
        //print out how high the cow jumped
        System.out.println(name + " jumped " + jumpHeight + " meters");
    }
    
    // two cows are equal if their height is equal
    public int compareTo(Cow a){
        if (this.getJumpHeight() > a.getJumpHeight()) {
            return 1;
        } else if (this.getJumpHeight() < a.getJumpHeight()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    // comparing the height variable.
    public boolean equals(Cow a){
        return (a.getJumpHeight() == this.getJumpHeight());
    }
    
    public int getCount(){
        return jumpCount;
    }
    public String toString (){
        return name + ", " + jumpHeight + ", " + jumpCount;
    }
}
