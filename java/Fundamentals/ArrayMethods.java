import java.util.Arrays;

public class ArrayMethods{
  public static void main(String[] args)
  {

    int intArr[] = {10,23,32,41,33,12,45};
    int intArr2[] = {23,231,123,32,10,34};
    char charArr[] = {'i','m',' ','b', 'a','d'};
    Arrays.sort(intArr);
    Arrays.sort(charArr);
    //Searching chars doesnt work
    //System.out.println("m found at index "+Arrays.binarySearch(charArr,"m"));
    System.out.println("34 found at index "+Arrays.binarySearch(intArr,34));
    //comparing different datatype string doesnt work
    //System.out.println("Comparing int and char arrays: "+Arrays.compare(intArr,charArr));
    System.out.println("Comparing both int arrays: "+Arrays.compare(intArr,intArr2));
    System.out.println("Comparing both int arrays: "+Arrays.compareUnsigned(intArr,intArr2));
    //cant stack methods
    //System.out.println("Finding mismatch in 2 integer arrays: "+Arrays.mismatch(intArr,Arrays.sort(intArr2)));
    System.out.println("Finding mismatch at position in 2 integer arrays: "+Arrays.mismatch(intArr,intArr2));
    Arrays.sort(intArr2);
    System.out.println("Finding mismatch at position in 2 integer arrays after sorting: "+Arrays.mismatch(intArr,intArr2));
    System.out.println("Hash coding character array: "+Arrays.hashCode(charArr));
  }
}
