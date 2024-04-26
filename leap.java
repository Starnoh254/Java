// code to check if a year is a leap year
public class leap {
    public static void main(String[] args){
        int year = 2000;
        System.out.println(isLeapYear(year));
        int n = 20;
        System.out.println(fibonacci(n));

    }

    public static boolean isLeapYear(int year){
        if (year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static int fibonacci(int n){
        if(n <= 2){
            return 1;
        }
        int array [] = new int[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2 ; i < n ; i ++){
            array[i] = array[i-1] + array[i-2];
        }
        return array[n-1];

    }
}
