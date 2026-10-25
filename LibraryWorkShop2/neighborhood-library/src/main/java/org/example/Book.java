package org.example;

public class Book {
 public int id;
 public String isbn;
 public String title;
 public boolean isCheckedOut;
 public String checkedOutTo;
public String info;

 public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
  this.id = id;
  this.isbn = isbn;
  this.title = title;
  this.isCheckedOut = isCheckedOut;
  this.checkedOutTo = checkedOutTo;
 }
@Override
public String toString(){

    return "ID: " + id +
 ", ISBN: " + isbn +
         ", Title: " + title +
         ", Checked Out: " + isCheckedOut +
         ", Checked Out To: " + checkedOutTo;
}
 public String getCheckedOutTo() {
  return checkedOutTo;
 }

 public void setCheckedOutTo(String checkedOutTo) {
  this.checkedOutTo = checkedOutTo;
 }

 public boolean isCheckedOut() {
  return isCheckedOut;
 }

 public void setCheckedOut(boolean checkedOut) {
  isCheckedOut = checkedOut;
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public String getIsbn() {
  return isbn;
 }

 public void setIsbn(String isbn) {
  this.isbn = isbn;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public void checkOut(String checkedOutTo) {
 }

 public void checkIn() {

 }
}




