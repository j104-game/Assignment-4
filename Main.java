public class Main { 
    public static void main(String[] args) { 
        //Don't let the size of this scare you! no matter how big an array is, it all works the same! 
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82}; 
        //you cannot use the array util. Do this one by hand :(
        
        //This loop goes through the array one number at a time and compares it with the rest.
        for (int i = 0; i < myArray.length; i++) {
            //This int variable is being used to check how many times a number appears in the array.
            int count = 1;
            for (int j = i + 1; j < myArray.length; j++) {
                //This if stataement increases the count variable if a duplicate is found.
                if (myArray[i] == myArray[j]) {
                    count++;
                }
            }
            //This if statement checks if the count is greater than 1, which means a duplicate was found. 
            // If it is, it prints out the duplicate number.
            if (count > 1) {
                System.out.println("Duplicate found: " + myArray[i]);
            }
        }
    }
}
/* I beleive this statisfies the requirements of the assignment. 
It goes through the array and checks for duplicates, printing them out when found.
I had forgotten about nested loops, so this was a good reminder. 
It also took a bit to get the count function to work, I had it in the wrong part of the code so It was constatly increasing*/