package com.min.serviece;

import com.min.bean.Song;
import com.min.dao.SongDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongDao songDao;
    @Override
    public List<Song> getSongList() {
        return songDao.findAll();
    }

    @Override
    public void addSong(Song song) {
        songDao.save(song);
    }
//
//    @Override
//    public void delete(String name) {
//        songDao.;
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
