package leeseunghee.study.poly.ex.sender;

public class SendMain {

    public static void main(String[] args) {

        final Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};

        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
