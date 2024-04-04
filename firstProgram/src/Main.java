public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        //System.out.println("Movie: Interstellar");

        int debutYear = 2014;
        System.out.printf("Movie: Interstellar \nDebut: %d. \n", debutYear);


        double averageGrade = (10 + 7.8) / 2;
        System.out.printf("Average Grade: %.1f \n", averageGrade);

        String synopsis = """
                Life on earth is hanging by a thread and humanity needs to find another planet before it's too late.
                """;

        System.out.printf("synopsisMovie: %s", synopsis);


    }
}