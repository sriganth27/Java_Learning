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
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


public class AesECBUsinStaticKey {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String plainText = "hello world";
		String key = "mySecret";
		MessageDigest mg = MessageDigest.getInstance("SHA-256");
		byte [] by = mg.digest(key.getBytes(StandardCharsets.UTF_8));
		by = Arrays.copyOf(by, 16);
		String encryptedKey = Base64.getEncoder().encodeToString(by);
		System.out.println(encryptedKey);
		SecretKeySpec sp = new SecretKeySpec(by, "AES");
		String encypted = encrypt(plainText,sp);
		System.out.println(encypted);
		String decypted = decrypt(encypted,sp);
		System.out.println(decypted);

	}

	private static String encrypt(String plainText, SecretKeySpec sp) throws Exception {
		// TODO Auto-generated method stub
		Cipher cp = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cp.init(Cipher.ENCRYPT_MODE,sp);
		byte [] encyptedbytes = cp.doFinal(plainText.getBytes());
		
		return Base64.getEncoder().encodeToString(encyptedbytes);
	}
	private static String decrypt(String encypted, SecretKeySpec key) throws Exception{
		// TODO Auto-generated method stub
		Cipher cp = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cp.init(Cipher.DECRYPT_MODE, key);
		byte [] decryptedBytes = cp.doFinal(Base64.getDecoder().decode(encypted));
		return new String(decryptedBytes);
	}
}
