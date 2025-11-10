package main.java.lesson14;

public class PrinterImpl implements Printer {

    @Override
    public void print(Message message) {
        if ((message.getText() == null || message.getText().isEmpty()) &&
                (message.getSender() == null || message.getSender().isEmpty())) {

            Printer emptyHandler = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };

            emptyHandler.print(message);
            return;
        }

        if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }

    public static void main(String[] args) {
        PrinterImpl printer = new PrinterImpl();

        Printer.Message msg1 = new Printer.Message("Привіт!", "Олег");
        Printer.Message msg2 = new Printer.Message("Привіт!!!", "");
        Printer.Message msg3 = new Printer.Message(null, null);

        printer.print(msg1);
        printer.print(msg2);
        printer.print(msg3);
    }
}