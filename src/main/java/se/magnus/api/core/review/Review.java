package se.magnus.api.core.review;


public class Review {

    private int productId;
    private int reviewId;
    private String author;
    private String subject;
    private String content;
    private String serviceAddress;

    public Review() {
       this.productId = 0;
       this.reviewId = 0;
       this.author = null;
       this.subject = null;
       this.content = null;
       this.serviceAddress = null;
    }

    public Review(int productId, int reviewId, String author, String subject, String content, String serviceAddress) {
       this.productId = productId;
       this.reviewId = reviewId;
       this.author = author;
       this.subject = subject;
       this.content = content;
       this.serviceAddress = serviceAddress;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getReviewId() {
        return this.reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
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
