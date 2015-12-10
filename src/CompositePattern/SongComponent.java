package CompositePattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public abstract class SongComponent {
    public void add(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }
    public String getSongName() {
        throw new UnsupportedOperationException();
    }
    public int getReleaseYear() {
        throw new UnsupportedOperationException();
    }
    public void displaySongInfo() {
        throw new UnsupportedOperationException();
    }
}
