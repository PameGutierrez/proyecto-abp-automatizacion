package utils;

import org.testng.annotations.DataProvider;
import java.io.*;
import java.util.*;

public class CsvDataProvider {
  @DataProvider(name="userData")
  public static Object[][] loadFromCsv() throws Exception {
    List<Object[]> rows = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader("src/test/resources/testdata.csv"))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] cols = line.split(",");
        rows.add(new Object[]{cols[0], cols[1], cols[2]});
      }
    }
    return rows.toArray(new Object[0][]);
  }
}
