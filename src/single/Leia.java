package single;

public class Leia {
   private Leia() {
    }
  //  private static Leia leia ;// this is Lazy way
    private static Leia leia = new Leia() ; // this is Eager way

   /*public static Leia getInstance() {

       if (leia == null) {
           leia = new Leia() ;
       }


       return leia;
   }*/
    public static Leia getInstance(){
        return leia ;
    }



}
