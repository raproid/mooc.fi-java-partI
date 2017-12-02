
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Top ten by goals:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("\n");
        
        System.out.println("Top 25 by penalties:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("\n");
        
        System.out.println("Statistics for Sydeny Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("\n");
        
        System.out.println("Statistics for Philadelphia Flyers by points:");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
        System.out.println("\n");
        
        System.out.println("Players in Anaheim Duck by points:");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    }
}
