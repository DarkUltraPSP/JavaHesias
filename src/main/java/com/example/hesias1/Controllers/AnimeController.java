package com.example.hesias1.Controllers;

import com.example.hesias1.service.AnimeService;
import com.example.hesias1.service.dto.AnimeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @RequestMapping("/animes")
    public ModelAndView getAnimes(@RequestParam(name = "number", required = false) Integer number) {
        ModelAndView mav = new ModelAndView("testHTML");
        List<AnimeDTO> animeDTOS = this.animeService.findAll();
        mav.addObject("anime", animeDTOS);
        mav.addObject("test", "Display le test");
        return mav;
    }
}