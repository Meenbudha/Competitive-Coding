import java.util.*;
class LuhnAlgorithm {
    
    public static boolean isValid(long num){
        int sum = 0;
        int position = 0;
        while (num > 0){
            int digit = (int)(num % 10); // Extracts the last digit of the nummber using modulo.
            
            if(position % 2 == 1){
                digit *= 2;
                if(digit > 9) digit -= 9; // Sum of two digit
            }
            sum += digit;
            num /= 10; // Remove last digit;
            position++;
        }
        return (sum % 10 == 0);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to validate using luhn algorithm : ");
        long cardno = sc.nextLong();
        
        String cardstr = Long.toString(cardno);
        int length = cardstr.length();
        if(length < 14 || length > 19){
            System.out.println("Enter valid card length(14 to 19 digits).");
        } else{
            boolean result = isValid(cardno);
            if(result){
                System.out.println("The Cardno is Valid.");
            }else
                System.out.println("The cardno is Invalid.");
        }
            
        sc.close();
                
    }
}