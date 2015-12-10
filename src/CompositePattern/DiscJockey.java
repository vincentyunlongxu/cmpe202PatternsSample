package CompositePattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class DiscJockey {
    SongComponent songList;
    public DiscJockey(SongComponent newSongList) {
        songList = newSongList;
    }

    public void getSongList() {
        songList.displaySongInfo();
    }
}
