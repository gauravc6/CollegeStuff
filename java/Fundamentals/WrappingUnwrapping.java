public class WrappingUnwrapping{
  public static void main(String[] args) {
    int a = 1;
    float b = 3.14f;
    double c = 1.41;
    char d = 'S';
    byte e = 1;
    int[] intArr = {1,2,3,4};
    
    System.out.println("Datatypes before wrapping: ");
    System.out.println("int: "+a);
    System.out.println("float: "+b);
    System.out.println("double: "+c);
    System.out.println("char: "+d);
    System.out.println("byte: "+e);
    System.out.println();
    //System.out.println("intArray: "+intArr);

    // wrapping primitive datatypes
    Integer intobj = new Integer(a);
    Float floatobj = new Float(b);
    Double doubleobj = new Double(c);
    Character charobj = new Character(d);
    Byte byteobj = new Byte(e);
    //Integer[] intarrobj = new Integer(intArr);

    System.out.println("Datatype objects after wrapping: ");
    System.out.println("int: "+intobj);
    System.out.println("float: "+floatobj);
    System.out.println("double: "+doubleobj);
    System.out.println("char: "+charobj);
    System.out.println("byte: "+byteobj);
    System.out.println();
    //System.out.println("intArray: "+intarrobj);

    //Cross wrapping datatypes
    System.out.println("Cross wrapping datatypes: ");

    Float intToFloat = new Float(a);
    System.out.println("Converting int to float: "+intToFloat);

    Double floatToDouble = new Double(c);
    System.out.println("Converting float to double: "+floatToDouble);

    Integer byteToInt = new Integer(e);
    System.out.println("Converting byte to int: "+byteToInt);
    System.out.println();

    //doesn't work because there is no costructor for Integer(double)
    //this is due to possible lossy conversion
    //Integer doubleToInt = new Integer(c);
    //System.out.println("Converting double to int: "+doubleToInt);

    //unwrapping objects back to primitive Datatypes
    int iu = intobj;
    float fu = floatobj;
    double du = doubleobj;
    char cu = charobj;
    byte bu = byteobj;
    //printing values
    System.out.println("Unwrapping objects back to primitive dataypes: ");
    System.out.println("int: "+iu);
    System.out.println("float: "+fu);
    System.out.println("double: "+du);
    System.out.println("char: "+cu);
    System.out.println("byte: "+bu);

  }
}
