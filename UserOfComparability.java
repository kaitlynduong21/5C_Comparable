/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // Point vs. its reflection about y = x
        reportRelationship( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");

        System.out.println( System.lineSeparator()
                          + "Date comparisons");

        // Date vs. itself
        Date d0 = new Date( 2019, 4, 4);
        reportRelationship( "Date vs. itself", d0, d0, "0");

        // Date vs. same date
        reportRelationship( "Date vs. same date", d0, new Date( 2019, 4, 4), "0");

        // Date vs. earlier date
        reportRelationship( "Date vs. earlier date", d0, new Date( 2019, 2, 4), "positive int");

        // Date vs. later date
        reportRelationship( "Date vs. later date", d0, new Date( 2019, 5, 4), "negative int");


        System.out.println( System.lineSeparator()
                          + "IncomparableDog comparisons");

        // IncomparableDog vs. itself
        IncomparableDog d = new IncomparableDog();
        //reportRelationship( "IncomparableDog vs. itself", d, d, "0");

        /* error message:
        UserOfComparability.java:48: error: incompatible types: IncomparableDog cannot be converted to Point
        reportRelationship( "IncomparableDog vs. itself", d, d, "0");
                                                          ^
        Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
        */

        System.out.println( System.lineSeparator()
                          + "Point and Date comparisons");

        // Point vs. Date
        //reportRelationship( "Point vs. Date", d0, p0, "0");

        /* error message:
        UserOfComparability.java:61: error: incompatible types: Date cannot be converted to Point
        reportRelationship( "Point vs. Date", d0, p0, "0");
                                              ^
        Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
        */

    }


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship
      ( String description
      , Comparable a
      , Comparable b
      , String expect
      ) {
        System.out.println( description);

        // check
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning:
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */

          + " ...expecting " + expect
          + System.lineSeparator());
     }
}
