package com.thevirtugroup.postitnote.repository;


import com.thevirtugroup.postitnote.model.Note;
import com.thevirtugroup.postitnote.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NoteRepository {

    private Note defaultNote;

    public NoteRepository() {
        defaultNote = new Note(111l, "Say Hello", "Hello world");
    }

    public List<Note> findAll(){
        List<Note> list = new ArrayList<>();
        list.add(new Note(111l, "Hello Notes", "1- Hello world"));
        list.add(new Note(222l, "I am From Backend", "2- Hello world"));
        list.add(new Note(333l, "Sample Notes", "3- Hello world"));
        return list;
    }

}
