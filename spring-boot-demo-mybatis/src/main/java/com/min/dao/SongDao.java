package com.min.dao;

import com.min.bean.Song;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface SongDao {

    @Select("select name,singer from song")
    public List<Song> findAll();
}
