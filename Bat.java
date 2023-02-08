//create a bat class that extends from Mammal

public class Bat extends Mammal {
  public Bat() {
    super();
    // create a default energy level of 300
    energyLevel = 300;
  }

  // Create a fly() method
  public void fly() {
    // print sound of bat taking off
    System.out.println("flying away");
    // decrease energy by 50
    energyLevel -= 50;
    displayEnergy();
  }

  // Create a eatHumans() method
  public void eatHumans() {
    System.out.println("**burp** yummy");
    // increase energy by 25
    energyLevel += 25;
    displayEnergy();
  }

  // Create a attackTown() method
  public void attackTown() {
    // print the sound of a town on fire
    System.out.println("AHHHH help! The town is on fire!");
    // decrease its energy by 100
    energyLevel -= 100;
    displayEnergy();
  }
}