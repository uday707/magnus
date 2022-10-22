package se.magnus.api.core.recommendation;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

public interface RecommendationService {

   /**
    * 
    *  curl -X POST $HOST:$PORT/recommendation \
    *   -H "Content-Type: application/json" --data \
    *   '{"productId":123,"recommendationId":456,"author":"me","rate":5,"content":"yada, yada, yada"}'
    * 
    */
   @PostMapping(value = "/recommendation",
                 consumes = "application/json",
                 produces = "application/json")
   Recommendation createRecommendation(@RequestBody Recommendation body);

   /**
     *  Sample Usage: curl $HOST:$PORT/recommendation?productId=1
     * 
     *  @param productId
     *  @return List of recommendations
     */
     @GetMapping(
        value = "/recommendation",
        produces = "application/json")
     List<Recommendation> getRecommendations(@RequestParam(value = "productId", required = true) int productId);

     /**
      * Sample Usage:
      *  
      *  curl -X DELETE $HOST:$PORT/recommendation?productId=1
      *
      * @param productId
      */
     @DeleteMapping(value = "/recommendation")
     void deleteRecommendations(@RequestParam(value = "productId", required = true) int productId);
}
