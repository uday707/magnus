package se.magnus.api.core.recommendation;


public class Recommendation {

    private int productId;
    private int recommendationId;
    private String author;
    private int rate;
    private String content;
    private String serviceAddress;


    public Recommendation() {
       this.productId = 0;
       this.recommendationId = 0;
       this.author = null;
       this.rate = 0;
       this.content = null;
       this.serviceAddress = null;
   }


   public Recommendation(int productId, int recommendationId, String author, int rate, String content, String serviceAddress) {
       this.productId = productId;
       this.recommendationId = recommendationId;
       this.author = author;
       this.rate = rate;
       this.content = content;
       this.serviceAddress =serviceAddress;
   }

   public int getProductId() {
       return this.productId;
   }

   public void setProductId(int productId) {
      this.productId = productId;
   }

   public int getRecommendationId() {
      return this.recommendationId;
   }

   public void setRecommendationId(int recommendationId) {
      this.recommendationId = recommendationId;
   }

   public String getAuthor() {
      return this.author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public int getRate() {
      return this.rate;
   }

   public void setRate(int rate) {
      this.rate = rate;
   }

   public String getContent() {
      return this.content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getServiceAddress() {
      return this.serviceAddress;
   }

   public void setServiceAddress(String serviceAddress) {
      this.serviceAddress = serviceAddress;
   }
}
    
