package com.meme.memes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MemeServiceImpl
 */
@Service
public class MemeServiceImpl implements MemeService {

    @Autowired
    private MemeRepository memeRepository;

    @Override
    public Meme getMeme() {
        return memeRepository
            .getMemes()
            .stream()
            .findFirst()
            .orElse(new Meme("Nice meme lmao"));
    }
}
