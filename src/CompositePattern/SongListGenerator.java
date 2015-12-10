package CompositePattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class SongListGenerator {
    public static void main(String[] args) {
        SongComponent industrialMusic = new SongGroup("Industrial", "is a style of experimental music that draws on transgressive and provacative themes");
        SongComponent heavymetalMusic = new SongGroup("\nHeavy metal", "is a genre of rock that developed in the late 1960, largely in the UK and in the US");
        SongComponent dubstepMusic = new SongGroup("\nDubstep", "is a genre of electronic dance music that originated in South London, England");

        SongComponent everySong = new SongGroup("Song List", "Every Song Available");
        everySong.add(industrialMusic);
        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));
        industrialMusic.add(dubstepMusic);
        dubstepMusic.add(new Song("centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        everySong.add(heavymetalMusic);
        heavymetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavymetalMusic.add((new Song("Ace of Spades", "Motorhead", 1980)));

        DiscJockey crazyLarry = new DiscJockey(everySong);
        crazyLarry.getSongList();
    }
}
