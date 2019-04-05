/**
  Represent a date
 */
public class Date{
    private int y,m,d;


    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

    public int compareTo(Object otherObj) {
      Date otherDate = (Date)otherObj;
      int myDays = y * 365 + m * 30 + d;
      int objDays = otherDate.y * 365 + otherDate.m * 30 + otherDate.d;
      return Integer.compare(myDays, objDays);      
    }

}
