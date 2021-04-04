package com.min.dao1;

import com.min.bean.Song;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongDao1 {
    @Select("select name,singer from song")
    public List<Song> findAll();
}


