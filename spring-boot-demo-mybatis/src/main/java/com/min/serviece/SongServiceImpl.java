package com.min.serviece;

import com.min.bean.Song;
import com.min.dao.SongDao;
import com.min.dao1.SongDao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongDao songDao;

    @Autowired
    private SongDao1 songDao1;
    @Override
    public List<Song> getSongList() {
        return songDao1.findAll();
    }

//    @Override
//    public void addSong(Song song) {
//        songDao.addSong(song);
//    }
//
//    @Override
//    public void delete(String name) {
//        songDao.delete(name);
//    }
//
//    @Override
//    public Song getSong(String name) {
//        return songDao.getSong(name);
//    }
//
//    @Override
//    public void update(Song song) {
//        songDao.update(song);
//    }
}
