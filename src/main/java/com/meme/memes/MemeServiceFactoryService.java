package com.meme.memes;

import org.springframework.stereotype.Service;

/**
 * MemeServiceFactoryImpl
 */
@Service
public class MemeServiceFactoryService extends AbstractMemeServiceFactoryService {

    @Override
    public MemeService createMemeService() {
        return this.memeService;
    }

}
