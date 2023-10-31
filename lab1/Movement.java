package lab1;

interface Movement {
     default void move() {
         System.out.println("Walk");
     }
}
