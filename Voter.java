public class VoterEligibility {
    public static void main(String[] args) {
        int age = 19;
        int eligibilityAge = 18;

        if (age >= eligibilityAge) {
            System.out.println("You are eligible to vote.");
        } else {
            int yearsLeft = eligibilityAge - age;
            System.out.println("You are not eligible to vote. You need to wait for " + yearsLeft + " more year(s) to be eligible.");
        }
    }
}
