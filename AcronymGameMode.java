import java.util.Scanner;

public class AcronymGameMode extends AcronymLearning implements GameActions {

    static int score = 0;

    public AcronymGameMode() {
        super();
        //System.out.println("AcronymGameMode Constructor");
    }

    @Override
    public void play() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- CATEGORY ROULETTE ---");
        System.out.println("Spinning the wheel...");

        int index = (int)(Math.random() * categories.length);
        String chosen = categories[index];

        showCategory(chosen); // overloaded method
System.out.println("NOTE:");
System.out.println("- Spelling must be exact.");
System.out.println("- Hyphens matter.");
System.out.println("- Spaces matter.");
System.out.println("- Capitalization does NOT matter.");
System.out.println("  (Use correct spacing and punctuation for full forms.)\n");
        String[] acro = {};
        String[] full = {};

        if(chosen.equals("Technology")) {
            acro = techAcronyms;
            full = techFull;
        } else if(chosen.equals("Social Media")) {
            acro = smAcronyms;
            full = smFull;
        } else if(chosen.equals("Medical")) {
            acro = medAcronyms;
            full = medFull;
        } else if(chosen.equals("Education")) {
            acro = eduAcronyms;
            full = eduFull;
        } else if(chosen.equals("Business")) {
            acro = busAcronyms;
            full = busFull;
        }

        // Pick 10 random unique indices
        int[] randomIndices = getRandomIndices(acro.length);

        score = 0;
        for (int i = 0; i < randomIndices.length; i++) {
            int idx = randomIndices[i];

            System.out.println("\nWhat is the full form of: " + acro[idx]);
            System.out.print("Your answer: ");
            String ans = sc.nextLine();

            if(ans.equalsIgnoreCase(full[idx])) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println(" Wrong! \nCorrect: " + full[idx]);
            }
        }

        System.out.println("\nYour Final Score = " + score);
        System.out.println("Accuracy: " + calculateAccuracy(score, 10) + "%");
    }

    // Generate 10 unique random numbers
    public int[] getRandomIndices(int length) {
        int[] out = new int[10];
        boolean[] used = new boolean[length];
        int c = 0;

        while(c < 10) {
            int r = (int)(Math.random() * length);
            if(!used[r]) {
                used[r] = true;
                out[c] = r;
                c++;
            }
        }
        return out;
    }

    // Recursion
    public int calculateAccuracy(int s, int total) {
        if(total == 0) return 0;
        return (s * 100) / total;
    }
}