package Projects;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Block {
    private String data;
    private long timeStamp;
    private String hash;
    private String previousHash;
    private int nonce;

    public Block(String data, long timeStamp, String previousHash) {
        this.data = data;
        this.timeStamp = timeStamp;
        this.previousHash = previousHash;
        hash = calculateBlockHash();
    }

    private String calculateBlockHash() {
        String dataToHash = previousHash + String.valueOf(timeStamp) + String.valueOf(nonce) + data;
        MessageDigest digest = null;
        byte[] bytes = null;

        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b:bytes
             ) {
            stringBuffer.append(String.format("%02x",b));
        }
        return stringBuffer.toString();
    }

    public String mineBlock(int difficulty){
        String prefix = new String(new char[difficulty]).replace('\0','0');
        while (!hash.substring(0,difficulty).equals(prefix)){
            nonce++;
            hash = calculateBlockHash();
        }
        return hash;
    }

    public static void main(String[] args) {
        List<Block> blockChain = new ArrayList<>();
        int prefix = 4;

        Block newBlock = new Block("This is a new block", new Date().getTime(), blockChain.get(blockChain.size()-1).hash);

        System.out.print(newBlock.mineBlock(prefix));
    }
}
