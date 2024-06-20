/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_mod3_1302220003;

/**
 *
 * @author Muhammad Rafif A.P
 */
public class TP_MOD3_1302220003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
song song1 = new song();
        song1.setTitle("hello world");
        song1.setArtist(new String[]{"alan walker", "torine"});
        song1.setDuration(171);
        
        song song2 = new song();
        song2.setTitle("film favorit");
        song2.setArtist(new String[]{"sheila on 7"});
        song2.setDuration(226);
        
        album album = new album();
        album.setTitle("kayaknya hits");
        album.setYear(2023);
        
        album.addSong(song1);
        album.addSong(song2);
        
        album.displayInfo();
    }
    
}
