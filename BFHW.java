import javax.swing.*; 
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.io.IOException;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import java.security.MessageDigest;
import java.io.File;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.sound.sampled.*;
import java.util.ArrayList;

public class BFHW extends JPanel  {
  public JFrame frame;
public static void main(String[] args) throws Exception 
{
 new Sound();
 new BFHW().run();

}
final long startTime=System.nanoTime();
public void run() throws Exception{
 frame=new JFrame("Brute forcing HELLO WORLD");
 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
 frame.setSize(screenSize.width - 300, screenSize.height - 70);
 frame.getContentPane().add(new FinalPr());
 frame.setVisible(true);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
loadingscreen();
 counting();
}

 String typing ="BLANK? \n No \nInspirited by Alex (He said what about writting \"hello world\") \n This is Brute force Hello world \n This is one method of \"Hacking\" and Machine learning\nOf course this program is only for education purpose\n Enough, the program starts now!";
 char output;
 int x = 280;
 int y = 60;
 
 int x1 = 815;int y1 = 115;  int x2 =280 ; int y2 = 115;int x3 = 815; int y3 = 60; 
 boolean up = false;
 boolean down = true;
 boolean left = false;
 boolean right = true;
 
  boolean up1 = true;
 boolean down1 = false;
 boolean left1 = true;
 boolean right1 = false;
 
   boolean up2 = false;
 boolean down2 = false;
 boolean left2 = true;
 boolean right2 = true;
 
    boolean up3 = true;
 boolean down3 = true;
 boolean left3 = false;
 boolean right3 = false;
 
