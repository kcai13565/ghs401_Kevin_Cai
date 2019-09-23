

public class Square_Range
{
    public static void main() {
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            int randNum = (int)(Math.random() * (square - i + 1) + i);
            System.out.print(i + "\t" + square + "\t" + randNum);
            if (randNum == i) {
                System.out.println("\tThe random value is equal to the index");
            } else if (randNum == square) {
                System.out.println("\tThe random value is equal to the square of the index");
            } else {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
        String[] movies = {"movie", "movie1", "movie2"};
        String[] songs = {"song", "song1", "song2"};
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }
        int a = 0;
        System.out.println();
        System.out.println();
        while (a < songs.length) {
            System.out.print(songs[a]);
            if (a != songs.length - 1) {
                System.out.print(", ");
            }
            a++;
        }
    }
}
