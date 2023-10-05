import java.util.*;

public class Panagram {
    public static void main(String[] args) {
        Set<Character> s = new HashSet<>(List.of('a', 
        'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
         'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        
         System.out.println("Enter a String :");

         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();

         str = str.toLowerCase();
// THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG;
         for(int i=0;i<str.length();i++)
         {
            char c = str.charAt(i);
            s.remove(Character.valueOf(c));
         }
         if(s.isEmpty())
             System.out.println("Panagram");
        else
            System.out.println("Not a panagram");



    }
}
