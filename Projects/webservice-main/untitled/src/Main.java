import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        //JAVA OBJECT AND CONVERTING TO A JSON OBJECT
        Book book1 = new Book("A", "A writer");
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(book1);
            System.out.println("ResultingJSONstring = " + json);

            Book bookConverted = mapper.readValue(json, Book.class);
            System.out.println("after converting to java");
            System.out.println(bookConverted);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}