import java.util.Arrays;
//Our cheaty array helper file <3
public class debug {
    public static void main(String[] args) {
        String[] nameArray = {"Pam", "Stephen", "Mia", "Louis"};
    
        int[] numberArray;

        int[] newArray = new int[20];

        
        //Here's our first practice array!
        String[] sortMe = {"Apple","Kiwi","Orange","Banana","Watermelon","Strawberry"};
        //What method is missing here to actually sort our array?
        Arrays.sort(sortMe);
        //And what method is missing here to print out that array?
        System.out.println(Arrays.toString(sortMe));
        //After this, you cannot use the array helper file, gotta go back to the old ways!!

        //another one!
        int addMe[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //How would we add every index together and print out the sum??
        //A small hint:
        int sum = 0;
        for(int i = 0; i < addMe.length; i++){
            sum += addMe[i];
        }
        System.out.println("Sum: " + sum);

        //thinking one! here's an array
        int maxMe[] = {280, 4892, 134, 23, 1937, 5329, 932, 89};
        //What would you have to do to find the largest number and then print that value?
        int largest = maxMe[0];
        for(int i = 1; i < maxMe.length; i++){
            if(maxMe[i] > largest){
                largest = maxMe[i];
            }
        }
        System.out.println("Max: " + largest);

    }
}
        