package com.min.controller;


import com.min.bean.Song;
import com.min.serviece.SongService;
import com.min.serviece.SongServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    private SongService songService;

    @RequestMapping("/song/list")
    public String list(Model model){
        List list =  songService.getSongList();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/song/toAdd")
    public String toAdd(){
        return "toAdd";
    }

    @RequestMapping("/song/add")
    public String add(Song song){
        songService.addSong(song);
        return "redirect:/song/list";
    }

    @RequestMapping("/song/delete")
    public String delete(String name){
        songService.delete(name);
        return "redirect:/song/list";
    }

    @RequestMapping("/song/toUpdate")
    public String toUpdate(Model model,String name){
        model.addAttribute("song",songService.getSong(name));
        return "update";
    }

    @RequestMapping("/song/update")
    public String update(Song song){
        songService.update(song);
        return "redirect:/song/list";
    }
}
