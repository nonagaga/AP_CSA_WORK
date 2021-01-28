package FRQ.Logs;

import java.util.ArrayList;
import java.util.List;

public class SystemLog {
    private List<LogMessage> messageList;

    public List<LogMessage> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<LogMessage> messageList) {
        this.messageList = messageList;
    }

    public SystemLog(List<LogMessage> messageList) {
        this.messageList = messageList;
    }

    public List<LogMessage> removeMessages(String keyword){
        List<LogMessage> removed = new ArrayList<>();

        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).containsWord(keyword)){
                removed.add(messageList.remove(i));
                i--;
            }
        }

        return removed;
    }

    @Override
    public String toString() {
        String output = "";
        for (LogMessage logMessage:messageList
             ) {
            output += logMessage + "\n";
        }
        return output;
    }

    public static void main(String[] args) {

        ArrayList<LogMessage> messages = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            messages.add(new LogMessage("Hello:World"));
        }

        SystemLog systemLog = new SystemLog(messages);

        System.out.println(systemLog);

        System.out.println(systemLog.removeMessages("World"));

        System.out.println(systemLog);
    }
}

