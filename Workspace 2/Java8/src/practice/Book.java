package practice;

public class Book {
private String name;
private int price;

public Book(String name,int price)
{
	this.name=name;
	this.price=price;
}
public String getName()
{
	return this.name;
}
public int getPrice()
{
	return this.price;
}
public boolean equals(final Object obj) {
    if (obj == null) {
       return false;
    }
    final Book book = (Book) obj;
    if (this == book) {
       return true;
    } else {
       return (this.name.equals(book.name) && this.price == book.price);
    }
  }
}
