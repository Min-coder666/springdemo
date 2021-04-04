package com.min.dao;

import com.min.bean.Song;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface SongDao extends Mapper<Song> {
}
