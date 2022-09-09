package com.thevirtugroup.postitnote.rest;

import com.thevirtugroup.postitnote.model.Note;
import com.thevirtugroup.postitnote.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 */
@RestController
public class NoteController
{

    @Autowired
    private NoteRepository repository;

    @RequestMapping(value = "/notes", method = RequestMethod.GET)
    List<Note> all() {

        System.out.println("----------Fetching All notes---------------");
        return repository.findAll();
    }

}
