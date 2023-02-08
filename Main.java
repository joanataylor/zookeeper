public class Main {
  public static void main(String[] args) {
    // create a Gorilla class to instantiate a gorilla
    Gorilla gorilla = new Gorilla();
    // create a Bat class to instantiate a gorilla
    Bat bat = new Bat();

    System.out.println("--------Gorilla-------");
    // have the gorilla throw three things
    gorilla.throwSomething();
    gorilla.throwSomething();
    gorilla.throwSomething();
    // have the gorilla eat bananas twice
    gorilla.eatBananas();
    gorilla.eatBananas();
    // have the gorilla climb once
    gorilla.climb();

    
    System.out.println("--------Bat-------");
    // have the bat attack three towns
    bat.attackTown();
    bat.attackTown();
    bat.attackTown();
    // have the bat eat two humans
    bat.eatHumans();
    bat.eatHumans();
    // have the bat fly twice
    bat.fly();
    bat.fly();
  }

}
