package edu.isu.cs.cs2263;


import com.google.gson.Gson;

import java.io.File;
import java.util.List;

public class IOManager {
    public List readData(File filename){
        Gson gson = new Gson();
        String json = filename.getName();
        List studentList = gson.fromJson(json, List.class);
        return studentList;


    }
    public void writeData(File filename, List<Student> studentlist){
        Gson gson = new Gson();
        gson.toJson(studentlist);

    }
}
