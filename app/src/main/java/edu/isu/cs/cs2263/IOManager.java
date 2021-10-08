package edu.isu.cs.cs2263;


import com.google.common.io.Files;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class IOManager {
    public List<Student> readData() throws IOException {


        Type listOfStudents = new TypeToken<ArrayList<Student>>() {}.getType();

        JsonReader jsonReader = new JsonReader(new FileReader("data.json"));



        Gson gson = new Gson();
        List<Student> studentList = gson.fromJson(jsonReader, listOfStudents);


        return studentList;


    }
    public void writeData(File filename, List<Student> studentList){



        try {
            FileWriter writer = new FileWriter(filename);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(studentList,writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    }

