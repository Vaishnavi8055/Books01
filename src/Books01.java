import java.util.Scanner;
public class Books01 {
    public class Solution {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            Book[] books=new Book[n];
            if(n==0){
                System.out.println("N/A");
            }
            else{
                for(int i=0;i<n;i++){

                    String bookName=sc.nextLine();
                    String authorName=sc.nextLine();
                    long isbnNo=sc.nextInt();
                    books[i]=new Book(bookName,authorName,isbnNo);

                }
                System.out.println("-----------------------------");
                for(int j=0;j<n;j++){
                    System.out.println(books[j]);
                }
                System.out.println("-----------------------------");
            }
            scanner.close();
        }
    }
    public class Book{
        private String bookName;
        private String authorName;
        private long isbnNo;
        public String getBookName(){
            return bookName;
        }
        public String getAuthorName(){
            return authorName;
        }
        public long getISBNNO(){
            return isbnNo;
        }
        public void setBookName(String bookName){
            this.bookName=bookName;
        }
        public void setAuthorName(String authorName){
            this.authorName=authorName;
        }
        public void setISBNNO(long ISBNno){
            this.isbnNo=isbnNo;

        }
        public Book(String bookName,String authorName,long isbnNo){
            this.bookName=bookName;
            this.authorName=authorName;
            this.isbnNo=isbnNo;
        }

        @Override
        public String toString(){
            return String.format("%s/t,%s/t,%d/t",get BookName(),get AuthorName(),get ISBNNO());

        }

    }

        }
