package com.meme.memes;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * MemeRepositoryService
 */
@Service
public class MemeRepositoryService implements MemeRepository {

    private static List<Meme> memes = Arrays.asList(new Meme[] {
        new Meme("Lmao nice meme"),
        new Meme("l0l")
    });

    @Override
    public List<Meme> getMemes() {
        return memes;
    }

    @Override
    public Meme getMemeById(String id) {
        return memes
            .stream()
            .filter(meme ->
                meme
                    .getId()
                    .equals(id)
            )
            .findFirst()
            .orElse(new Meme("nice"));
    }

}
