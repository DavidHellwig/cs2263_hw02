package edu.isu.cs.cs2263.adapter;
import java.util.*;

public class PushbackTokenizerImplementation implements PushbackTokenizer{

    private StringTokenizer stringTokenizer;

    private String lastToken;

    private ArrayList<String> list;

    public PushbackTokenizerImplementation(String string){

        stringTokenizer = new StringTokenizer(string);

        list = new ArrayList<String>();
    }
    @Override
    public String nextToken() {
        if(list.size() > 0){
            return list.remove(list.size()-1);
        }

        lastToken = stringTokenizer.nextToken();

        return lastToken;
    }

    @Override
    public boolean hasMoreTokens() {

        return stringTokenizer.hasMoreTokens();
    }

    @Override
    public void pushback() {

        list.add(lastToken);
    }
}
