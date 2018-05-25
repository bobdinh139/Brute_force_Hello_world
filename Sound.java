import java.io.*;
import javax.sound.sampled.*;


//sound
public class Sound  {

  public Sound() {
    
      try {
           
          File soundFile = new File("DLMB.wav"); 
          AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);              
 
         Clip clip = AudioSystem.getClip();
       
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      new Sound();
   }
}
