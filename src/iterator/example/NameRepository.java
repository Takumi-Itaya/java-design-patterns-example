package iterator.example;

public class NameRepository implements Container {
  public String[] names = {"John", "Jane", "Jack", "Jill"};

  @Override
  public Iterator getIterator() {
    return new NameIterator();
  }

  private class NameIterator implements Iterator {
    int index;

    @Override
    public boolean hasNext() {
      return index < names.length;
    }

    @Override
    public Object next() {
      if (this.hasNext()) {
        return names[index++];
      }
      return null;
    }
  }
} 