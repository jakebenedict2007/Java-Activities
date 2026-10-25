public class FavoriteThingsArray {
    public static void main(String[] args) {
        String[] favorites = {"Sinigang", "Basketball", "Anime", "Music", "Mobile Legends"};

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Length: " + favorites.length);
    }
}
