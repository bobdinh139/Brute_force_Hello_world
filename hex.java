import java.io.IOException;
import java.security.MessageDigest;

// hash file
class Hex {
  String hexade;
public String hex() throws Exception{
     String helloworld = "HELLO WORLD";
     MessageDigest mesd = MessageDigest.getInstance("SHA-256");
     mesd.update(helloworld.getBytes());
     byte byteData[] = mesd.digest();
     StringBuffer hexi = new StringBuffer();
     for (int i = 0; i < byteData.length; i++) {
     hexi.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
     }
     
     hexade = hexi.toString();
     return hexade;
 }
}
