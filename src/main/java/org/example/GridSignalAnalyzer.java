package org.example;

public class GridSignalAnalyzer {

    // Scrambled grid
    char[][] scrambledGrid = {
            {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
            {'A', 'L', 'P', 'H', 'A'},
            {'T', 'A', 'N', 'G', 'O', '7'},
            {'B', 'R', 'A', 'V', 'O'}
    };

    void analyzeWithForLoop() {
        for (int i = 0; i < scrambledGrid.length; i++) {
            for (int j = 0; j < scrambledGrid[i].length; j++) {
                System.out.print(scrambledGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    void analyzeWithForEachLoop() {
        for (char[] rowArray : scrambledGrid) {
            System.out.println("Processing Row with Hash: " + rowArray);
            for (char character : rowArray) {
                System.out.println("->" + character);
            }
        }
    }

    void analyzeWithHybridLoop() {
        for (char[] rowArray : scrambledGrid) {
            for (int i = 0; i < rowArray.length; i++) {
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create an instance of GridSignalAnalyzer
        GridSignalAnalyzer analyzer = new GridSignalAnalyzer();

        // Analyze the scrambled grid using a for loop
        System.out.println("\n--- PHASE 2: STANDARD FOR-LOOP MANEUVER ---");
        analyzer.analyzeWithForLoop();

        // Analyze the scrambled grid using a for-each loop
        System.out.println("\n--- PHASE 3: ADVANCED FOR-EACH SWEEP ---");
        analyzer.analyzeWithForEachLoop();

        // Analyze the scrambled grid using a hybrid loop
        System.out.println("\n--- PHASE 4: HYBRID LOOP APPROACH ---");
        analyzer.analyzeWithHybridLoop();

        // Print a message indicating the end of the analysis
        System.out.println("\nGrid analysis completed.");
    }
}
