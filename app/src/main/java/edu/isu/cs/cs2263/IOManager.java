package edu.isu.cs.cs2263;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IOManager {
    public List readData(File filename){
        Gson gson = new Gson();
        String json = filename.getName();
        List<Student> studentList = gson.fromJson(json, List.class);
        return studentList;


    }
    public void writeData(File filename, List<Student> studentList){
        studentList = new ArrayList<Student>();


        try {
            FileWriter writer = new FileWriter(filename);
            Gson gson = new GsonBuilder().create();
            gson.toJson(studentList,writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    }

