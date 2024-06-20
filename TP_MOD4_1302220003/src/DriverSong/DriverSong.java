package DriverSong;

import Art.Song_1302220003;
import Job.Artis_1302220003;

public class DriverSong {
   public DriverSong() {
   }

   public static void main(String[] args) {
      Artis_1302220003 a1 = new Artis_1302220003("Alan Walker", "1997-08-24");
      Artis_1302220003 a2 = new Artis_1302220003("Ari Lasso", "1973-01-17");
      System.out.println("Info Artis");
      a1.displayInfo();
      System.out.println();
      a2.displayInfo();
      System.out.println();
      Song_1302220003 s1 = new Song_1302220003("Not You", a1, "2021-12-03");
      Song_1302220003 s2 = new Song_1302220003("Hampa", a2, "2003-02-10");
      System.out.println("Info Lagu");
      s1.displayInfo();
      System.out.println();
      s2.displayInfo();
      System.out.println();
   }
}
