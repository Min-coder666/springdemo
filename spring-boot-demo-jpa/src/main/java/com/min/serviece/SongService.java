package com.min.serviece;

import com.min.bean.Song;

import java.util.List;

public interface SongService {

    List<Song> getSongList();

    void addSong(Song song);
//
//    void delete(String name);
//
//    Song getSong(String name);
//
//    void update(Song song);
}
