package com.java.streams;

import java.util.stream.Stream;

public class StreamBuilder_1 
{
    public static void main(String[] args) 
    {
        Stream<String> stream  = Stream.<String>builder()
        .add("XML")
        .add("Java")
        .add("CSS")
        .add("SQL")
        .build();
        stream.forEach(System.out::println);
    }
}