package utils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CSVFile {
    private static List<Map<String, String>> data = new ArrayList<>();

    public CSVFile(String csvFilePath){
        try {
            FileReader reader = new FileReader(csvFilePath);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader);
            for (CSVRecord record : records) {
                data.add(record.toMap());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Map<String, String>> getAllData() {
        return data;
    }
}
