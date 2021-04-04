package com.min.serviece;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.min.bean.Song;
import com.min.dao.SongDao;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl extends ServiceImpl<SongDao, Song> implements SongService{
}
