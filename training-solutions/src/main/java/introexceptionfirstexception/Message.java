package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {
    public static void main(String[] args) {
        Message msg = new Message();
        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101",
                "110", "32", "115", "122", "233", "112", "32",
                "110", "97", "112", "111", "100", "33");
        String message = msg.messageDecoder(codedMessage);
        System.out.println(message);

        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101",
                "103", "121", "32", "104", "105", "98", "225", "115", "32",
                "252", "122", "101", "110", "101", "116", "46");
        message = msg.messageDecoder(anotherCodedMessage);

        System.out.println(message);
    }

    private String messageDecoder(List<String> codedMessage){
        char[] decodedMessage = new char[codedMessage.size()];
        for (int i = 0; i < decodedMessage.length; i++) {
            decodedMessage[i] = (char) Integer.parseInt(codedMessage.get(i));
        }
        return new String(decodedMessage);
    }
}
