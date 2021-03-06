public class Main {

    public static void main(String[] args) {
        

        int myValue = 10000; 

        int myMinIntValue = Integer.MIN_VALUE; 
        int myMaxIntValue = Integer.MAX_VALUE; 
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); 

        int myMaxIntTest = 214_748_367; 
        // valid but not used oftern above 

        byte myMinByteValue = Byte.MIN_VALUE; 
        byte myMaxByteValue = Byte.MAX_VALUE; 

        System.out.println("Byte Min Value = " + myMinByteValue); 
        System.out.println("Byte Max Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE; 
        short myMaxShortValue = Short.MAX_VALUE; 

        System.out.println("Short Min Value = " + myMinShortValue); 
        System.out.println("Short Max Value = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE; 
        long myMaxLongValue = Long.MAX_VALUE; 

        System.out.println("Long Min Value = " + myMinLongValue); 
        System.out.println("Long Max Value = " + myMaxLongValue);

        long myLongValue = 100L; 

        long bigLongLiteralValue = 214748367342L;
        
        short bigShortLiteralValue = 32767;
        
        int myTotal = (myMinIntValue / 2); 

        byte myNewByteValue = (byte) (myMinByteValue /2); 

        short myNewShortValue = (short) (myMinShortValue / 2); 

        byte challengeByte = 100; 

        short challengeShort = 3000; 

        int challengeInt = 1000000; 

        long challengeLong = 50000L + 10L * (challengeByte + challengeShort + challengeInt); 

        System.out.println(challengeLong); 
    }
}