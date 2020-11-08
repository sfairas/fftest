package sfairas.test;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class Normaliser {

  private static List<String> normalisedProffesions;

  static {
    normalisedProffesions = new ArrayList<>();
    normalisedProffesions.add("Architect");
    normalisedProffesions.add("Software engineer");
    normalisedProffesions.add("Quantity surveyor");
    normalisedProffesions.add("Accountant");
  }

  public String normalise(String s) {
    if(StringUtils.isBlank(s)) {
      throw new IllegalArgumentException("String value is empty or null");
    }
    LevenshteinDistance ld = new LevenshteinDistance();

    TreeMap<Integer, String> scores = new TreeMap<>();
    for (String normProf : normalisedProffesions) {
      int score = ld.apply(normProf, s);
      scores.put(score, normProf);
    }

    // Treemap is a sorted map according to the natural ordering of its keys so 
    // the first element is always going to be the best match
    return scores.firstEntry().getValue();
  }
}
