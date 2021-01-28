package FRQ.Logs;

public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message){
        int colon = message.indexOf(":");
        machineId = message.substring(0,colon);
        description = message.substring(colon+1);
    }

    public boolean containsWord(String keyword){

        int indexOfKeyword = description.indexOf(keyword);

        if(description.contains(" " + keyword + " ")){
            return true;
        }
        if (description.length()  == keyword.length() && indexOfKeyword == 0) {
            return true;
        }
        if (indexOfKeyword == 0 && description.substring(1, 2).equals(" ")) {
            return true;
        }

        return indexOfKeyword == description.length() - keyword.length() &&
                    description.substring(indexOfKeyword - 1, indexOfKeyword).equals(" ");
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return machineId + ":" + description;
    }
}
