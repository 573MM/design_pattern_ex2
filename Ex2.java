import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Ex2 {
    public static final int MAX = 5;
    public static void main(String[] args) {
            System.out.println("Welcome to the Application!");
            List<Integer> nums = inputIntegerArrayList();
            sortArrayList(nums);
            printNum(nums);
        }
    public static List<Integer> inputIntegerArrayList(){
        Scanner inp = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter 5 valid integers in the range [0, 10]");
        while(nums.size() < MAX) {
                
                String s = inp.nextLine();
                if(checkType(s)==false){
                    continue;
                }
                int num = Integer.parseInt(s);
                
                if(checkInputValid(num)) {
                    continue;
                }
                nums.add(num);
            }
        inp.close();
        return nums;
    }
    public static boolean checkType(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
        
    }
    public static boolean checkInputValid(int i){
        if(i<0 || i > 10) {
                    System.out.println("Invalid range! Try again!");
                    return true;
        }else{
            return false;
        }
    }
    public static void sortArrayList(List<Integer> nums){
        Collections.sort(nums);
    }
    public static void printNum(List<Integer> nums){
        for(int num : nums)
                System.out.print(num+" ");
    }
}