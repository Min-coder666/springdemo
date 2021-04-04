package com.min.controller;


import com.min.bean.Song;
import com.min.serviece.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/song")
public class SongController {

    @Autowired
    private SongService songService;

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String list(Model model){
        List list =  songService.getSongList();
        model.addAttribute("list",list);
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }
//
    @PostMapping
    public String add(Song song){
        songService.addSong(song);
        return "redirect:/song";
    }
//
//    @DeleteMapping("/{name}")
//    public String delete(@PathVariable("name") String name){
//        songService.delete(name);
//        return "redirect:/song";
//    }
//
//    @GetMapping("/toUpdate/{name}")
//    public String toUpdate(Model model,@PathVariable("name") String name){
//        model.addAttribute("song",songService.getSong(name));
//        return "update";
//    }
//
//    @PutMapping
//    public String update(Song song){
//        songService.update(song);
//        return "redirect:/song";
//    }
}
