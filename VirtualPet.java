/* Virtual Pet, version 2
 *
 * @author Ratchet
 * @author ?
 */
public class VirtualPet {

  VirtualPetFace face;
  int hunger = 0; // how hungry the pet is.
  int tiredness = 0;

  // constructor
  public VirtualPet() {
    face = new VirtualPetFace();
    face.setImage("normal");
    face.setMessage("Hello.");
  }

  public void feed() {
    if (hunger > 10) {
      hunger = hunger - 10;
    } else {
      hunger = 0;
    }
    tiredness = tiredness + 22;
    if (tiredness > 15) {
      face.setMessage("I'm... too... sleepy...");
      sleep();
    } else {
      face.setMessage("Yum, thanks");
      face.setImage("normal");
    }
  }

  public void exercise() {
    hunger = hunger + 3;
    tiredness = tiredness + 15;
    if (tiredness > 15) {
      face.setMessage("I'm... too... sleepy...");
      feed();
    } else if (hunger > 12) {
      face.setMessage("urk, I'm too hungry!");
      face.setImage("dead");
    } else {
      face.setMessage("I'm tired.");
      face.setImage("tired");
    }
  }

  public void enraged(){
    tiredness = tiredness + 15;
    if (tiredness > 15){
      face.setMessage("I'm enraged!");
      face.setImage("enraged");
    }
  }

    public void sick(){
      face.setMessage("I'm very sick!");
      face.setImage("verysick");
  }

  public void workout(){
    face.setMessage("I'm working out!");
    face.setImage("exercizing");
  }

  public static void sleep (int wait)
{
	long timeToQuit = System.currentTimeMillis() + wait;
	while (System.currentTimeMillis() < timeToQuit);
}

  public void sleep() {
    hunger = hunger + 1;
    tiredness = 10;
    if (tiredness > 12) {
      face.setMessage("awww, I got too hungry!");
      face.setImage("dead");
    } else {
      face.setMessage("zzzzzzzzzz");
      face.setImage("asleep");
    }
  }


  public void coolDog(){
    face.setMessage("I'm cool!");
    face.setImage("dog");
  }
} // end Virtual Pet
