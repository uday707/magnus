package se.magnus.api.core.review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ReviewService {

  /**
   * curl -X POST $HOST:$PORT/review \
   *   -H "Content-Type: application/json" --data \
   *   '{"productId":123,"reviewId":456,"author":"me","subject":"yada, yada, yada","content":"yada, yada, yada"}'
   * 
   */
  @PostMapping(value = "/review",
               consumes = "application/json",
               produces = "application/json")
  public Review createReview(@RequestBody Review review);

  /**
   * Sample Usage: curl $HOST:$PORT/review?productId=1
   *
   * @param productId
   * @return list of review items
   */
   @GetMapping(
     value = "/review",
     produces = "application/json")
   List<Review> getReviews(@RequestParam(value = "productId", required=true) int productId);

  /**
   *   Sample Usage:
   *   curl -X DELETE $HOST:$PORT/review?productId=1
   * 
   *   @param productId
   */
  @DeleteMapping(value = "/reivew")
  public void deleteReviews(@RequestParam(value = "productId", required = true) int productId);
  
}
