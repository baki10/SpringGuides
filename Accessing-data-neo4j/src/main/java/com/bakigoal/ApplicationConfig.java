package com.bakigoal;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;

/**
 * Created by ilmir on 22.07.16.
 */
@Configuration
@EnableNeo4jRepositories
public class ApplicationConfig extends Neo4jConfiguration {

  public ApplicationConfig() {
    setBasePackage("com.bakigoal");
  }

  @Bean
  GraphDatabaseService graphDatabaseService(){
    return new GraphDatabaseFactory().newEmbeddedDatabase("accessingdataneo4j.db");
  }
}
