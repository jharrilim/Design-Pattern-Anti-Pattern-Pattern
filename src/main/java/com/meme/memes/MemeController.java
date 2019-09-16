package com.meme.memes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MemeController
 */
@RestController
public class MemeController {

    @Autowired
    MemeService memeService;

    public MemeController() {
    }

    public MemeController(@Autowired MemeServiceFactory memeServiceFactory) {
        memeService = memeServiceFactory.createMemeService();
    }

    @GetMapping(value="/meme")
    public Meme getMeme() {
        return memeService.getMeme();
    }
}
