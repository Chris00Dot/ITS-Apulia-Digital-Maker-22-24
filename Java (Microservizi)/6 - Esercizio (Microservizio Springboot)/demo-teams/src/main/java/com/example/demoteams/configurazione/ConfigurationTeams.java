package com.example.demoteams.configurazione;

import com.example.demoteams.model.Calciatore;
import com.example.demoteams.model.Squadra;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class ConfigurationTeams
{
    private static final String TEAMS_DIRECTORY = "classpath:/teams/";

    @Bean
    public Map<String, Squadra> teamsMap() throws IOException
    {
        Map<String, Squadra> teamsMap = new HashMap<>();

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources(TEAMS_DIRECTORY + "*.txt");

        for (Resource resource : resources)
        {
            String filename = resource.getFilename();
            String teamName = filename.substring(0, filename.indexOf('.'));
            List<String> playerRows = Files.readAllLines(Paths.get(resource.getURI()));

            List<Calciatore> calciatori = new ArrayList<>();

            for (String row : playerRows)
            {
                String[] campi = row.split(";");
                String cognome = campi[0];
                String nome = campi[1];
                String ruolo = campi[2];
                int forza = Integer.parseInt(campi[3]);
                calciatori.add(new Calciatore(cognome, nome, ruolo, forza));
            }

            Squadra squadra = new Squadra(teamName, calciatori);
            teamsMap.put(teamName, squadra);
        }

        return teamsMap;
    }
}
