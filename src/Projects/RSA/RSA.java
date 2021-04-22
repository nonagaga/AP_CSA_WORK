package Projects.RSA;

import java.math.BigInteger;
import java.util.ArrayList;

public class RSA {
    int p;
    int q;
    int public_key_modulus;
    int phi;
    ArrayList<Integer> public_keys;
    ArrayList<Integer> private_keys;

    public RSA(int p, int q) {
        this.p = p;
        this.q = q;
        public_key_modulus = p*q;
        //Euler's Totient
        phi = (p-1)*(q-1);
    }

    private static int gcf(int a, int b){
        int greatestFactor = 1;
        if(a%b == 0){
            greatestFactor = b;
        } else {
            greatestFactor = gcf(b, a%b);
        }
        return greatestFactor;
    }

    public ArrayList<Integer> possible_public_keys(){
        public_keys = new ArrayList<Integer>();
        for (int i = 2; i < phi; i++) {
            int factor = gcf(phi,i);
            if (factor == 1) {
                public_keys.add(i);
            }
        }
        return public_keys;
    }

    public ArrayList<Integer> possible_private_keys(int public_key_exponent, int distance){
        private_keys = new ArrayList<Integer>();
        for (int i = 1; i < distance; i++) {
            if (i*public_key_exponent % this.phi == 1){
                private_keys.add(i);
            }
        }
        return private_keys;
    }

    //Encryption = message^public_key_exponent % public_key_modulus
    public BigInteger encrypt(int message, int public_key_exponent){
        BigInteger message_big = BigInteger.valueOf(message);
        BigInteger mod = BigInteger.valueOf(public_key_modulus);
        BigInteger encrypted = message_big.pow(public_key_exponent);
        encrypted = encrypted.mod(mod);
        return encrypted;
    }

    //Decrypt = ciphertext^private_key % public_key_modulus

    public BigInteger decrypt(int encrypted, int privateKey){
        BigInteger encrypted_big = BigInteger.valueOf(encrypted);
        BigInteger decrypting = encrypted_big.pow(privateKey);
        decrypting = decrypting.mod(BigInteger.valueOf(public_key_modulus));
        return decrypting;
    }

    public static void main(String[] args) {
        RSA rsa = new RSA(5,11);
        ArrayList<Integer> public_keys = rsa.possible_public_keys();
        System.out.println("Public Key Modulus: "  + rsa.public_key_modulus);
        System.out.println("Possible Public Key Exponents: " + public_keys);

        System.out.println(rsa.encrypt(67, 39));
        System.out.println(rsa.possible_private_keys(39, 1000));

        System.out.println(rsa.decrypt(67,999));
    }
}
