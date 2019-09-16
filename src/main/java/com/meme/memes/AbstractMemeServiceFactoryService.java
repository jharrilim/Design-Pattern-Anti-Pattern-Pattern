package com.meme.memes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AbstractMemeServiceFactory
 */
@Service
public abstract class AbstractMemeServiceFactoryService implements MemeServiceFactory {

    @Autowired
    MemeService memeService;

    @Override
    public abstract MemeService createMemeService();
}