package fallingmixer;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.Line;
import javax.sound.sampled.Mixer;

/**
 * Sound
 */
public class Sound {

  public static void main(String[] args) {
    DataLine.Info dlInfo = AudioSystem.getSourceLineInfo(Clip);
    System.out.println(dlInfo);

  }
}