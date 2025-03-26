package prototype.example;

public class Document implements Prototype {
  private String title;
  private String content;

  public Document(String title, String content) {
    this.title = title;
    this.content = content;
  }

  @Override
  public Prototype clone() {
    try {
      return (Document) super.clone();
    } catch (CloneNotSupportedException e) {
      return new Document(this.title, this.content);
    }
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }
}