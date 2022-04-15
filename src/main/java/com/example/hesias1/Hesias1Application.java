package com.example.hesias1;

import com.example.hesias1.service.AnimeService;
import com.example.hesias1.service.dto.AnimeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Date;

@SpringBootApplication
public class Hesias1Application {

    public static void main(String[] args) {
        SpringApplication.run(Hesias1Application.class, args);
    }

    @Autowired
    AnimeService animeService;

    @EventListener(ApplicationReadyEvent.class)
    public void createDefaultData() {
        AnimeDTO animeDTO = new AnimeDTO();
        animeDTO.setTitle("My Hero Academia");
        animeDTO.setDebutDate(new Date().toString());
        animeDTO.setEndDate(new Date().toString());
        animeDTO.setDescription("The appearance of \"quirks,\" newly discovered super powers, has been steadily increasing over the years, with 80 percent of humanity possessing various abilities from manipulation of elements to shapeshifting. This leaves the remainder of the world completely powerless, and Izuku Midoriya is one such individual.");
        animeDTO.setCoverUrl("https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/nx21459-oZMZ7JwS5Sxq.jpg");
        animeDTO.setEpisodes(24);
        animeDTO.setDuration(20.0);

        for(int i = 0; i< 10; i++) {
            this.animeService.create(animeDTO);
        }
    }
}