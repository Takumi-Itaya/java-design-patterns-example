package composite.example;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
  private String name;
  private List<FileSystemComponent> children;

  public Directory(String name) {
    this.name = name;
    this.children = new ArrayList<>();
  }

  public void add(FileSystemComponent component) {
    children.add(component);
  }

  public void remove(FileSystemComponent component) {
    children.remove(component);
  }

  @Override
  public void print(String indent) {
    System.out.println(indent + "Directory: " + name);
    for (FileSystemComponent component : children) {
      component.print(indent + "  ");
    }
  }

  @Override
  public int getSize() {
    int totalSize = 0;
    for (FileSystemComponent component : children) {
      totalSize += component.getSize();
    }
    return totalSize;
  }
}