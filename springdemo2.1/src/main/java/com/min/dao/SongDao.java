package com.min.dao;

import com.min.bean.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongDao {

    private static List<Song> songList = new ArrayList<>();

    static {
        songList.add(new Song("seven","taylor"));
        songList.add(new Song("幻听","许嵩"));
        songList.add(new Song("麻雀","李荣浩"));
        songList.add(new Song("星空","五月天"));

    }

    public List<Song> getSongList(){
        return songList;
    }

    public void addSong(Song song){
        songList.add(song);
    }

    public Song getSong(String name){
        for (int i = 0; i < songList.size(); i++) {
            if (songList.get(i).getName().equals(name))
                return songList.get(i);
        }
        return new Song("","");
    }
    public void delete(String name){
        songList.remove(getSong(name));
    }

    public void update(Song song){
        getSong(song.getName()).setSinger(song.getSinger());
    }

}
