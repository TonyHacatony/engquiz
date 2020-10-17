package rest.api.controller;

import rest.api.entity.Word;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class WordController {

    private static final String template = "You create a new word, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final Collection<Word> words = new ArrayList<>();

    @GetMapping
    public Collection<Word> getAll(){
        return words;
    }

    @GetMapping("/word")
    public Word word(@RequestParam(value = "name", defaultValue = "empty") String name) {
        Word word = new Word(counter.incrementAndGet(), String.format(template, name));
        words.add(word);
        return word;
    }

    @GetMapping("/empty")
    public Word empty() {
        return new Word(counter.incrementAndGet(), String.format(template, "empty"));
    }
}