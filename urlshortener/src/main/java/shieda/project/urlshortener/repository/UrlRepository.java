package shieda.project.urlshortener.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import shieda.project.urlshortener.entities.UrlEntity;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}