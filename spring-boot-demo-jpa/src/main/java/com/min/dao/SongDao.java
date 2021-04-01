package com.min.dao;

import com.min.bean.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface SongDao extends JpaRepository<Song,Long> {


}
