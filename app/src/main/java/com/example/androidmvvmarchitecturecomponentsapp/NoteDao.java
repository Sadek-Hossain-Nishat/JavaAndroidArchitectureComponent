package com.example.androidmvvmarchitecturecomponentsapp;


import androidx.lifecycle.LiveData;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDao {

    @Insert
    void insert(Note note);


    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    @Query(value ="delete from note_table")
    void deleteAllNotes();

    @Query(value = "select * from note_table order by priority desc")
    LiveData<List<Note>> getAllNotes();



}
