package Art;

import Job.Artis_1302220003;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Song_1302220003 {
   private String title;
   private Artis_1302220003 artist;
   private LocalDate release;
   
   public Song_1302220003(String title, Artis_1302220003 artist, String release) {
      this.title = title;
      this.artist = artist;
      this.release = LocalDate.parse(release);
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public Artis_1302220003 getArtist() {
      return this.artist;
   }

   public void setArtist(Artis_1302220003 artist) {
      this.artist = artist;
   }

   public String getRelease() {
      return this.release.format(DateTimeFormatter.ofPattern("D MMMM YYYY"));
   }

   public void setRelease(String release) {
      this.release = LocalDate.parse(release);
   }

   public void displayInfo() {
      System.out.println("Title: " + this.title);
      System.out.println("Artist: " + this.artist.getName());
      System.out.println("Release: " + this.release);
      System.out.println("Artist age is " + this.artist.getAge() + " when song released");
   }
}

