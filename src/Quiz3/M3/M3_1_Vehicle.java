package Quiz3.M3;

public class M3_1_Vehicle {
   private String brend;
   private int speed;

   public M3_1_Vehicle(String brend, int speed) {
      this.brend = brend;
      this.speed = speed;
   }

   public void displayInfo(){
      System.out.println("Brend: " + brend + "\nSpeed: " + speed);
   }


}
