package sample.spring.chapter09.bankapp;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories(basePackages = "sample.spring")
@EnableAsync
public class DatabaseConfig {
	@Bean
	public MongoClient mongoClient() {
		MongoCredential mongoCredential = MongoCredential.createCredential("admin", "admin", "secret".toCharArray());
		ServerAddress serverAddress = new ServerAddress("192.168.130.129", 27017);
		return new MongoClient(serverAddress, Arrays.asList(mongoCredential));
	}

	public MongoDbFactory mongoDbFactory() {
		return new SimpleMongoDbFactory(mongoClient(), "test");
	}

	@Bean
	public MongoTemplate mongoTemplate() {
		return new MongoTemplate(mongoDbFactory());
	}
}
