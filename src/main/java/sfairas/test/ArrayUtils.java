package sfairas.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

import sfairas.test.basetypes.StatType;

public class ArrayUtils {

  /**
   * Calculate median, mean, mode and range of an int[]  
   * @param intArray The array to collect the statistics on
   * @return A map with all the statistics where the key is of type {@link StatType}
   */
  public Map<StatType, String> getStats(int[] intArray){
    Map<StatType, String> stats = new HashMap<>();
    stats.put(StatType.MEDIAN, Double.toString(getMedian(intArray)));
    stats.put(StatType.MEAN, String.format("%f", getMean(intArray)));
    stats.put(StatType.MODE, getModes(intArray).toString());
    stats.put(StatType.RANGE, Integer.toString(getRange(intArray)));
    return stats;
  }

  /**
   * Get the median which is a value that divides a data set into two halves.
   * Note that when calculating the median of a finite list of numbers, the 
   * order of the data samples is important, that is why the array is thus first sorted.
   * In the case where the total number of values in a data sample is odd, the median is 
   * simply the number in the middle of the list of all values. When the data sample contains an 
   * even number of values, the median is the mean of the two middle values.
   * Note that the size of the dataset need to be equal or above 1, otherwise a null value is returned
   * @param intArray The data set
   * @return The median
   */
  public Double getMedian(int[] intArray){

    int length = intArray.length;
    if(length == 0){
      return null;
    }

    Arrays.sort(intArray);
    Double median;

    if (length % 2 == 0) {
      median = ((double)intArray[length/2] + (double)intArray[length/2 - 1])/2;
    } else {
      median = (double) intArray[length/2];
    }

    return median;
  }
  
  /**
   * Calculate the mean value.
   * Note that the size of the dataset need to be equal or above 1, otherwise a null value is returned
   * @param intArray The data set
   * @return The mean
   */
  public Double getMean(int[] intArray){
    OptionalDouble meanOpt = Arrays.stream(intArray).average();
    if(meanOpt.isPresent()){
      return meanOpt.getAsDouble();
    }
    
    return null;
  }

  /**
   * Get the value(s) in an int[] data set that has the highest number of recurrences. 
   * It is possible for a data set to be multimodal, meaning that it has more than one mode.
   * Note that the size of the dataset need to be equal or above 1, otherwise an empty list is returned
   * @param intArray The data set 
   * @return A list of all the modes
   */
  public List<Integer> getModes(int[] intArray) {

    if(intArray.length == 0){
      return new ArrayList<Integer>();
    }
    
    List<Integer> numbers = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        
    final Map<Integer, Long> frequencies = numbers.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    final long maxFrequency = frequencies.values().stream()
        .mapToLong(count -> count)
        .max().orElse(-1);

    return frequencies.entrySet().stream()
        .filter(tuple -> tuple.getValue() == maxFrequency)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
  }
  
  /**
   * Calculate the range between all values in the dataset. 
   * This method will calculate the difference between the largest and the smallest values.
   * Note that the size of the dataset need to be equal or above 2, otherwise a null value is returned
   * @param intArray The data set
   * @return The range
   */
  public Integer getRange(int[] intArray){
    int length = intArray.length;
    if(length < 2){
      return null;
    }

    Arrays.sort(intArray);

    return intArray[length-1] - intArray[0];
  }
}
