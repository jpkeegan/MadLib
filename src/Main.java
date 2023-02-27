import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] adjectives = new String[2];
        for(int i = 0; i < adjectives.length; i++){
            System.out.println("Enter adjective #" + (i+1) +": ");
            adjectives[i] = sc.next();
        }
        String[] nouns = new String[3];
        for(int i = 0; i < nouns.length; i++){
            System.out.println("Enter noun #" + (i + 1) + ": ");
            nouns[i] = sc.next();
        }

        System.out.println("Enter a profession: ");
        String prof = sc.next();

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        MadLib story = new MadLib(adjectives[0], adjectives[1],nouns[0],
                nouns[1], nouns[2], prof, num);

        System.out.println(story.potterMadLib());
    }
}