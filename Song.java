package SongLibrary.Model;

public class Song {
private String name;
    private String artist;
    private String album;
    private int year;

    public Song(String name, String artist, String album, int year){
        this.name=name;
        this.artist=artist;
        this.album=album;
        this.year=year;
    }

    public void editSong(String name, String artist, String album, int year){
        this.name=name;
        this.artist=artist;
        this.album=album;
        this.year=year;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getArtist(){
        return artist;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public String getAlbum(){
        return album;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }
}
