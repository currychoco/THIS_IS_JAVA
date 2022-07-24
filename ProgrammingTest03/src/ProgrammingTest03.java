
class Song{
	
	private String artist;
	private String album;
	private String title;
	private String releaseDate;
	
	public Song(String artist, String album, String title, String releaseDate) {
		this.artist = artist;
		this.album = album;
		this.title = title;
		this.releaseDate = releaseDate;
	}
	
	//getter
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getTitle() {
		return title;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	
	//setter
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public String toString() {
		return "가수: " + artist + "\n앨범: " + album + "\n타이틀곡: " + title + "\n발매일: " + releaseDate;
	}
	
}

public class ProgrammingTest03 {
	public static void main(String[] args) {
		Song song = new Song("ABBA", "Arrival", "Dacing Queen", "1967년 10월 11일");
		System.out.println(song);
	}
}