 BufferedImage img;
 String imgnameH="";
  String imgnameE="";
   String imgnameL="";
    String imgnameL1="";
     String imgnameO="";
      String imgnameW="";
       String imgnameO1="";
        String imgnameR="";
         String imgnameL2="";
          String imgnameD="";
  ArrayList temp1 = new ArrayList();
 ArrayList temp2 = new ArrayList();
 ArrayList temp3 = new ArrayList();
 ArrayList temp4 = new ArrayList();
 ArrayList temp5 = new ArrayList();
 ArrayList temp6 = new ArrayList();
 ArrayList temp7 = new ArrayList();
 ArrayList temp8 = new ArrayList();
 ArrayList temp9 = new ArrayList();
 ArrayList temp10 = new ArrayList();
 ArrayList temp11 = new ArrayList();
boolean print=false;
 String firstchar;
 String firstword;
 String secondword;
 String thirdword;
 String fourthword;
 String fifthword;
 String sixthword;
 String sevenword;
 String eightword;
 String nineword;
 String tenword;
 String elevenword;
 long difference;
  long difference1;
 long end;
 int t=0;
 int b=0;
 
 
 //print, machine learning
public void paint(Graphics g) 
  {
  if (b==0){
   typewitter(g);
   
  }
  if (t==0){
  timer(g);
  }
  rangen();
   if (firstword==null) {
  
   for (int e=0; e <temp1.size();e++)
   {
     if (temp1.get(e).equals(firstchar))
        print=false; else print=true;
   }
    temp1.add(firstchar);
   if (print){
       g.drawString(""+firstchar, 300, 200);
   }
  if (firstchar.equals("H")) {firstword=firstchar;imgnameH="H.png";}
  }
   rangen();
   if (secondword==null) {
      
   for (int e=0; e <temp2.size();e++)
   {
     if (temp2.get(e).equals(firstchar))
     print = false;
     else print=true;
   }
   temp2.add(firstchar);
   if (print){
     g.drawString(""+firstchar, 350, 200);
   }
  if (firstchar.equals("E")) {secondword=firstchar;imgnameE="E.png";}
   }
   rangen();
   if (thirdword==null) {
    
   for (int e=0; e <temp3.size();e++)
   {
     if (temp3.get(e).equals(firstchar))
     print=false;
     else print=true;
   }
     temp3.add(firstchar);
   if (print){
    g.drawString(""+firstchar, 400, 200);
   }
  if (firstchar.equals("L")) {thirdword=firstchar;imgnameL="L.png";}
   }
   rangen();
   if (fourthword==null) {
     
   for (int e=0; e <temp4.size();e++)
   {
     if (temp4.get(e).equals(firstchar))
 print = false; else print=true;
   }
    temp4.add(firstchar);
   if (print){
      g.drawString(""+firstchar, 450, 200);
   }
  if (firstchar.equals("L")) {fourthword=firstchar;imgnameL1="L.png";}
   }
   rangen();
   if (fifthword==null) {
      
   for (int e=0; e <temp5.size();e++)
   {
     if (temp5.get(e).equals(firstchar))
  print=false; else print=true;
   }
   temp5.add(firstchar);
   if(print){
   g.drawString(""+firstchar, 500, 200);
   }
  if (firstchar.equals("O")) {fifthword=firstchar;imgnameO="O.png";}
   }
   rangen();
   if (sixthword==null) {
      temp6.add(firstchar);
   for (int e=0; e <temp6.size();e++)
   {
     if (temp6.get(e).equals(firstchar))
 print=false; else print=true;
   }
   if (print){
      g.drawString(""+firstchar, 550, 200);
   }
  if (firstchar.equals(" ")) {sixthword=firstchar;}
   }
   rangen();
   if (sevenword==null) {
      
   for (int e=0; e <temp7.size();e++)
   {
     if (temp7.get(e).equals(firstchar))
print =false; else print=true;
   }
   temp7.add(firstchar);
   if(print){
       g.drawString(""+firstchar, 600, 200);
   }
  if (firstchar.equals("W")) {sevenword=firstchar;imgnameW="W.png";}
   }
   rangen();
   if (eightword==null) {
      
   for (int e=0; e <temp8.size();e++)
   {
     if (temp8.get(e).equals(firstchar))
 print = false ; else print = true;
   }
   temp8.add(firstchar);
   if (print){
      g.drawString(""+firstchar, 650, 200);
   }
  if (firstchar.equals("O")) {eightword=firstchar;imgnameO1="O.png";}
   }
   rangen();
   if (nineword==null) {
      
   for (int e=0; e <temp9.size();e++)
   {
     if (temp9.get(e).equals(firstchar))
 print = false; else print= true;
   }
   temp9.add(firstchar);
   if (print){
      g.drawString(""+firstchar, 700, 200);
   }
  if (firstchar.equals("R")) {nineword=firstchar;imgnameR="R.png";}
   }
   rangen();
   if (tenword==null) {
      
   for (int e=0; e <temp10.size();e++)
   {
     if (temp10.get(e).equals(firstchar))
print=false; else print=true;
   }
   temp10.add(firstchar);
   if (print){
       g.drawString(""+firstchar, 750, 200);
   }
  if (firstchar.equals("L")) {tenword=firstchar;imgnameL2="L.png";}
   }
   rangen();
   if (elevenword==null) {
     
   for (int e=0; e <temp11.size();e++)
   {
     if (temp11.get(e).equals(firstchar))
  print = false; else print=true;
   }
    temp11.add(firstchar);
   if (print){
     g.drawString(""+firstchar, 800, 200);
   }
  if (firstchar.equals("D")) { elevenword=firstchar;imgnameD="D.png";}
   }
   painth(g);
   
  if(x >= 815){ right = false;left = true; }
  if(x <=280 ){right = true;left = false;}
  if(y >= 115){up = true;down = false;}
  if(y <= 60){up = false;down = true;}
  if(up){ y-=8;}
  if(down){y+=8;}
  if(left){x-=8;}
  if(right){x+=8;}
  
  if(x1 >= 815){ right1 = false;left1 = true; }
  if(x1 <=280 ){right1 = true;left1 = false;}
  if(y1 >= 115){up1 = true;down1 = false;}
  if(y1 <= 60){up1 = false;down1 = true;}
  if(up1){ y1-=8;}
  if(down1){y1+=8;}
  if(left1){x1-=8;}
  if(right1){x1+=8;}
    
  if(x2 >= 815){ right2 = false;left2 = true; }
  if(x2 <=280 ){right2 = true;left2 = false;}
  if(y2 >= 115){up2 = true;down2 = false;}
  if(y2 <= 60){up2 = false;down2 = true;}
  if(up2){ y2-=8;}
  if(down2){y2+=8;}
  if(left2){x2-=8;}
  if(right2){x2+=8;}
  
   if(x3 >= 815){ right3 = false;left3 = true; }
  if(x3 <=280 ){right3 = true;left3 = false;}
  if(y3 >= 115){up3 = true;down3 = false;}
  if(y3 <= 60){up3 = false;down3 = true;}
  if(up3){ y3-=8;}
  if(down3){y3+=8;}
  if(left3){x3-=8;}
  if(right3){x3+=8;}

  
  // the flying things at the top
 g.drawString("A "+firstchar , x,y);

 g.drawString("B C D "+firstchar, x1,y1);
    g.drawString("E F G", x2,y2);
      g.drawString("H", x3,y3);

 }
//loading screen
public void loadingscreen(){
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        JFrame frame2 = new JFrame("Loading screen");
       frame2.add(new Testan());
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(820, 650);
        frame2.setVisible(true);

      }
     
     });
 }
//tyoe writter
public void typewitter(Graphics g) {
  b++;
  for(int i = 0; i < typing.length(); i++){
  output = typing.charAt(i);
  System.out.print(output);
 try
  {
  Thread.sleep(80);
  }
  catch (Exception e)
  {
    System.exit(2);
  }
 }
}

// time counting
 final long startTime1=0x14;
public void timer(Graphics g){
   if (firstword==null || secondword==null || thirdword==null || fourthword==null || sixthword==null || sevenword==null  ||eightword==null ||nineword==null ||tenword==null ||fifthword==null ||fifthword==null){
     end = System.nanoTime();
    difference = end - startTime;
    difference1 = difference/1000000000-startTime1;
    g.drawString("Elapsed time: " + String.format("%d second(s), %d millisecond(s), %d microsecond(s) ( %d nanosecond(s)).", difference/1000000000 ,difference/1000000,difference/1000,difference),300,650);
     g.drawString("Elapsed cracking hash time: " + String.format("%d second(s).", difference1),300,670);
}
  if (firstword!=null && secondword!=null && thirdword!=null && fourthword!=null && sixthword!=null && sevenword!=null  &&eightword!=null &&nineword!=null &&tenword!=null &&fifthword!=null &&fifthword!=null){
    end = System.nanoTime();
    difference = end - startTime;
    difference1 = difference/1000000000-startTime1;
     
    t+=1;
  
  }
}

