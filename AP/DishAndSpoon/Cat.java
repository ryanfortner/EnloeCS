public class Cat implements Comparable<Cat> {
    private String name;
    private String song;
    // status is how important the cat is
    // in the hierarchy of cats
    private int status;
    private static int songCount;
    
    //default constructor
    public Cat (){
        song = "";
        name = "";
        status = 0;
    }
    
    // specific constructor
    public Cat (String name, String song, int status){
        this.name = name;
        this.song = song;
        this.status = status;
    }
    
    // setter
    public void setName(String name){
        this.name = name;
    }
    
    public void setSong(String song){
        this.song = song;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    public int getStatus() {
        return status;
    }
    
    public void playFiddle(){
        songCount ++;
        //print out cat's name and song
        System.out.println(name + " played " + song);
    }
    
    // two cats are equal if their status is equal
    public int compareTo(Cat a){
        if (this.getStatus() > a.getStatus()) {
            return 1;
        } else if (this.getStatus() < a.getStatus()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    // comparing the status variable.
    public boolean equals(Cat a){
        return (this.getStatus() == a.getStatus());
    }
    
    public static int getCount(){
        return songCount;
    }
    
    public String toString (){
        return name + ", " + song + ", " + status;
    }
}
