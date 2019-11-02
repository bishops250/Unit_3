public class TrickyDice  {

 public static int regularRoll() {
     double roll_chance =(int) ((Math.random()*6)+1);

     if (roll_chance==1) {
         System.out.println(1);
     }
     else if (roll_chance==2) {
         System.out.println(2);
     }

     else if (roll_chance==3) {
         System.out.println(3);
     }

     else if (roll_chance==4){
         System.out.println(4);
     }

     else if (roll_chance==5){
         System.out.println(5);

     }

     else
         System.out.println(6);

     return 0;
 }

    public static int trickyRoll() {

     double trickRoll_chance = (Math.random()*100)+1;

     if (trickRoll_chance<=24) {
         System.out.println("1");

     }

     else if (trickRoll_chance>24 && trickRoll_chance <60) {
         System.out.println("2");

     }

     else if (trickRoll_chance>60 && trickRoll_chance <=70) {
         System.out.println("3");

     }

     else if (trickRoll_chance>70 && trickRoll_chance <=75) {
         System.out.println("4");

     }

     else if (trickRoll_chance>75 && trickRoll_chance <=82) {
         System.out.println("5");

     }
     else if (trickRoll_chance>82 && trickRoll_chance <=100) {

         System.out.println("6");
     }


        return 0;
    }

    public static void main(String[]args) {

     regularRoll();
     trickyRoll();
        
    }

}
