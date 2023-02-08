//Create a class Gorilla that extends from Mammal

public class Gorilla extends Mammal {
  public Gorilla() {
    super();
  }

  // Create a throwSomething() method
  public void throwSomething() {
    // print a message indicating the gorilla has thrown something
    System.out.println("The gorilla has thrown something");
    // decrease energy level by 5
    energyLevel -= 5;
    displayEnergy();
  }

  // Create a eatBananas() method
  public void eatBananas() {
    // print a message indicating the gorillas satisfaction
    System.out.println("The gorilla ate a banana and is satisfied");
    // increase energy level by 10
    energyLevel += 10;
    displayEnergy();
  }

  // Create a climb() method
  public void climb() {
    // print a message indicating the gorilla has climbed a tree
    System.out.println("The gorilla has climbed a tree");
    // decrease energy level by 10
    energyLevel -= 10;
    displayEnergy();
  }
}