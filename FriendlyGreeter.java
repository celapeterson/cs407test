import java.util.Scanner;

public class FriendlyGreeter
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Hi there! What's your name?");
        String s = in.nextLine();
        
        // TODO: change this string so the computer likes the name
        System.out.println(s + ", huh? I don't like that name!!!");
    }
}
