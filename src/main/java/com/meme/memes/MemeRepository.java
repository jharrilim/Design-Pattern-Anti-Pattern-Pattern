package com.meme.memes;

import java.util.List;

/**
 * MemeRepository
 */
public interface MemeRepository {

    List<Meme> getMemes();

    Meme getMemeById(String id);
}
