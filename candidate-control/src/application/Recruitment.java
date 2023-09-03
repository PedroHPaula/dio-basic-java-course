package application;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Recruitment {
    public static void main(String[] args) {
        String [] candidates = {"Bob","Anna","Josh","Mary","Jeff"};
        for (String candidate : candidates) {
            callCandidate(candidate);
        }
    }

    static void callCandidate(String candidate) {
        int callAttempts = 1;
        boolean keepCalling = true;
        boolean answered = false;

        do {
            answered = answerCall();
            keepCalling = !answered;
            if (keepCalling) {
                callAttempts++;
            } else {
                System.out.println("Able to contact candidate");
            }
        } while (keepCalling && callAttempts < 3);

        if (answered) {
            System.out.println(candidate+" has been successfully contacted on the "+callAttempts+" attempt");
        } else {
            System.out.println("Unable to contact "+candidate+" after "+callAttempts+" attempts");
        }
    }

    static boolean answerCall() {
        return new Random().nextInt(3)==1;
    }

    static void printSelectedCandidates() {
        String [] candidates = {"Bob","Anna","Josh","Mary","Jeff"};
        System.out.println("Printing the list of selected candidates");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println("The candidate in the position "+(i+1)+" is "+candidates[i]);
        }
    }

    static void selectCandidate() {
        String [] candidates = {"Bob","Anna","Josh","Mary","Jeff",
                                "Kate", "Tom", "Gwen", "John", "Vera"};
        
        int selectedCandidates = 0;
        int currentCandidate = 0;
        double baseSalary = 2000.0;
        while (selectedCandidates < 5 && currentCandidate < candidates.length) {
            String candidate = candidates[currentCandidate];
            double proposedSalary = proposeSalary();

            System.out.println("The candidate "+candidate+" proposed "+proposedSalary);
            if (proposedSalary <= baseSalary) {
                System.out.println(candidate+" has been selected");
                selectedCandidates++;
            }
            currentCandidate++;
        }
    }

    static void evaluateCandidate(double proposedSalary) {
        double baseSalary = 2000.0;

        if (proposedSalary < baseSalary) {
            System.out.println("Call candidate");
        } else if(proposedSalary == baseSalary) {
            System.out.println("Call candidate offering a counter-proposal");
        } else {
            System.out.println("Awaiting remaining candidates");
        }
    }

    static double proposeSalary() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
