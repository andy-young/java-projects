public class HelloWorld1
{
  public static void main(String[] args)
  {

    byte bigByte = 127;
    short bigShort = 32767;
    int bigInt = 210000000;
    long bigLong = 9220000000000000000L;
    float bigFloat = 3.14F;
    double bigDouble = 3.148892858023482304920;

    System.out.println(Float.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);

    boolean trueOrFalse = true;

    char randomChar = 65;
    char anotherChar = 'A';

    char escapedChars = '\\';

    String randomString = "I'm a random string";
    String anotherString = "Stuff";
    String andAnotherString = randomString + ' ' + anotherString;

    String byteString = Byte.toString(bigByte);
    String shortString = Short.toString(bigByte);
    String intString = Integer.toString(bigInt);
    String longString = Byte.toString(bigByte);
    String floatString = Byte.toString(bigByte);
    String doubleString = Byte.toString(bigByte);
    String booleanString = Byte.toString(bigByte);

    double aDoubleValue = 3;
    int doubleToInt = (int) aDoubleValue;

    int stringToInt = Integer.parseInt(intString);


    System.out.println(stringToInt);
  }
}