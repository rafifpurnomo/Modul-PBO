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
public class song {
 private String title;
    private String[] artist;
    private int duration;
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setArtist(String[] artist){
        this.artist = artist;
    }
    
    public void setDuration(int duration){
        this.duration = duration;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String[] getArtist(){
        return artist;
    }
    
    public String getDuration(){
        int menit = duration / 60;
        int detik = duration % 60;
        return String.format("%02d:%02d", menit, detik);
    }
}
