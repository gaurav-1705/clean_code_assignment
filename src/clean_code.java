public class clean_code
{
    static class Check { //static class

        int smallNumber;
        int largeNumber;
    }
    //Method for finding smallest and largest number
    static Check FIND_SMALLEST_LARGEST(int givenArray[], int arraySize) {
        Check object_Of_Check = new Check();
        int i;

        if (arraySize == 1) {
            object_Of_Check.largeNumber = givenArray[0];
            object_Of_Check.smallNumber = givenArray[0];
            return object_Of_Check;
        }

        if (givenArray[0] > givenArray[1]) {
            object_Of_Check.largeNumber = givenArray[0];
            object_Of_Check.smallNumber = givenArray[1];
        } else {
            object_Of_Check.largeNumber = givenArray[1];
            object_Of_Check.smallNumber = givenArray[0];
        }

        for (i = 2; i < arraySize; i++) {
            if (givenArray[i] > object_Of_Check.largeNumber) {
                object_Of_Check.largeNumber = givenArray[i];
            } else if (givenArray[i] < object_Of_Check.smallNumber) {
                object_Of_Check.smallNumber = givenArray[i];
            }
        }

        return object_Of_Check;
    }
    //Main method
    public static void main(String args[]) {
        int givenArray[] = {1,4,34,53,23,54,234,3,24,54}; //given array elements
        int arraySize = 10; // Size of an Array
        Check check = FIND_SMALLEST_LARGEST(givenArray, arraySize); //calling the array
        // Printing Statement
        System.out.printf("\nsmall_number is %d", check.smallNumber);
        System.out.printf("\nlarge_number is %d", check.largeNumber);
    }
}