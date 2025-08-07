package com.example.demoteams.service;

import com.example.demoteams.model.Calciatore;
import com.example.demoteams.model.Squadra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceTeams
{
    private static final String TEAMS_DIRECTORY = "classpath:/teams/";
    private List<Squadra> squadre;

    public ServiceTeams() throws IOException
    {
        squadre = new ArrayList<>();

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
            squadre.add(squadra);
        }
    }

    public List<Squadra> getAllTeams()
    {
        return squadre;
    }

    public Optional<Squadra> getTeamByName(String nome)
    {
        return squadre.stream().filter(team -> team.getNome().equalsIgnoreCase(nome)).findFirst();
    }

    public List<Calciatore> getAllPlayersByTeamName(String nome)
    {
        Optional<Squadra> squadra = getTeamByName(nome);

        if (squadra.isPresent())
        {
            return squadra.get().getCalciatori();
        }
        else
        {
            throw new RuntimeException("Squadra non trovata!");
        }
    }
}