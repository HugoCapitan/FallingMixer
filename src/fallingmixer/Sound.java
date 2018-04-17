package fallingmixer;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Line;
import javax.sound.sampled.Mixer;

/**
 * Sound
 */
public class Sound {

  public static void main(String[] args) {
    Mixer.Info[] mixers = AudioSystem.getMixerInfo();

    System.out.println("Available Mixers in the System: ");
    System.out.println("");
    
    for (Mixer.Info mi : mixers) {
      System.out.println("");
      System.out.println("====== MIXER ======");
      System.out.println(
        "Name: " + mi.getName()
      + "\nVersion: " + mi.getVersion()
      + "\nVendor: " + mi.getVendor()
      + "\nDescription: " + mi.getDescription()
       );

      Mixer mixer = AudioSystem.getMixer(mi);
      Line.Info lif = mixer.getLineInfo();

      System.out.println(lif);
    }
  }
}