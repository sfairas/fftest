package sfairas.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FeefoTestApplicationTests {

  @Test
  void contextLoads() {
    Normaliser n = new Normaliser();
    String jt = "Java engineer";
    String normalisedTitle = n.normalise(jt);
    assertTrue(normalisedTitle.equals("Software engineer"));

    jt = "C# engineer";
    normalisedTitle = n.normalise(jt);
    assertTrue(normalisedTitle.equals("Software engineer"));

    jt = "Chief Accountant";
    normalisedTitle = n.normalise(jt);
    assertTrue(normalisedTitle.equals("Accountant"));
  }

}
