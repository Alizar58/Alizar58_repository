import java.util.*;
import java.text.*;
import java.lang.*;
// классы для работы с
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// КЛАСС LibraryManager
public class LibraryManager {
    private BookS[] books;
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/library";
    private static final String user = "admin";
    private static final String password = "User_mysql0$";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public LibraryManager(int size) {
        books = new BookS[size];
    }

    public static void main(String[] args) throws ParseException{
        LibraryManager lb = new LibraryManager(10);
        lb.testLibrary();
    }

    boolean addBook(BookS book, Statement stmt, ResultSet rs)   throws SQLException{
        int a_id = getAuthorId(book.author.authorName , book.author.birthDate , stmt);
        SetGenre(book.genre, stmt);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String bookingDate = sdf.format(book.author.birthDate);
        int result = 0;
        String query = "select id from book where bookName = '"+book.title+"' AND author_id = "+String.valueOf(a_id);
        System.out.println(query);
        rs = stmt.executeQuery(query);
        while (rs.next()) {
            result = rs.getInt("id");
            System.out.println("id : " + result);
        }

        if (result == 0) {
            query = "insert into book (bookName, \n" +
                    "author_id,\n" +
                    "genre, \n" +
                    "ISBN,  \n" +
                    "printDate) values ('" + book.title + "'," + String.valueOf(a_id) + ",'" + book.genre + "','" + book.ISBN + "', DATE('"+bookingDate+"'))";
            System.out.println(query);
            stmt.execute(query);
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;
            }
        }
        return false;
    }

    boolean deleteBook(int index) {
        boolean result = books[index] != null;
        books[index] = null;
        return result;

    }

    BookS getBook(int index) {
        return books[index];
    }

    int getAuthorId(String aName, Date birDate, Statement stmt )  throws SQLException{
        ResultSet rs;
        int a_id=0,result=0;
        System.out.println(birDate);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String bookingDate = sdf.format(birDate);
        String query = "select id from author where authorName = '"+aName+"'";
        System.out.println(query);
        rs = stmt.executeQuery(query);
        while (rs.next()) {
            result = rs.getInt("id");
            System.out.println("id : " + result);
        }
        //int result = rs.getRow ();
        //System.out.println(result);
        if (result > 0){
            a_id = result;
        }else
        {
            query = "SET FOREIGN_KEY_CHECKS = 0";
            stmt.execute(query);
            query = "insert into author (authorName,  \n" +
                    "birthDate) values ('"+aName+"',DATE('"+bookingDate+"')"+")";
            System.out.println(query);
            stmt.execute(query);

            query = "select id from author where authorName = '"+aName+"'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                a_id = rs.getInt("id");
                System.out.println("id : " + a_id);
            }
            //a_id = rs.getInt("id");
        }
        return a_id;
    }
    void SetGenre(String nameGenre, Statement stmt)  throws SQLException{
        ResultSet rs;
        String result = "";
        String query = "select genreName from genre where genreName = '"+nameGenre+"'";
        rs = stmt.executeQuery(query);
        while (rs.next()) {
            result = rs.getString("genreName");
        }
        if (result == "") {
            query = "insert into genre (genreName) values ('"+nameGenre+"')";
            System.out.println(query);
            stmt.execute(query);
        }

    }
    void testLibrary() throws ParseException{
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

        Author a1=new Author("Author1","1953-01-01");
        BookS b1=new BookS("Name1", a1, "SCIENCE", "Number1", "2013-01-15");
        Author a2=new Author("Author2","1963-02-02");
        BookS b2=new BookS("Name2", a2, "BELLETRE", "Number2", "2014-01-15");
        Author a3=new Author("Author3","1973-03-03");
        BookS b3=new BookS("Name3", a3, "PHANTASY", "Number3", "2015-01-15");
        Author a4=new Author("Author4","1983-04-04");
        BookS b4=new BookS("Name4", a4, "SCIENCE_FICTION", "Number4", "2016-01-15");
        addBook(b1, stmt, rs);
        addBook(b2, stmt, rs);
        addBook(b3, stmt, rs);
        addBook(b4, stmt, rs);

        System.out.println("after adding");
        System.out.println(this);
        deleteBook(1);
        deleteBook(4);

        System.out.println("after removing");
        System.out.println(this);

            // executing SELECT query
           /*
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Total number of books in the table : " + count);
            }
*/
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }

    }

    @Override
    public String toString() {
        return "LibraryManager [books=" + Arrays.toString(books) + "]";
    }
}
class BookS {
    String title;
    Author author;
    String genre;
    String ISBN;
    Date printDate;

    //Book() {
    //this("Java  \nМетоды программирования", "И.Н. Блинов, \nВ.С. Романчик", "Учебно-методическое пособие", "978-985-7058-30-3",2013);
    //}

    BookS(String bookName, Author bookAuthor, String bookGenre, String bookISBN, String year) throws ParseException{
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd", new Locale("ru"));
        title = bookName;
        author = bookAuthor;
        genre = bookGenre;
        ISBN = bookISBN;
        printDate = ft.parse(year);
    }

    @Override
    public String toString () {
        return "Book [title=" + title + ", author=" + author.authorName + ", genre=" + genre + ", ISBN=" + ISBN + ", publishYear=" + printDate + ", ]";
    }
}

class Author{
    Integer id;
    String authorName;
    Set<BookS> books;
    Date birthDate;

    Author(String Name, String birthDat) throws ParseException{
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd", new Locale("ru"));
        authorName = Name;
        birthDate = ft.parse(birthDat);
        //books.add(oBooks);
    };
}
enum Genre
{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}