// alert
public void alertMe(){
  c++;
final JFrame frame1 = new JFrame("Message");
 
JButton btn = new JButton("Okay!");
        JLabel label = new JLabel();  
        label.setText("Done!");
  label.setHorizontalAlignment(JLabel.CENTER);
        btn.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(frame,
                                "Bye bye!"
                                );
                        System.exit(4);
                    }
                });

        JButton btn2 = new JButton("Cancel");
        btn2.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                  frame1.setVisible(false); 
        
                    }
                });
 
        JPanel buttonPanel = new JPanel( );
        buttonPanel.add(btn);
        buttonPanel.add(btn2);
        frame1.add(label);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(350, 200);
        frame1.getContentPane( ).add(buttonPanel,BorderLayout.SOUTH);
        frame1.setVisible(true);
}
//drawing final things
int c=0;
public void painth(Graphics g) {
  if (firstword!=null && secondword!=null && thirdword!=null && fourthword!=null && sixthword!=null && sevenword!=null  &&eightword!=null &&nineword!=null &&tenword!=null &&fifthword!=null &&fifthword!=null){
   g.drawString("Total execution time: " + String.format("%d second(s), %d millisecond(s), %d microsecond(s) ( %d nanosecond(s)).", difference/1000000000 ,difference/1000000,difference/1000,difference),300,600);
   g.drawString("Total cracking hash time: " + String.format("%d second(s).", difference1),300,620);
  if (c==0)
   alertMe();
  }
   g.drawString(""+firstword, 300, 250);

   g.drawImage(img,875,350, null);
     try {
           img = ImageIO.read(new File(imgnameH));
     } catch (IOException e) {}

   g.drawString(""+secondword, 350, 250);
   
   g.drawImage(img,150,350, null);
     try {
           img = ImageIO.read(new File(imgnameE));
     } catch (IOException e) {  }
   g.drawString(""+thirdword, 400, 250);
   
   g.drawImage(img,225,350, null);
     try {
           img = ImageIO.read(new File(imgnameL));
     } catch (IOException e) {   }
   g.drawString(""+fourthword, 450, 250);
   
   g.drawImage(img,300,350, null);
     try {
           img = ImageIO.read(new File(imgnameL1));
     } catch (IOException e) {   }
   g.drawString(""+fifthword, 500, 250);
   
   g.drawImage(img,375,350, null);
     try {
           img = ImageIO.read(new File(imgnameO));
     } catch (IOException e) {  }
   g.drawString(""+sixthword, 550, 250);
   g.drawString(""+sevenword, 600, 250);
   
   g.drawImage(img,450,350, null);
     try {
           img = ImageIO.read(new File(imgnameW));
     } catch (IOException e) {  }
   g.drawString(""+eightword, 650, 250);
   
   g.drawImage(img,575,350, null);
     try {
           img = ImageIO.read(new File(imgnameO1));
     } catch (IOException e) {}
   g.drawString(""+nineword, 700, 250);
   
   g.drawImage(img,650,350, null);
     try {
           img = ImageIO.read(new File(imgnameR));
     } catch (IOException e) {}
   g.drawString(""+tenword, 750, 250);
   
   g.drawImage(img,725,350, null);
     try {
           img = ImageIO.read(new File(imgnameL2));
     } catch (IOException e) {}
   g.drawString(""+elevenword, 800, 250); 
   
   g.drawImage(img,800,350, null);
     try {
           img = ImageIO.read(new File(imgnameD));
     } catch (IOException e) {}
  g.setColor(Color.BLUE);
   Hex hexa = new Hex();
   try {
  g.drawString("SHA256: "+hexa.hex(),300,150);
   } catch (Exception exc) {}
  g.setColor(Color.BLACK);
  g.drawRect(280,50,540,70);
   if (!(firstword==null || secondword==null || thirdword==null || fourthword==null || sixthword==null || sevenword==null  ||eightword==null ||nineword==null ||tenword==null ||fifthword==null ||fifthword==null)){
     
       g.setColor(Color.GREEN);
       g.drawString("HASH MATCHES!",505,300);
       g.setColor(Color.BLACK);
   } else {  g.setColor(Color.RED);
       g.drawString("HASH DOES NOT MATCH!",490,300);
       g.setColor(Color.BLACK);}
   
  
}
//random word generator
public void rangen(){
  Random rdn = new Random();
  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
  firstchar = Character.toString(alphabet.charAt(rdn.nextInt(alphabet.length())));
}
// keep repainting
boolean ctrue=true;
private void counting(){
  while(ctrue){

 
   

  try
  {
  Thread.sleep(50);
  }
  catch (Exception e)
  {
    System.exit(1);
  } 
  frame.revalidate();
  frame.repaint(); 
  }
  
}
}
