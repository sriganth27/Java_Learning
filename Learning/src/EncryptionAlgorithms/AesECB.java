package EncryptionAlgorithms;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AesECB {

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
		// TODO Auto-generated method stub
		String plainText = "hello world";
		String encValue = "b3Ubca7YWtq42TrPsGdYiw==";
		KeyGenerator kg = KeyGenerator.getInstance("AES");
		kg.init(128);
		SecretKey key = kg.generateKey();
		String encypted = encrypt(plainText,key);
		System.out.println("encrpted values is "+encypted );
		String decypted = decrypt(encypted,key);
		System.out.println("decrpted values is "+decypted );
		
		MessageDigest mg = MessageDigest.getInstance("SHA-256");
		byte [] ky = mg.digest(plainText.getBytes(StandardCharsets.UTF_8));
        ky = Arrays.copyOf(ky, 16);
        String encrypVal = Base64.getEncoder().encodeToString(ky);
        System.out.println(" the encrypted value is "+encrypVal);
        SecretKeySpec  ky2 = new SecretKeySpec(ky,"AES");
        String encypted2 = encrypt(plainText,ky2);
		System.out.println("encrpted values is "+encypted2 );
		String decypted2 = decrypt(encypted,ky2);
		System.out.println("decrpted values is "+decypted2 );
	}
	
	private static String decrypt(String encypted, SecretKey key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		// TODO Auto-generated method stub
		Cipher cp = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cp.init(Cipher.DECRYPT_MODE, key);
		byte [] decryptedBytes = cp.doFinal(Base64.getDecoder().decode(encypted));
		return new String(decryptedBytes);
	}

	public static String encrypt(String plainText , SecretKey key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		Cipher cp = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cp.init(Cipher.ENCRYPT_MODE,key);
		byte [] encyptedbytes = cp.doFinal(plainText.getBytes());
		
		return Base64.getEncoder().encodeToString(encyptedbytes);
		
	}

}
