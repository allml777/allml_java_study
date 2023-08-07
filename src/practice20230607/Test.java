package practice20230607;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("zhanlang2", 9.9, "wujing");
        movies[1] = new Movie("guanlangaoshou", 0, "aa");
        movies[2] = new Movie("adsfffa", 7, "asddff");

        String name = "sagdyaggfagfkasfgaigsai";
        char c = name.charAt(4);
        System.out.println(c);
        for (Movie i : movies) {
            System.out.println(i.getName());
            System.out.println(i.getScore());
            System.out.println(i.getActor());
        }
    }
}
