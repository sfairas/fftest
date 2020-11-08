package sfairas.test;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeefoTestApplication {

  
  public static void main(String[] args) throws IOException {
    String jt = "Java engineer";
    Normaliser n = new Normaliser();
    String normalisedTitle = n.normalise(jt);
    System.out.println(jt+": "+normalisedTitle);
    
    jt = "C# engineer";
    normalisedTitle = n.normalise(jt);
    System.out.println(jt+": "+normalisedTitle);
    
    
    jt = "Chief Accountant";
    normalisedTitle = n.normalise(jt);
    System.out.println(jt+": "+normalisedTitle);
    
  }

}
