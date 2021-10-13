package edu.isu.cs.cs2263;
/**
 * @author David Hellwig
 */
import com.google.common.reflect.TypeToken;

import com.google.gson.Gson;

import com.google.gson.GsonBuilder;

import com.google.gson.stream.JsonReader;

import java.io.*;

import java.lang.reflect.Type;

import java.util.ArrayList;

import java.util.List;

/**
 * this class object reads and writes information from the provided json file
 */
public class IOManager {
    /**
     *
     * @return returns list of zero or more students from the json data
     * @throws IOException
     * This method reads json data from the json file
     */
    public List<Student> readData() throws IOException {

        /**
         * creates new type of list for class Student
         */
        Type listOfStudents = new TypeToken<ArrayList<Student>>() {}.getType();

        JsonReader jsonReader = new JsonReader(new FileReader("data.json"));



        Gson gson = new Gson();
        List<Student> studentList = gson.fromJson(jsonReader, listOfStudents);


        return studentList;


    }

    /**
     *
     * @param filename name of the json file
     * @param studentList List of students to write to the file
     *This method writes to the json data
     */
    public void writeData(File filename, List<Student> studentList){


        /**
         * writes out provided student list to json file
         */
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

