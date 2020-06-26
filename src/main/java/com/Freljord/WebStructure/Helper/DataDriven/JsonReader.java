package com.Freljord.WebStructure.Helper.DataDriven;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class JsonReader {

    public static <T> T fromJSON(final TypeReference<T> type, final String filePath) throws IOException {
        byte[] readElements = Files.readAllBytes(Paths.get(filePath));
        return new ObjectMapper().readValue(readElements, type);
    }

    public static <T> void toJSON(T obj, String filePath) throws IOException {
        new ObjectMapper().writeValue(new File(filePath), obj);
    }
    public static void rotateJson(final TypeReference type, final String filePath, final String fileToJson) throws IOException {

        ArrayList result = (ArrayList) fromJSON(type, filePath);
        ArrayList result2 = (ArrayList) fromJSON(type, fileToJson);
        result2.add(result.remove(0));
        toJSON(result, filePath);
        toJSON(result2, fileToJson);
    }
}