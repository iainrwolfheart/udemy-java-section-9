import java.util.ArrayList;
//INNER CLASS EXERCISE
public class Album {

    private String title;
    private SongList songList;

    public Album(String title) {
        this.title = title;
        this.songList = new SongList();
    }

    public void addSong(String title, double length) {
        this.songList.addSong(new Song(title, length));
    }

    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean addSong(Song song) {
            if (songs.contains(song)) return false;

            this.songs.add(song);
            return true;
        }

        public Song findSong(String title) {
            for (Song checkedSong : this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }
    }
}
