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
public class album {
    private String title;
    private int year;
    private song[] songs;
    private int songCount;
    
    public album(){
        songs = new song[10];
        songCount = 0;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getYear(){
        return year;
    }
    
        public void addSong(song song){
        if(songCount < songs.length){
            songs[songCount++] = song;
        } else {
            System.out.println("album penuh");
        }
    }
    
    public void displayInfo(){
        System.out.println("album info");
        System.out.println("title: " + title);
        System.out.println("tahun: " + year);
        
        for(int i = 0; i < songCount; i++){
            System.out.println((i+1) + ". " + " title " + songs[i].getTitle());
            System.out.println("artis: " + String.join("," , songs[i].getArtist()));
            System.out.println("duration: " + songs[i].getDuration());
        }
    }
}
