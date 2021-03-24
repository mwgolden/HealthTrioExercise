package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App
{
    public static void main( String[] args ) throws IOException {
        String url = "https://dashboard.healthit.gov/api/open-api.php?source=AHA_2008-2015.csv";
        RestClient rc = new RestClient(url);
        Map<String, String> params = new HashMap<String, String>();
        params.put("period", "2014");
        params.put("sort", "pct_hospitals_basic_ehr_notes");
        params.put("sort_dir", "desc");
        try {
            String response = rc.get(params);
            ObjectMapper mapper = new ObjectMapper();
            HealthITAPI[] responseObjects = mapper.readValue(response, HealthITAPI[].class);
            System.out.println(String.format("%-25s %s", "State", "Percentage"));
            for(HealthITAPI obj: responseObjects){
                System.out.println(String.format("%-25s%.0f%%", obj.getRegion(), obj.getPctHospitalsBasicEhrNotes()));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
